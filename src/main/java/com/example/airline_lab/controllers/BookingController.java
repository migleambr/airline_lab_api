package com.example.airline_lab.controllers;

import com.example.airline_lab.models.Booking;
import com.example.airline_lab.models.Flight;
import com.example.airline_lab.models.Passenger;
import com.example.airline_lab.services.BookingService;
import com.example.airline_lab.services.FlightService;
import com.example.airline_lab.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    BookingService bookingService;

    // Book a passenger on to a flight
    @PostMapping
    public ResponseEntity<Booking> bookPassengerToFlight(@RequestParam long passengerId, long flightId) {
        Booking booking = bookingService.bookPassengerToFlight(passengerId, flightId);
        return new ResponseEntity<>(booking, HttpStatus.CREATED);
    }

}
