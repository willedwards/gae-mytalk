package com.lumiin.mytalk.integration;

import com.lumiin.mytalk.Application;
import com.lumiin.mytalk.StatusResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

/**
 * Author: wge
 * Date: 01/05/2015
 * Time: 09:27
 */
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@IntegrationTest
@WebAppConfiguration
public class VersionIT
{
    @Test
    public void testVersion() throws IOException
    {
        ResponseEntity<StatusResponse> responseEntity = new TestRestTemplate().getForEntity("http://127.0.0.1:8080/version",
                                                                                            StatusResponse.class
                                                                                            );
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());

        StatusResponse sr = responseEntity.getBody();
        assertEquals("0.1",sr.getData());
     }
}