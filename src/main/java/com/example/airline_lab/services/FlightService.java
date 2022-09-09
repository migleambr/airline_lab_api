package com.example.airline_lab.services;

import com.example.airline_lab.models.Flight;
import com.example.airline_lab.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    // Add details of a new flight
    public Flight addNewFlight(Flight flight) {
        flightRepository.save(flight);
        return flight;
    }

    // Cancel a flight
    public void cancelFlight(Long flightId) {
        flightRepository.deleteById(flightId);
    }

    // Display all available flights
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    // Display details of a specific flight
    public Optional<Flight> getFlightById(Long flightId) {
        return flightRepository.findById(flightId);
    }

}
