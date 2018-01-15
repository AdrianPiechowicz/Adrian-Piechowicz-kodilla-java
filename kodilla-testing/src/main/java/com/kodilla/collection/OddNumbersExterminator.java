package com.kodilla.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        for (int number: numbers){
            if ((number % 2) != 0){
                numbers.remove(number);
            };

        }

        return numbers;
    }
}
