package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //given
        int[] array = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

        ArrayOperations arrayOperations = new ArrayOperations(array);

        //when
        Double result = arrayOperations.getAverage(array);

        //then
        Assert.assertEquals(1.0,result,0);
    }
}
