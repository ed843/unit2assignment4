package com.solvd.eduncan.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "user")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName(value = "user")
public class User {
    @XmlElement(name = "user_id")
    @JsonProperty("user_id")
    private int userId;

    @XmlElement
    @JsonProperty
    private String username;

    @XmlElement
    @JsonProperty
    private String email;

    // Constructors, getters, and setters
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}