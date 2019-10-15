package cn.lihongjie.gof.factory;

public class AliyunSMSService implements SMSService {

    private static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(AliyunSMSService.class);
    public void sendEmail(final SMSMessage message) {


        logger.info("使用阿里云的短信发送接口");

    }
}
