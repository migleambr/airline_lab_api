package com.example.airline_lab.controllers;

import com.example.airline_lab.services.BookingService;
import com.example.airline_lab.services.FlightService;
import com.example.airline_lab.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @Autowired
    FlightService flightService;

    @Autowired
    PassengerService passengerService;

}
