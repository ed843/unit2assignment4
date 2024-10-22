package com.solvd.eduncan.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlRootElement(name = "reservation")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName(value = "reservation")
public class Reservation {
    @XmlElement(name = "reservation_id")
    @JsonProperty("reservation_id")
    private int reservationId;

    @XmlElement(name = "user_id")
    @JsonProperty("user_id")
    private int userId;

    @XmlElement(name = "screening_id")
    @JsonProperty("screening_id")
    private int screeningId;

    @XmlElement(name = "seat_id")
    @JsonProperty("seat_id")
    private int seatId;

    @XmlElement(name = "reserved_at")
    @XmlSchemaType(name = "dateTime")
    @JsonProperty("reserved_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date reservedAt;

    // Constructors, getters, and setters
    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", userId=" + userId +
                ", screeningId=" + screeningId +
                ", seatId=" + seatId +
                ", reservedAt=" + reservedAt +
                '}';
    }
}