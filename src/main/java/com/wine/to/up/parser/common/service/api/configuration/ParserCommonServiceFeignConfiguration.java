package com.wine.to.up.parser.common.service.api.configuration;

import com.wine.to.up.parser.common.service.api.ParserCommonServiceApiProperties;
import com.wine.to.up.parser.common.service.api.feign.ParserCommonServiceClient;
import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Example of feign client
 */
@SuppressWarnings("SpringFacetCodeInspection")
@Configuration
@RequiredArgsConstructor
public class ParserCommonServiceFeignConfiguration {
    private final ParserCommonServiceApiProperties parserCommonServiceApiProperties;

    /**
     * Configured feign client
     */
    @Bean
    public ParserCommonServiceClient getCatalogClient() {
        return Feign.builder()
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .client(new OkHttpClient())
                .target(ParserCommonServiceClient.class, "http://" + parserCommonServiceApiProperties.getHost());
    }
}
