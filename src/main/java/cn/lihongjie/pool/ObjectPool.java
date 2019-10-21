package cn.lihongjie.pool;

public interface ObjectPool<T> {


    public void addObject(T t);
    public void removeObject(T t);
    public T borrow();
    public void returnObject(T t);
    int getNumActive();
    int getNumIdle();
    public void clear();


}
