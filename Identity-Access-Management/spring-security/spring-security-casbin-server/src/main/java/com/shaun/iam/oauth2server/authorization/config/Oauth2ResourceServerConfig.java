package com.shaun.iam.oauth2server.authorization.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfiguration;

@Configuration
@EnableResourceServer
public class Oauth2ResourceServerConfig extends ResourceServerConfiguration {
}
