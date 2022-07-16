package com.nt.cntrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController  // =  Controller + ResponseBody
public class EmpController {
	
	
	@RequestMapping(value = "/health-check", method = RequestMethod.GET)
	public String health_check() {
		return "Hello";
	}

}
