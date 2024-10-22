package com.solvd.eduncan.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "cinema_booking")
@XmlAccessorType(XmlAccessType.FIELD)
public class CinemaBooking {
    @XmlElementWrapper(name = "movies")
    @XmlElement(name = "movie")
    @JsonProperty("movies")
    private List<Movie> movies;

    @XmlElementWrapper(name = "theaters")
    @XmlElement(name = "theater")
    @JsonProperty("theaters")
    private List<Theater> theaters;

    @XmlElementWrapper(name = "screenings")
    @XmlElement(name = "screening")
    @JsonProperty("screenings")
    private List<Screening> screenings;

    @XmlElementWrapper(name = "users")
    @XmlElement(name = "user")
    @JsonProperty("users")
    private List<User> users;

    @XmlElementWrapper(name = "reservations")
    @XmlElement(name = "reservation")
    @JsonProperty("reservations")
    private List<Reservation> reservations;

    // Constructors, getters, and setters
    @Override
    public String toString() {
        return "CinemaBooking{" +
                "movies=" + movies +
                ", theatres=" + theaters +
                ", screenings=" + screenings +
                ", users=" + users +
                ", reservations=" + reservations +
                '}';
    }
}