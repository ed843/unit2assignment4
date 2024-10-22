package com.solvd.eduncan.parsers;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.solvd.eduncan.models.CinemaBooking;

import java.io.File;
import java.io.IOException;

public class JacksonJsonParser {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            CinemaBooking cinemaBooking = objectMapper.readValue(new File("src/main/resources/cinema_booking.json"), CinemaBooking.class);
            System.out.println(cinemaBooking);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
