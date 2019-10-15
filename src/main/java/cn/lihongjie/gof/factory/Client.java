package cn.lihongjie.gof.factory;

public class Client {


    public static void main(String[] args) {


        SMSServiceFactory factory = new SMSServiceFactory();



        SMSService defaultSMSService = factory.getDefault();


        defaultSMSService.sendEmail(new SMSMessage());


    }
}
