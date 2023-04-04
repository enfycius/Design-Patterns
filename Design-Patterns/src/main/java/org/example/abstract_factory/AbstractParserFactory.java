package org.example.abstract_factory;

public interface AbstractParserFactory {
    public XMLParser getParserInstance(String parserType);
}
