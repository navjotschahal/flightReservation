package com.navjot.flightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.navjot.flightReservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
