package com.kevinraupp.study.localstackAWS.controller;

import com.kevinraupp.study.localstackAWS.configuration.ParameterStoreConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/aws/v1/")
public class ParameterStoreController {
    @Autowired
    private ParameterStoreConfiguration configuration;
    @GetMapping(path = "/Configuration")
    public String configuration(){
        return configuration.getHelloWorld();
    }
}
