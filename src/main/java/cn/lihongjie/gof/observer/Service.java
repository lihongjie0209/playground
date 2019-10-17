package cn.lihongjie.gof.observer;

import java.util.List;

public class Service {


    private List<Observer> observers;

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(final List<Observer> observers) {
        this.observers = observers;
    }

    public void doA() {

        System.out.println("动作A发生");
        for (Observer observer : observers) {


            observer.onEvent("ActionA", null);

        }

    }


    public void doB() {


        System.out.println("动作B发生");
        for (Observer observer : observers) {


            observer.onEvent("ActionB", null);

        }

    }
}
