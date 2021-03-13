package com.navjot.flightReservation.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.navjot.flightReservation.dto.ReservationUpdaterequest;
import com.navjot.flightReservation.entities.Reservation;
import com.navjot.flightReservation.repos.ReservationRepository;

@RestController
@CrossOrigin
public class ReservationRestController {
	
	@Autowired
	ReservationRepository reservationRepo;
	
	@RequestMapping("/reservations/{id}")
	private Reservation findReservation(@PathVariable("id") Long id) {
		
		Optional<Reservation> reservation = reservationRepo.findById(id);
		return reservation.get();
		
	}
	
	@RequestMapping("/reservations")
	public Reservation updateReservation(@RequestBody ReservationUpdaterequest request) {
		
		Reservation reservation = reservationRepo.getOne(request.getId());
		reservation.setCheckedIn(request.getCheckedIn());
		reservation.setNumberOfBags(request.getNumberOfBags());
		
		return reservationRepo.save(reservation);
		
	}

}
