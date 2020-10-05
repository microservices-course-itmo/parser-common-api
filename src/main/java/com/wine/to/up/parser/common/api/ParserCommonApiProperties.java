package com.wine.to.up.parser.common.api;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

/**
 * <p>
 *     Defines values from properties. Can be autowired as a regular class
 * </p>
 *
 * @author Maxim Kuznetsov
 * @since 04.10.2020
 */
@PropertySources({
        @PropertySource("classpath:application-common-parser-api.properties"),
        @PropertySource("classpath:application-common-parser-api-${spring.profiles.active:local}.properties")
})
@ConfigurationProperties(prefix = "common.parser.api")
@Setter
@Component
@Getter
public class ParserCommonApiProperties {
    private String messageProductTopicName;
    private String host;
}
