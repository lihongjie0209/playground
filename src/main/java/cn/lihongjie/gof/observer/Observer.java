package cn.lihongjie.gof.observer;

public interface Observer {
    public void onEvent(String eventType, Object eventData);
}
