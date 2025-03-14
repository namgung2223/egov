package com.test.testGov.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration
@PropertySource("classpath:/config/config-${spring.profiles.active:local}.properties") // 자동으로 local 또는 prd 로드
public class RootConfig {

    @Bean
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver resolver = new CommonsMultipartResolver();
        resolver.setMaxUploadSize(1000000000); // 1GB
        return resolver;
    }

    @Bean
    @Profile("local")
    public static PropertyPlaceholderConfigurer localPropertyConfigurer() {
        PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();
        configurer.setLocation(new ClassPathResource("/config/config-local.properties"));
        configurer.setFileEncoding("UTF-8");
        configurer.setIgnoreUnresolvablePlaceholders(true);
        return configurer;
    }

    @Bean
    @Profile("prd")
    public static PropertyPlaceholderConfigurer prdPropertyConfigurer() {
        PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();
        configurer.setLocation(new ClassPathResource("/config/config-prd.properties"));
        configurer.setFileEncoding("UTF-8");
        configurer.setIgnoreUnresolvablePlaceholders(true);
        return configurer;
    }
}
