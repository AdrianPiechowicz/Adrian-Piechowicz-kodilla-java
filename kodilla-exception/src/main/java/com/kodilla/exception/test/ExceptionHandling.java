package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String args[]){
    SecondChallenge secondChallenge = new SecondChallenge();

    try {
        secondChallenge.probablyIWillThrowException(2,2);
    } catch (Exception e) {
        System.out.println("An exception occured: "+e);
    } finally {
        System.out.println("If there was an error, it is handled :)");
    }


}
}
