package org.example.abstract_factory;

public class NYOrderXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("NY Parsing order XML...");

        return "NY Order XML Message";
    }
}
