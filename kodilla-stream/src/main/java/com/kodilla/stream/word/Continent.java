package com.kodilla.stream.word;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private List<Country> listOfCountries = new ArrayList<>();

    public List<Country> getListOfCountries() {
        return listOfCountries;
    }

    public List<Country> addCountry(Country country){
        listOfCountries.add(country);
        return getListOfCountries();
    }
}
