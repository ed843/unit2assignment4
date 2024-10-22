package com.solvd.eduncan.util;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import org.xml.sax.SAXException;

public class XMLValidator {
    public static void main(String[] args) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File("src/main/resources/cinema_booking.xsd"));
            Validator validator = schema.newValidator();

            validator.validate(new StreamSource(new File("src/main/resources/cinema_booking.xml")));
            System.out.println("XML is valid against the XSD.");
        } catch (SAXException | IOException e) {
            System.out.println("XML is not valid against the XSD: " + e.getMessage());
        }
    }
}