package com.solvd.eduncan.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.*;

@JsonRootName(value = "theater")
@XmlRootElement(name = "theater")
@XmlAccessorType(XmlAccessType.FIELD)
public class Theater {
    @XmlElement(name = "theater_id")
    @JsonProperty("theater_id")
    private int theaterId;

    @XmlElement
    @JsonProperty("name")
    private String name;

    @XmlElement
    @JsonProperty("location")
    private String location;

    // Constructors, getters, and setters
    @Override
    public String toString() {
        return "Theatre{" +
                "theatreId=" + theaterId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}