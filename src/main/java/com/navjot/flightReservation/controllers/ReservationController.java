package com.navjot.flightReservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.navjot.flightReservation.dto.ReservationRequest;
import com.navjot.flightReservation.entities.Flight;
import com.navjot.flightReservation.entities.Reservation;
import com.navjot.flightReservation.repos.FlightRepository;
import com.navjot.flightReservation.service.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired
	FlightRepository flightRepo;
	
	@Autowired
	ReservationService reservationService;
	
	@RequestMapping(value = "/showCompleteReservation", method = RequestMethod.GET)
	public String showCompleteReservaton(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
		
		Flight flight = flightRepo.getOne(flightId);
		modelMap.addAttribute("flight", flight);
		return "completeReservation";
		
	}
	
	@RequestMapping(value = "/completeReservation", method = RequestMethod.POST)
	private String completeReservation(ReservationRequest request, ModelMap modelMap) {
		
		Reservation reservation = reservationService.bookFlight(request);
		modelMap.addAttribute("msg", "Reservation created sucessfully and id is " + reservation.getId());
		return "reservationConfirmation";

	}

}
