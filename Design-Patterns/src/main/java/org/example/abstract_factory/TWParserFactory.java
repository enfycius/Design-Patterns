package org.example.abstract_factory;

public class TWParserFactory implements AbstractParserFactory {

    @Override
    public XMLParser getParserInstance(String parserType) {
        switch(parserType) {
            case "TWERROR": return new TMErrorXMLParser();
            case "TWFEEDBACK": return new TWFeedbackXMLParser();
            case "TWORDER": return new TWOrderXMLParser();
            case "TWRESPONSE": return new TWResponseXMLParser();
        }

        return null;
    }
}
