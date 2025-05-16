package com.client.kidschoice.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ReactAppController {


	    @GetMapping(value = { "/", "/{x:[\\w\\-]+}", "/{x:^(?!api$).*$}/*/{y:[\\w\\-]+}" })
	    public ModelAndView getIndex() {
	        ModelAndView mav = new ModelAndView("index");
	        return mav;
	    }

	    //Admin
	    
	    @GetMapping("/Employee/{jwtToken}")
	    public String Employee(@PathVariable("jwtToken") String jwtToken) {
	        return "index";
	    }
	    @GetMapping("/Employee/Dashboard/{jwtToken}")
	    public String DashboardEmployee(@PathVariable("jwtToken") String jwtToken) {
	        return "index";
	    }
	    	
}


