package com.sahil.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sahil.flightreservation.entities.User;
import com.sahil.flightreservation.repo.UserRepository;

@Controller
public class UserController {
	
	//uer controller
	@Autowired
	private UserRepository userrepository;

	@RequestMapping ("/showReg")
	public String showRegistrationPage() {

		System.out.println("This is the showREG ");
		
		return "login/registerUser";
	}
	

	
	@RequestMapping (value="/registerUser",method =  RequestMethod.POST)
	public String register(@ModelAttribute("user") User user){
		
		userrepository.save(user);
		return "login/login";
		
	}

	
	@RequestMapping (value="/login", method = RequestMethod.POST)
	public String login(@RequestParam ("email")String email,@RequestParam ("password") String password,ModelMap modelmap) {
		
		User user = userrepository.findByEmail(email);
		if (user.getPassword().equals(password)) {
		
			return "findFlights";
		}
		
		else {
			modelmap.addAttribute("msg", "Invalid User name Try Again");
		}
		return "login/login";			
		
	}
	
	
}
