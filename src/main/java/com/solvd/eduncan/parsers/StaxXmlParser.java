package com.solvd.eduncan.parsers;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StaxXmlParser {

    public static void main(String[] args) {
        String fileName = "src/main/resources/cinema_booking.xml";
        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream(fileName));

            String currentElement = "";
            boolean inMoviesSection = false;
            boolean inMovie = false;

            while(reader.hasNext()) {
                int event = reader.next();

                switch(event) {
                    case XMLStreamConstants.START_ELEMENT:
                        currentElement = reader.getLocalName();
                        if ("movies".equals(currentElement)) {
                            inMoviesSection = true;
                        } else if ("movie".equals(currentElement) && inMoviesSection) {
                            inMovie = true;
                            System.out.println("Movie:");
                        }
                        break;

                    case XMLStreamConstants.CHARACTERS:
                        String text = reader.getText().trim();
                        if (!text.isEmpty() && inMovie) {
                            switch(currentElement) {
                                case "movie_id":
                                    System.out.println("  ID: " + text);
                                    break;
                                case "title":
                                    System.out.println("  Title: " + text);
                                    break;
                                case "duration":
                                    System.out.println("  Duration: " + text);
                                    break;
                                case "genre":
                                    System.out.println("  Genre: " + text);
                                    break;
                                case "release_date":
                                    System.out.println("  Release Date: " + text);
                                    break;
                            }
                        }
                        break;

                    case XMLStreamConstants.END_ELEMENT:
                        if ("movie".equals(reader.getLocalName()) && inMoviesSection) {
                            inMovie = false;
                            System.out.println(); // Add a blank line after each movie
                        } else if ("movies".equals(reader.getLocalName())) {
                            inMoviesSection = false;
                        }
                        break;
                }
            }
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
    }
}