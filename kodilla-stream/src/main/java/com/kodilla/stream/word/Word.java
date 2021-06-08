package com.kodilla.stream.word;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Word {
    private List<Continent> listOfContinents = new ArrayList<>();

    public List<Continent> getListOfContinents() {
        return listOfContinents;
    }

    public List<Continent> addContinent(Continent continent){
        listOfContinents.add(continent);
        return listOfContinents;
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal totalPeople = listOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));

        return totalPeople;

    }
}
