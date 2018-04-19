package com.th.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;

@Configuration
@EnableScheduling
@ComponentScan(basePackages = {"com.th"}, excludeFilters = @ComponentScan.Filter(Controller.class))
public class RootConfig {

}
