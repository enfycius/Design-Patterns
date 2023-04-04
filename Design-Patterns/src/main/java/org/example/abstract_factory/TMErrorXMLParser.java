package org.example.abstract_factory;

public class TMErrorXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("TM Parsing error XML...");

        return "TW Error XML Message";
    }
}
