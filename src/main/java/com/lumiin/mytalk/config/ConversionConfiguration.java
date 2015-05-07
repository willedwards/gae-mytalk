package com.lumiin.mytalk.config;

import com.fasterxml.jackson.databind.util.Converter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ch on 5/6/2015.
 */
@Configuration
public class ConversionConfiguration {

    @Bean (name="conversionService")
    public ConversionService getConversionService() {
        ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
        bean.setConverters(getConverters());
        bean.afterPropertiesSet();
        ConversionService object = bean.getObject();
        return object;
    }

    private Set<Converter> getConverters() {
        Set<Converter> converters = new HashSet<Converter>();

        //converters.add(new AddressToStringConverter());
        //converters.add(new StringToAddressConverter());

        return converters;
    }
}
