package com.lumiin.mytalk.dao;

import com.lumiin.mytalk.Application;
import com.lumiin.mytalk.dto.CityDTO;
import com.lumiin.mytalk.model.City;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Author: wge
 * Date: 07/05/2015
 * Time: 23:02
 */
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class CityHelperServiceTest
{

    @Autowired
    CityHelperService cityHelperService;



    @Test
    public void testToEntity() throws Exception
    {
        CityDTO cityDTO = new CityDTO();
        cityDTO.setCityName("name");
        cityDTO.setCityCode("code");
        cityDTO.setActive(true);


        City city = cityHelperService.toEntity(cityDTO);

        City expected = new City();
        expected.setCityName("name");
        expected.setCityCode("code");
        expected.setActive(true);

        assertEquals(expected, city);

    }
}