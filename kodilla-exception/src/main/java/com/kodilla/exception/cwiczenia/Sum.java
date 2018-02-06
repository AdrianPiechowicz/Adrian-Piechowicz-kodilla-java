package com.kodilla.exception.cwiczenia;

public class Sum {
    double a;
    double b;

    public Sum() {
    }

    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        double temporary=principal;
        int years=0;
        for (int i=0;i<19;i++){
            temporary+=((principal*interest) - (principal*interest*tax));
            System.out.println(temporary);
            years++;
            if (temporary > desired){break;}
        }
        return years;
    }



    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.println(sum.calculateYears(1000,0.01625,0.18,1200));

    }
}