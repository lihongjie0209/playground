package cn.lihongjie.gof.observer;

import java.util.Arrays;

public class Client {


    public static void main(String[] args) {


        Service service = new Service();

        service.setObservers(Arrays.asList(new ServiceEventLogger()));

        service.doA();
        service.doB();
    }
}
