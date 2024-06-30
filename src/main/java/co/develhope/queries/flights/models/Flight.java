package co.develhope.queries.flights.models;


import co.develhope.queries.flights.enums.Status;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String description;

    private String fromAirport;

    private String toAirport;

    @Enumerated(EnumType.STRING)
    private Status status;

    public Flight(String description, String fromAirport, String toAirport) {
        this.description = description;
        this.fromAirport = fromAirport;
        this.toAirport = toAirport;
        this.status = Status.ONTIME;
    }
}
