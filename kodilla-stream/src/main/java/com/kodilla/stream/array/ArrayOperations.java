package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public final class ArrayOperations {
    int[] array = new int[20];

    public ArrayOperations(int[] array) {
        this.array = array;
    }

    public double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(x -> System.out.println(array[x]));

        OptionalDouble result = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average();


        return result.orElse(0);

    }
}
