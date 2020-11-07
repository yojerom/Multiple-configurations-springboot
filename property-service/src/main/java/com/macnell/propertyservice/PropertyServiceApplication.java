package com.macnell.propertyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PropertyServiceApplication {
		
	public static void main(String[] args) {	    
		SpringApplication.run(PropertyServiceApplication.class, args);
	    //String result = args[1];
	    //System.out.println("Result: "+result);    
	}

}
