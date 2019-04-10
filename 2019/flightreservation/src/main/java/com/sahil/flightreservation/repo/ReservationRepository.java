package com.sahil.flightreservation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sahil.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
