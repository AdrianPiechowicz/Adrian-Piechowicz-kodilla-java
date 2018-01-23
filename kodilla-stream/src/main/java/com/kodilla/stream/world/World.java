package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    List<Continent> world = new ArrayList<>();

    public World(List<Continent> world) {
        this.world = world;
    }

    public BigDecimal getPeopleQuantity(){
        return world.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,current) -> sum = sum.add(current));
    }
}
