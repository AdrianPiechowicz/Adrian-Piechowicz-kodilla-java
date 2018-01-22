package com.kodilla.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class OddNumbersExterminator {

    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        Iterator<Integer> numbersIterator = numbers.iterator();
        while (numbersIterator.hasNext()){
            int temp = numbersIterator.next();
            if ((temp%2) !=0){
                numbersIterator.remove();
            }
        }
        return numbers;
    }
}
