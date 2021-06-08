package com.kodilla.stream.word;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class WordTestSuite {
    @Test
    public void testGetPeopleQuantity(){

        //Given
        Country poland = new Country(new BigDecimal("40"));
        Country france = new Country(new BigDecimal("70"));
        Country usa = new Country(new BigDecimal("300"));
        Country japan = new Country(new BigDecimal("12"));

        Continent europe = new Continent();
        europe.addCountry(poland);
        europe.addCountry(france);

        Continent america = new Continent();
        america.addCountry(usa);

        Continent asia = new Continent();
        asia.addCountry(japan);

        Word word = new Word();
        word.addContinent(europe);
        word.addContinent(america);
        word.addContinent(asia);

        //When
        BigDecimal result = word.getPeopleQuantity();

        //Then
        Assertions.assertEquals(new BigDecimal("422"),result);
    }
}