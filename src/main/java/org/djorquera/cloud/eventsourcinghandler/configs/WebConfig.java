package org.djorquera.cloud.eventsourcinghandler.configs;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
//@EnableWebMvc
@AutoConfigureAfter(DispatcherServletAutoConfiguration.class)
public class WebConfig extends WebMvcConfigurerAdapter{
    public WebConfig() {
        super();
    }
}
