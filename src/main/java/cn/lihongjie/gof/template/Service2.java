package cn.lihongjie.gof.template;


public class Service2 extends AbstractService {
    @Override
    protected void doA() {

        System.out.println("使用本地实现");
    }

    @Override
    protected void doB() {

        System.out.println("使用本地实现");
    }

    @Override
    protected void whenError(final Exception e) {

        System.out.println("清理数据");
    }
}
