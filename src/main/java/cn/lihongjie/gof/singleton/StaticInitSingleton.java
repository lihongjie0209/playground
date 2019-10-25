package cn.lihongjie.gof.singleton;

public class StaticInitSingleton {

    private static StaticInitSingleton object;

    private StaticInitSingleton() {
    }

    static {
        object = new StaticInitSingleton();

    }


    public static StaticInitSingleton getInstance() {

        return object;
    }
}
