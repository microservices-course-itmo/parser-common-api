package com.wine.to.up.parser.common.api;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;
/**
 * <p>
 *     Defines values from properties. Can be autowired as a regular class
 * </p>
 *
 * @author Maxim Kuznetsov
 * @since 04.10.2020
 */
@Component
@PropertySource("classpath:application-common-parser-api.properties")
@ConfigurationProperties("parser.common.api")
@Setter
@Getter
public class ParserCommonApiProperties {
    @NotEmpty
    private String topicName;
}
