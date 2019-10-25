package cn.lihongjie.gof.singleton;

public class SingletonStaticInnerClass {


    private SingletonStaticInnerClass() {
    }

    private static class SingletonHelper {
        private static final SingletonStaticInnerClass INSTANCE = new SingletonStaticInnerClass();
    }

    public static SingletonStaticInnerClass getInstance() {


        return SingletonHelper.INSTANCE;
    }

}
