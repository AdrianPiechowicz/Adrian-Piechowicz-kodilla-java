package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.*;
import java.util.stream.*;
import java.util.OptionalDouble;

import static java.util.stream.Collectors.*;

public final class ArrayOperations {
    int[] array = new int[20];

    public ArrayOperations(int[] array) {
        this.array = array;
    }

    public double getAverage(int[] numbers){
        IntStream.range(0,numbers.length)
                .forEach(x-> System.out.println(array[x]));

        OptionalDouble result = IntStream.range(0,numbers.length)
                .map(n->numbers[n])
                .average();
        return result.getAsDouble();



    }
}
