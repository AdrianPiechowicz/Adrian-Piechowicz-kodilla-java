package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacBuilderTestSuite {

    @Test
    public void testBigMacBuild() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("Normal")
                .burgers(3)
                .sauce("BBQ")
                .ingredients("Bacon")
                .ingredients("Cheese")
                .ingredients("Chilli")
                .build();

        //When
        int burgersCount = bigmac.getBurgers();
        int ingredientsCount = bigmac.getIngredients().size();
        String whatSauce = bigmac.getSauce();

        //Then
        System.out.println(bigmac);
        Assert.assertEquals(3,burgersCount);
        Assert.assertEquals(3,ingredientsCount);
        Assert.assertEquals("BBQ",whatSauce);
    }
}
