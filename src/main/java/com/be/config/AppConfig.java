package com.be.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@ComponentScan(basePackages = {"com.be.business"})
@Import({DbConfig.class})
public class AppConfig {


}
