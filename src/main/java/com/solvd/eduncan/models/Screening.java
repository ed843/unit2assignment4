package com.solvd.eduncan.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.*;
import java.util.Date;

@JsonRootName(value = "screening")
@XmlRootElement(name = "screening")
@XmlAccessorType(XmlAccessType.FIELD)
public class Screening {
    @JsonProperty("screening_id")
    @XmlElement(name = "screening_id")
    private int screeningId;


    @JsonProperty("screening_time")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @XmlElement(name = "screening_time")
    @XmlSchemaType(name = "dateTime")
    private Date screeningTime;

    @XmlElement(name = "movie_id")
    @JsonProperty("movie_id")
    private int movieId;

    @XmlElement(name = "theater_id")
    @JsonProperty("theater_id")
    private int theaterId;

    // Constructors, getters, and setters
    @Override
    public String toString() {
        return "Screening{" +
                "screeningId=" + screeningId +
                ", screeningTime=" + screeningTime +
                ", movieId=" + movieId +
                ", theatreId=" + theaterId +
                '}';
    }
}
