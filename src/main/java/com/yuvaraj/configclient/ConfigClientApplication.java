package com.yuvaraj.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

    @Value("${mysql.hostname}")
    private String hostName;

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
	
    @GetMapping("/mysql")
    public String getHost() {
        return "Hostname: " + hostName;
    }

}
