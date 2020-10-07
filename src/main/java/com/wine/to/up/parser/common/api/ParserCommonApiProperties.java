package com.wine.to.up.parser.common.api;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

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
@Setter
@Getter
public class ParserCommonApiProperties {
    @Value("${parser.common.api.parser-wine-position-parsed-events}")
    private String parserWinePositionParsedEvents;
}
