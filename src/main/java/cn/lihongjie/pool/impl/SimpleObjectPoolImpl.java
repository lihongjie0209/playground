package cn.lihongjie.pool.impl;

import cn.lihongjie.pool.ObjectPool;
import cn.lihongjie.pool.PooledObject;

import java.util.HashMap;
import java.util.Map;

public class SimpleObjectPoolImpl<T> implements ObjectPool<T> {

    public Map<PooledObject<T>, PooledObject<T>> pooledObjectSet;
    private long maxBorrowWaitTime;

    public SimpleObjectPoolImpl() {
        this(-1);
    }

    public SimpleObjectPoolImpl(final long maxBorrowWaitTime) {
        this.maxBorrowWaitTime = maxBorrowWaitTime;
        pooledObjectSet = new HashMap<>();
    }

    @Override
    public void addObject(final T t) {

        PooledObjectImpl<T> e = new PooledObjectImpl<>(t, 0);
        pooledObjectSet.put(e, e);

    }

    @Override
    public void removeObject(final T t) {

        pooledObjectSet.remove(wrap(t));

    }

    private PooledObjectImpl<T> wrap(final T t) {
        return new PooledObjectImpl<>(t, -1);
    }

    @Override
    public T borrow() {
        return doBorrow(maxBorrowWaitTime);
    }

    private T doBorrow(long maxBorrowWaitTime) {

        long start = System.currentTimeMillis();

        while (true) {


            for (Map.Entry<PooledObject<T>, PooledObject<T>> entry : pooledObjectSet.entrySet()) {


                if (entry.getValue().getState() == 0) {

                    entry.getValue().borrow();
                    return entry.getValue().get();
                }

            }


            long time = System.currentTimeMillis() - start;

            if (maxBorrowWaitTime > 0 && time > maxBorrowWaitTime) {
                throw new RuntimeException(String.format("没有找到可用的对象，超时时间 %d", maxBorrowWaitTime));
            }

        }

    }

    @Override
    public void returnObject(final T t) {

        PooledObject<T> object = pooledObjectSet.get(wrap(t));

        if (object == null) {
            throw new RuntimeException("找不到池化对象");
        }

        object.returnObject();

    }

    @Override
    public int getNumActive() {


        return (int) pooledObjectSet.keySet().stream().filter(item -> item.getState() == 1).count();

    }

    @Override
    public int getNumIdle() {
        return (int) pooledObjectSet.keySet().stream().filter(item -> item.getState() == 0).count();

    }

    @Override
    public void clear() {

        pooledObjectSet.clear();

    }
}
