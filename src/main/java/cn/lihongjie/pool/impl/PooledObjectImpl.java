package cn.lihongjie.pool.impl;

import cn.lihongjie.pool.PooledObject;

import java.util.Objects;

public class PooledObjectImpl<T> implements PooledObject<T> {
    private T object;
    private int state;

    public PooledObjectImpl(final T object,
                            final int state) {
        this.object = object;
        this.state = state;
    }

    @Override
    public T get() {
        return object;
    }

    @Override
    public int getState() {
        return state;
    }

    @Override
    public void borrow() {

        this.state = 1;

    }

    @Override
    public void returnObject() {


        if (this.state != 1) {
            throw new RuntimeException("对象不处于 borrow 状态， 无法归还");
        }

        this.state = 0;

    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof PooledObjectImpl)) return false;
        final PooledObjectImpl<?> that = (PooledObjectImpl<?>) o;
        return object.equals(that.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(object);
    }
}
