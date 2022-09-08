package com.example.airline_lab.services;

import com.example.airline_lab.models.Passenger;
import com.example.airline_lab.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassengerService {

    @Autowired
    PassengerRepository passengerRepository;

    // Add a new passenger
    public Passenger addNewPassenger(Passenger passenger) {
        passengerRepository.save(passenger);
        return passenger;
    }

    // Display details of all passengers
    public List<Passenger> getAllPassengers() {
        return passengerRepository.findAll();
    }

    // Display details of a specific passenger
    public Optional<Passenger> getPassengerById(Long id) {
        return passengerRepository.findById(id);
    }

}
