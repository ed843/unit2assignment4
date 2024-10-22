package com.solvd.eduncan.parsers;

import com.solvd.eduncan.models.CinemaBooking;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXBXmlParser {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(CinemaBooking.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        CinemaBooking cinemaBooking = (CinemaBooking) unmarshaller.unmarshal(new File("src/main/resources/cinema_booking.xml"));
        System.out.println(cinemaBooking);
    }
}
