package com.lumiin.mytalk.integration.model;

import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;
import com.lumiin.mytalk.Application;
import com.lumiin.mytalk.model.CityModel;
import com.lumiin.mytalk.model.CityStatus;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ch on 5/3/2015.
 */
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class CityModelTest {

    @Autowired
    CityModel model;

    private static final LocalServiceTestHelper helper = new LocalServiceTestHelper(new LocalDatastoreServiceTestConfig() );
    @BeforeClass
    public static void setUp() {
        helper.setUp();
    }

    @AfterClass
    public static void tearDown() {
        helper.tearDown();
    }

    @Test
    public void testCreate() throws Exception {
        Assert.assertEquals(CityStatus.CREATED, model.create("cityname", "citycode"));
    }
}