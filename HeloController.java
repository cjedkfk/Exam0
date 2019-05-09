package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		mav.addObject("res");
		return mav;
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public ModelAndView send(
			@RequestParam(value="num1",required=false)String num1,
			@RequestParam(value="num2",required=false)int num2,
			ModelAndView mav) {
		
		int num = Integer.parseInt(num1,num2);
		
		String res = String.valueOf(num);
		
		mav.addObject("res", res);
		mav.setViewName("index");
		return mav;
	}

}
