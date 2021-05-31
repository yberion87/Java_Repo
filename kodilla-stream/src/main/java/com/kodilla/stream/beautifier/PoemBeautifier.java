package com.kodilla.stream.beautifier;

public class PoemBeautifier {


    public String beautify(String word, PoemDecorator poemDecorator){
    String result = poemDecorator.decorate(word);
    return  result;
    }


}
