package org.example.abstract_factory;

public class TWFeedbackXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("TW Parsing feedback XML...");

        return "TW Feedback XML Message";
    }
}
