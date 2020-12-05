package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String nameOfCountry;
    private final BigDecimal numberOfPeople;

    public Country(final String nameOfCountry, final BigDecimal numberOfPeople) {
        this.nameOfCountry = nameOfCountry;
        this.numberOfPeople = numberOfPeople;
    }

    public BigDecimal getNumberOfPeople() {
        return new BigDecimal(String.valueOf(numberOfPeople));
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    @Override
    public String toString() {
        return "Country{" +
                "nameOfCountry='" + nameOfCountry + '\'' +
                ", numberOfPeople=" + numberOfPeople +
                "}\n";
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(nameOfCountry, country.nameOfCountry);
    }*/
}
