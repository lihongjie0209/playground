package cn.lihongjie.pool;

public interface PooledObject<T> {


    public T get();


    public int getState();


    void borrow();

    void returnObject();
}
