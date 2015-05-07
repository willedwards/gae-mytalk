package com.lumiin.mytalk;

import com.lumiin.mytalk.dto.CityDTO;
import com.lumiin.mytalk.model.City;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;

/**
 * Author: wge
 * Date: 01/05/2015
 * Time: 09:09
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application
{

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    class CityConverter implements ConversionService{

        @Override
        public boolean canConvert(Class<?> sourceType, Class<?> targetType)
        {
            return true;
        }

        @Override
        public boolean canConvert(TypeDescriptor sourceType, TypeDescriptor targetType)
        {
            return true;
        }

        @Override
        public <T> T convert(Object source, Class<T> targetType)
        {
            City c = new City();
            if(targetType == City.class){

                CityDTO conv =  (CityDTO)source;


                c.setActive(conv.getActive());
                c.setCityCode(conv.getCityCode());
                c.setCityName(conv.getCityName());

            }

            return (T) c;
        }

        @Override
        public Object convert(Object source, TypeDescriptor sourceType, TypeDescriptor targetType)
        {
            return null;
        }
    }

}
