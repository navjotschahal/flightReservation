package com.navjot.flightReservation.controllers;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.navjot.flightReservation.entities.User;
import com.navjot.flightReservation.repos.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping("/showRegistration")
	public String showRegistrationPage() {
		
		return "login/registerUser";
		
	}
	
	@RequestMapping("/showLogin")
	public String showLoginPage() {
		
		return "login/login";
		
	}
	
	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String register(@ModelAttribute("user") User user) {
		LOGGER.info("Inside String com.navjot.flightReservation.controllers.UserController.register(@ModelAttribute(value=\"user\") User {})", user);
		userRepo.save(user);
		return "login/login";
		
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("email") String email, @RequestParam("password") String password, ModelMap modelMap) {
//		LOGGER.error("Error");
//		LOGGER.warn("Warn");
//		LOGGER.info("Info");
//		LOGGER.debug("Debug");
//		LOGGER.trace("Trace");
		User user = userRepo.findByEmail(email);
		if (user != null && user.getPassword().equals(password)) {
			return "findFlights";
		} else {
			modelMap.addAttribute("msg", "Invalid credentials! Please try again.");
		}
		return "login/login";
		
	}

}
