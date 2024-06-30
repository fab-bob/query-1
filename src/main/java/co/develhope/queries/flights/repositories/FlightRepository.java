package co.develhope.queries.flights.repositories;

import co.develhope.queries.flights.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}