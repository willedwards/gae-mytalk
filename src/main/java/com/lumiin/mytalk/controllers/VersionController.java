package com.lumiin.mytalk.controllers;

import com.lumiin.mytalk.StatusResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: wge
 * Date: 01/05/2015
 * Time: 09:22
 */

@RestController
public class VersionController
{
    private static final Logger log = LoggerFactory.getLogger(VersionController.class);

    @RequestMapping(value = "/version",
                   method = RequestMethod.GET,
                   produces = "application/json"
    )

    @ResponseBody
    public ResponseEntity<StatusResponse> getVersion()
    {
        log.info("0.1");

        StatusResponse sr = new StatusResponse();
        sr.setData("0.1");

        return new ResponseEntity<>(sr, HttpStatus.OK);
    }
}
