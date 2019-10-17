package cn.lihongjie.gof.observer;

public class ServiceEventLogger implements Observer {
    @Override
    public void onEvent(final String eventType,
                        final Object eventData) {


        System.out.println(eventType);

    }
}
