package com.sahil.flightreservation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sahil.flightreservation.entities.Passenger;


public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
