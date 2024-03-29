package com.yuvaraj.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

    @Value("${owner.name}")
    private String ownerName;

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
	
    @GetMapping("/owner")
    public String getOwner() {
        return "Owner Name: " + ownerName;
    }

}
