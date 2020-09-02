package com.weblearner.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.weblearner.springboot.model.User;

@Controller
@RequestMapping("/weblearner")
public class HomeController {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView getHomePage() {
		ModelAndView mv = new ModelAndView();
		User user = new User();
		mv.setViewName("registration");
		mv.addObject("user", user);
		return mv;
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public ModelAndView registrationForm(@ModelAttribute("user") User user) {
		ModelAndView mv = new ModelAndView();
		System.out.println("FirstName -->" + user.getFirstName());
		mv.addObject("status", "Successfully Registered");
		mv.setViewName("status");
		return mv;
	}

}
