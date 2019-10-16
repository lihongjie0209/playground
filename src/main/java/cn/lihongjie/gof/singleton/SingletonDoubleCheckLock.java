package cn.lihongjie.gof.singleton;

public class SingletonDoubleCheckLock {

    private static volatile  SingletonDoubleCheckLock object;

    public static SingletonDoubleCheckLock getInstance() {

        if (object == null) {

            synchronized (SingletonDoubleCheckLock.class) {

                if (object == null) {

                    object = new SingletonDoubleCheckLock();
                }
            }
        }

        return object;
    }

}
