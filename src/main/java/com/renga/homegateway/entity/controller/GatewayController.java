package com.renga.homegateway.entity.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class GatewayController {
    @GetMapping("/hello")
    public String sayHello(){
      log.info("GatewayController - inside sayHello ...");
        return "Hello!!! Welcome to Renga's gateway!!!";
    }
}
