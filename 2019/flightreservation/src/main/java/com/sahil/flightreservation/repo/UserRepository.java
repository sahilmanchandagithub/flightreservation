package com.sahil.flightreservation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sahil.flightreservation.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
