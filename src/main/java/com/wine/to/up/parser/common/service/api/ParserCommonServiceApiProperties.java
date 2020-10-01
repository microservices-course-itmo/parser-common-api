package com.wine.to.up.parser.common.service.api;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Defines values from properties. Can be autowired as a regular class
 */
@SuppressWarnings("SpringPropertySource")
@PropertySource("classpath:application-parser-common-service-api-${spring.profiles.active:local}.properties")
@ConfigurationProperties(prefix = "parser.common.service.api")
@Setter
@Component
@Getter
public class ParserCommonServiceApiProperties {
    private String host;
}