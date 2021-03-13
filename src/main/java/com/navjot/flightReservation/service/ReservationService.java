package com.navjot.flightReservation.service;

import com.navjot.flightReservation.dto.ReservationRequest;
import com.navjot.flightReservation.entities.Reservation;

public interface ReservationService {
	
	public Reservation bookFlight(ReservationRequest request);

}
