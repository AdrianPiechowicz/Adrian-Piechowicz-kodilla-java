package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    List<Country> continent = new ArrayList<>();

    public Continent(List<Country> continent) {
        this.continent = continent;
    }

    public List<Country> getCountries(){
        return continent;
    }
}