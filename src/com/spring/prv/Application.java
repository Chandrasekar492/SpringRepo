package com.spring.prv;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Application {
	
	//private HomeSession sess;

	@RequestMapping("/")
	public String getHome(){
	//	System.out.println(sess.getHome());
		return "home";
	}
	
}
