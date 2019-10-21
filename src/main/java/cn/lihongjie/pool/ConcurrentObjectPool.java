package cn.lihongjie.pool;

import cn.lihongjie.pool.impl.PooledObjectImpl;

import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public class ConcurrentObjectPool<T> implements ObjectPool<T> {

    private Lock lock;
    private LinkedBlockingQueue<PooledObject<T>> idelQueue;

    private HashMap<PooledObject<T>, PooledObject<T>> borrowed;
    private long maxTimeout;


    @Override
    public void addObject(final T t) {

        idelQueue.add(new PooledObjectImpl<>(t, 0));

    }

    @Override
    public void removeObject(final T t) {


        PooledObject<T> object = borrowed.get(wrap(t));

        if (object == null) {

        }



    }

    @Override
    public T borrow() {


        long start = System.currentTimeMillis();
        try {
            lock.tryLock(maxTimeout, TimeUnit.MILLISECONDS);

            long timeLeft = maxTimeout - (System.currentTimeMillis() - start);

            if (timeLeft < 0) {
                throw new RuntimeException("超时了");
            }

            try {

                PooledObject<T> poll = idelQueue.poll(timeLeft, TimeUnit.MILLISECONDS);
                poll.borrow();
                borrowed.put(poll, poll);
                return poll.get();
            } catch (InterruptedException e) {

                Thread.currentThread().interrupt();

                throw new RuntimeException("对象池中没有可用的对象了");

            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("获取锁时间超时");
        } finally {

            lock.unlock();
        }

    }

    @Override
    public void returnObject(final T t) {


        try {
            lock.tryLock();


            PooledObject<T> borrowed = this.borrowed.remove(wrap(t));
            borrowed.returnObject();
            idelQueue.offer(borrowed);
        } finally {

            lock.unlock();
        }


    }

    private PooledObjectImpl<T> wrap(final T t) {
        return new PooledObjectImpl<>(t, 0);
    }

    @Override
    public int getNumActive() {
        return borrowed.size();
    }

    @Override
    public int getNumIdle() {
        return idelQueue.size();
    }

    @Override
    public void clear() {





    }
}
