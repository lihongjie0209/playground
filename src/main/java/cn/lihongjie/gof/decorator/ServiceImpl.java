package cn.lihongjie.gof.decorator;

public class ServiceImpl implements Service {
    private Service service;

    public ServiceImpl(final Service service) {
        this.service = service;
    }

    @Override
    public void doSomething() {
        System.out.println("运行之前做一些事情");

        try {
            service.doSomething();
            System.out.println("运行之后做一些事情");

        } catch (Exception e) {
            System.out.println("异常之后做一些事情");
            throw e;

        }


    }
}
