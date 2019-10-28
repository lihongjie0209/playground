package cn.lihongjie.gof.observer;

/**
 * 把相应事件的逻辑提取出来 （分）
 *
 * 把事件监听注册到被提取类中 (合)
 */
public class ServiceEventLogger implements Observer {
    @Override
    public void onEvent(final String eventType,
                        final Object eventData) {


        System.out.println(eventType);

    }
}
