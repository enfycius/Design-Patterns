package org.example.abstract_factory;

public class NYResponseXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("NY Parsing response XML...");

        return "NY Response XML Message";
    }
}
