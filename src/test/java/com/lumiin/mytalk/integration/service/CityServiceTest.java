package com.lumiin.mytalk.integration.service;

import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;
import com.lumiin.mytalk.Application;
import com.lumiin.mytalk.model.City;
import com.lumiin.mytalk.service.CityService;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNull;

/**
 * Created by ch on 5/3/2015.
 */
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class CityServiceTest  {

private static final LocalServiceTestHelper helper = new LocalServiceTestHelper(new LocalDatastoreServiceTestConfig() );
     @BeforeClass
        public static void setUp() {
        helper.setUp();
    }

    @AfterClass
    public static void tearDown() {
        helper.tearDown();
    }

    @Autowired
    CityService cityService;

    @Test
    public void testFindByCityCode() throws Exception {

        assertNull(cityService.findByCityCode("someCode"));

        City city = new City();
        city.setCityCode("someCode");

        cityService.create(city);

        Assert.assertEquals(city, cityService.findByCityCode("someCode"));
        Assert.assertEquals(1, cityService.list(City.class).size());

        cityService.delete(City.class, city.getId());

        assertNull(cityService.findByCityCode("someCode"));
        Assert.assertEquals(0, cityService.list(City.class).size());



    }
}