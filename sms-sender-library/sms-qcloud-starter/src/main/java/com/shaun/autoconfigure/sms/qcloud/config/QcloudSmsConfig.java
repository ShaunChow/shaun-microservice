package com.shaun.autoconfigure.sms.qcloud.config;

import com.github.qcloudsms.SmsMultiSender;
import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsVoicePromptSender;
import com.github.qcloudsms.SmsVoiceVerifyCodeSender;
import com.shaun.autoconfigure.sms.qcloud.QcloudSmsProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(QcloudSmsProperties.class)
public class QcloudSmsConfig {

    @Bean
    public SmsSingleSender getSmsSingleSender(QcloudSmsProperties properties) {
        return new SmsSingleSender(properties.appid, properties.appkey);
    }

    @Bean
    public SmsMultiSender getSmsMultiSender(QcloudSmsProperties properties) {
        return new SmsMultiSender(properties.appid, properties.appkey);
    }

    @Bean
    public SmsVoiceVerifyCodeSender getSmsVoiceVerifyCodeSender(QcloudSmsProperties properties) {
        return new SmsVoiceVerifyCodeSender(properties.appid, properties.appkey);
    }

    @Bean
    public SmsVoicePromptSender getSmsVoicePromptSender(QcloudSmsProperties properties) {
        return new SmsVoicePromptSender(properties.appid, properties.appkey);
    }

}
