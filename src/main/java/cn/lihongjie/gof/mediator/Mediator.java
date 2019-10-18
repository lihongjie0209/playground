package cn.lihongjie.gof.mediator;


public interface Mediator {
    public void send(String message, Colleague colleague);
}