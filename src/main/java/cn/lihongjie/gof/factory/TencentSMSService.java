package cn.lihongjie.gof.factory;

public class TencentSMSService implements SMSService {

    private static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(TencentSMSService.class);
    public void sendEmail(final SMSMessage message) {


        logger.info("使用腾讯云的短信发送接口");

    }
}
