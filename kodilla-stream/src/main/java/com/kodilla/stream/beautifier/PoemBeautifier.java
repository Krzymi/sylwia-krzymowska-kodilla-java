package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void decorate(String myText, PoemDecorator poemDecorator) {
        String decoratedText = poemDecorator.decorate(myText);
        System.out.println(decoratedText);
    }
}
