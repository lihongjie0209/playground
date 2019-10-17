package cn.lihongjie.gof.template;

public abstract class AbstractService implements Service {
    @Override
    public void doSomeThing() {
        try {

            doA();
            doB();
        } catch (Exception e) {


            whenError(e);
        }


    }

    protected abstract void doA();

    protected abstract void doB();


    protected abstract void whenError(final Exception e);
}
