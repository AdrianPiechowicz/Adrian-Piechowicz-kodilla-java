package com.kodilla.testing;

public class Test {
    public static void main(String[] args) {
        String asd = "asd";
        char[] table = asd.toCharArray();
        System.out.println(table.length);
        String result = "";

        for (int i=table.length-1; i>=0; i--) {
            result = result + table[i];
        }
        System.out.println(result);
    }
}
