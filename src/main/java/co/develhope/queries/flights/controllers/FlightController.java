package co.develhope.queries.flights.controllers;

import co.develhope.queries.flights.models.Flight;
import co.develhope.queries.flights.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @PostMapping
    public List<Flight> create() {
        return flightService.addFlight();
    }

    @GetMapping
    public List<Flight> readAll() {
        return flightService.readAll();
    }
}