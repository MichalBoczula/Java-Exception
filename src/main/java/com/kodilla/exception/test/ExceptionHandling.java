package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args){

        SecondChallenge secondChallenge = new SecondChallenge();

        try {

            secondChallenge.probablyIWillThrowException(3,4);

        } catch (Exception e) {

            System.out.println("Exception: "+e);
        } finally {

            System.out.println("End of program");
        }
    }
}
