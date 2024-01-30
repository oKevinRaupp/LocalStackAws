package com.kevinraupp.study.localstackAWS.secretsmanager.controller;

import com.kevinraupp.study.localstackAWS.secretsmanager.configuration.SecretsManagerConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/aws/secret/v1")
public class SecretsManagerController {
    @Autowired
    private SecretsManagerConfiguration configuration;
    @GetMapping(path = "/secretsManagerConfiguration")
    public String configuration(){
        return String.format("%s - %s - %s", configuration.getValor1(),configuration.getValor2(),configuration.getValor3());
    }
}
