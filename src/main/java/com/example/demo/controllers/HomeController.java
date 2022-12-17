package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@RequestMapping("/")
    public String index(
    		@RequestParam(value="name", required=false, defaultValue="human") String name,
    		@RequestParam(value="last_name", required=false, defaultValue=" ") String last_name,
    		@RequestParam(value="time", required=false, defaultValue="1") String time) {
		int times = Integer.parseInt(time);
		String output = "";
		for(int i=0;i<times; i++) {
			output+= String.format("Hello %s %s ", name, last_name);
		}
		
        return output;
    }
}
