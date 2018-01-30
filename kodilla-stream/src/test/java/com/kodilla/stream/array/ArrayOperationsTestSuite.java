package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //given
        int[] array = {};

        ArrayOperations arrayOperations = new ArrayOperations(array);

        //when
        Double result = arrayOperations.getAverage(array);


        //then
        Assert.assertEquals(0, result, 0);
    }
}
/*
Teraz twoja metoda rzuci wyjątek, jeśli ktoś przekaże pustą listę do policzenia średniej.
Spróbuj zrobić tak, żeby zamiast tego zwracała wartość 0. Zerknij na metodę: orElse() z klasy OptionalDouble
 */