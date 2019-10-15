package cn.lihongjie.gof.factory;

public class SMSServiceFactory {


    public SMSService getDefault() {

//        return new AliyunSMSService();
        return new TencentSMSService();

    }
}
