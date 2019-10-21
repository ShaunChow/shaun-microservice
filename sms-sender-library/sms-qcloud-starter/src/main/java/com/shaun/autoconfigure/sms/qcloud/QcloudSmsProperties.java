package com.shaun.autoconfigure.sms.qcloud;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.util.Assert;

@Configuration
@ConfigurationProperties(prefix = "shaun.sms")
public class QcloudSmsProperties {

    public Integer appid;

    public String appkey;

    /**
     * Resolve the config location if set.
     *
     * @param config the config resource
     * @return the location or {@code null} if it is not set
     * @throws IllegalArgumentException if the config attribute is set to an unknown
     *                                  location
     */
    public Resource resolveConfigLocation(Resource config) {
        if (config != null) {
            Assert.isTrue(config.exists(),
                    () -> "Sms configuration does not exist '" + config.getDescription() + "'");
            return config;
        }
        return null;
    }
}
