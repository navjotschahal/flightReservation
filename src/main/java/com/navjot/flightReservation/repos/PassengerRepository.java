package com.navjot.flightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.navjot.flightReservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
