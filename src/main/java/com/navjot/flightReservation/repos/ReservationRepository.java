package com.navjot.flightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.navjot.flightReservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
