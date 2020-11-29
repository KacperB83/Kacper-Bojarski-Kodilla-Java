package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private Continent continent;
    private final String nameOfCountry;
    private final String continentOfCountry;
    private final long numberOfPeople;

    public Country(final String nameOfCountry, final String continentOfCountry, final Long numberOfPeople) {
        this.nameOfCountry = nameOfCountry;
        this.continentOfCountry = continentOfCountry;
        this.numberOfPeople = numberOfPeople;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal quantity = getPeopleQuantity();
        return quantity;
    }

    public long getNumberOfPeople() {
        return numberOfPeople;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public String getContinentOfCountry() {
        return continentOfCountry;
    }

    @Override
    public String toString() {
        return "Country{" +
                "nameOfCountry='" + nameOfCountry + '\'' +
                ", continentOfCountry='" + continentOfCountry + '\'' +
                ", numberOfPeople=" + numberOfPeople +
                "}\n";
    }
}
