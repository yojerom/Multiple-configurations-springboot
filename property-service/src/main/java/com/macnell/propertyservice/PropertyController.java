package com.macnell.propertyservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties(value = CustomProperties.class)
public class PropertyController {
	
	@Autowired
	CustomProperties customProperties;
	
    @GetMapping(value = "/config")
    public CustomProperties getResult() {
	    return customProperties;
    }

}
