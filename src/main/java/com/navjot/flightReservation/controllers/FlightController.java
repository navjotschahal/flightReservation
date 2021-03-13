package com.navjot.flightReservation.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.navjot.flightReservation.entities.Flight;
import com.navjot.flightReservation.repos.FlightRepository;

@Controller
public class FlightController {
	
	@Autowired
	FlightRepository flightRepo;
	
	@RequestMapping(value = "/findFlights", method = RequestMethod.POST)
	public String findFlights(
			@RequestParam("from") String from,
			@RequestParam("to") String to,
			@RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date departureDate1,
			ModelMap modelMap
		) {
		
		List<Flight> flights = flightRepo.findFlights(from, to, departureDate1);
		modelMap.addAttribute("flights", flights);
		
		
		return "displayFlights";
		
	}

}
