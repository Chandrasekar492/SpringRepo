package com.spring.prv;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class App {

	@RequestMapping("/")
	public String getHome(){
		
		return "home";
	}
	
}
