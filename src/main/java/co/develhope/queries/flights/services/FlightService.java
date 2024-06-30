package co.develhope.queries.flights.services;

import co.develhope.queries.flights.models.Flight;
import co.develhope.queries.flights.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    private String generateARandomString(Random random) {
        return random.ints(3, 20, 90) // A-Z ASCII range
                .mapToObj(i -> String.valueOf((char) i))
                .collect(Collectors.joining());
    }

    public List<Flight> addFlight() {
        Random random = new Random();
        List<Flight> flights = IntStream.range(0, 50).mapToObj(i -> {
            Flight flight = new Flight();
            flight.setDescription("Flight " + (i + 1));
            flight.setFromAirport(generateARandomString(random));
            flight.setToAirport(generateARandomString(random));
            return flight;
        }).collect(Collectors.toList());
        return flightRepository.saveAll(flights);
    }


    public List<Flight> readAll() {
        return flightRepository.findAll();
    }
}