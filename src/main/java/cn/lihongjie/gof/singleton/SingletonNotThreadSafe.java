package cn.lihongjie.gof.singleton;

public class SingletonNotThreadSafe {

    private static SingletonNotThreadSafe object;

    private SingletonNotThreadSafe() {
    }

    public static SingletonNotThreadSafe getInstance() {

        if (object == null) {
            object = new SingletonNotThreadSafe();
        }

        return object;
    }

}
