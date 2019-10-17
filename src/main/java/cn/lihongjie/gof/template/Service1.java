package cn.lihongjie.gof.template;

public class Service1 extends AbstractService {


    @Override
    protected void doA() {
        System.out.println("使用外部API");
    }

    @Override
    protected void doB() {

        System.out.println("使用外部API");

    }

    @Override
    protected void whenError(final Exception e) {

        e.printStackTrace();
    }
}
