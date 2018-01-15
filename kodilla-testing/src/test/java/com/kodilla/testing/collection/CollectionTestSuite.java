package com.kodilla.testing.collection;

import com.kodilla.collection.OddNumbersExterminator;
import org.junit.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Zaczynamy test.");
    }

    @After
    public void after() {
        System.out.println("Koniec testu.");
    }


    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //When
        ArrayList<Integer> result = OddNumbersExterminator.exterminate(numbers);
        for (int number : numbers) {
            System.out.println("Test " + number);
        }
        //then
        ArrayList<Integer> expected = new ArrayList<Integer>();
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        //When
        ArrayList<Integer> result = OddNumbersExterminator.exterminate(numbers);
        for (int number : numbers) {
            System.out.println("Test " + number);
        }
        //Then
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
        oddNumbers.add(2);
        oddNumbers.add(4);
        oddNumbers.add(6);
        Assert.assertEquals(oddNumbers, result);
    }
}
