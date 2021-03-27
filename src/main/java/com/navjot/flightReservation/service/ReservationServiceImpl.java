package com.navjot.flightReservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.navjot.flightReservation.dto.ReservationRequest;
import com.navjot.flightReservation.entities.Flight;
import com.navjot.flightReservation.entities.Passenger;
import com.navjot.flightReservation.entities.Reservation;
import com.navjot.flightReservation.repos.FlightRepository;
import com.navjot.flightReservation.repos.PassengerRepository;
import com.navjot.flightReservation.repos.ReservationRepository;
import com.navjot.flightReservation.util.EmailUtility;
import com.navjot.flightReservation.util.PDFGenerator;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Value("${com.navjot.flightReservation.itinerary.dirPath}")
	private String RESERVATIONS_SYS_DIRECTORY ;
	
	@Autowired
	FlightRepository flightRepo;
	@Autowired
	PassengerRepository passengerRepo;
	@Autowired
	ReservationRepository reservationRepo;
	
	@Autowired
	PDFGenerator pdfGenerator;
	@Autowired
	EmailUtility mailUtil;

	@Override
	@Transactional
	public Reservation bookFlight(ReservationRequest request) {
		Long flightId = request.getFlightId();
		Flight flight = flightRepo.getOne(flightId);
		
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getPassengerFname());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setPhone(request.getPassengerPhone());
		passenger.setEmail(request.getPassengerEmail());
		Passenger savedPassenger = passengerRepo.save(passenger);
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(savedPassenger);
		reservation.setCheckedIn(false);
		Reservation savedReservation = reservationRepo.save(reservation);
		
		String filePath = RESERVATIONS_SYS_DIRECTORY + savedPassenger.getId() + ".pdf";
		pdfGenerator.generateItineary(savedReservation, filePath);
		mailUtil.sendItinerary(passenger.getEmail(), filePath);
		return savedReservation;
	}

}
