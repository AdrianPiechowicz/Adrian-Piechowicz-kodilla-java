package com.kodilla.testing;

public class TestingMain {
    public static void main(String[] args) {


        calculator calc = new calculator();
        int resultAdd = calc.add(5, 3);
        int resultSubtract = calc.subtract(5, 3);


        if (resultAdd == 8) {
            System.out.println("5 + 3 = 8    test passed");
        } else {
            System.out.println("5 + 3 =/= 8  test failed ");
        }


        if (resultSubtract == 2) {
            System.out.println("5 - 3 = 2    test passed");
        } else {
            System.out.println("5 - 3 =/= 2  test failed ");
        }

    }
}
