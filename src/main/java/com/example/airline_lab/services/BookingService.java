package com.example.airline_lab.services;

import com.example.airline_lab.models.Booking;
import com.example.airline_lab.models.Flight;
import com.example.airline_lab.models.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    FlightService flightService;

    @Autowired
    PassengerService passengerService;

    // Book a passenger on to a flight
    public Booking bookPassengerToFlight(long passengerId, long flightId) {
        Passenger passenger = passengerService.getPassengerById(passengerId).get();
        Flight flight = flightService.getFlightById(flightId).get();
        List<Passenger> passengers = flight.getPassengers();
        passengers.add(passenger);
        flight.addPassenger(passenger);
        return new Booking(String.format("Passenger with id %d was successfully booked onto flight id %d!",
                passenger.getId(), flight.getId()));
    }

}
