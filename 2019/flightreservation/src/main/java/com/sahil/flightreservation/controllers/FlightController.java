package com.sahil.flightreservation.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sahil.flightreservation.entities.Flight;
import com.sahil.flightreservation.repo.FlightRepository;

@Controller
public class FlightController {
	
	
	@Autowired
	 FlightRepository flightrepository;

	@RequestMapping ("findFlights")
	public String findFlights(@RequestParam("from")String from,@RequestParam("to")String to,@RequestParam("departureDate") 
	@DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate,ModelMap modelmap) {

    List <Flight> flights = flightrepository.findFlights(from, to, departureDate);
 	modelmap.addAttribute("flights", flights);
    
 	return "displayFLights";
	
	}
	

	

}
