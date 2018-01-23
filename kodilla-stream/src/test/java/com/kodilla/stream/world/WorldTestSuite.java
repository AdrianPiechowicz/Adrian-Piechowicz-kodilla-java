package com.kodilla.stream.world;


import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country Poland = new Country(new BigDecimal("40000000"));
        Country Germany = new Country(new BigDecimal("50000000"));
        Country Spain = new Country(new BigDecimal("30000000"));
        List<Country> europe = new ArrayList<>();
        europe.add(Poland);
        europe.add(Germany);
        europe.add(Spain);
        Continent Europe = new Continent(europe);

        List<Country> asia = new ArrayList<>();
        Country China = new Country(new BigDecimal("1500000000"));
        Country Thailand = new Country(new BigDecimal("50000000"));
        asia.add(China);
        asia.add(Thailand);
        Continent Asia = new Continent(asia);

        List<Country> africa = new ArrayList<>();
        Country Uganda = new Country(new BigDecimal("80000000"));
        Country Egypt = new Country(new BigDecimal("30000000"));
        Continent Africa = new Continent(africa);

        List<Continent> world = new ArrayList<>();
        world.add(Europe);
        world.add(Asia);
        world.add(Africa);
        World wholeWorld = new World(world);

        //when
        BigDecimal totalPeopleCount = wholeWorld.getPeopleQuantity();

        //then
        BigDecimal expectedCount = new BigDecimal("1670000000");
        assertEquals(expectedCount,totalPeopleCount);

    }


}
