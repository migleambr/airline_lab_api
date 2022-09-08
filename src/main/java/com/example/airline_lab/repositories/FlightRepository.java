package com.example.airline_lab.repositories;

import com.example.airline_lab.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
