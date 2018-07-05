package com.kodilla.exception.test;

public class ThirdChallengeRunner {

    public static void main(String[] args)  {

        final SearchFlight searchFlight = new SearchFlight();

        try {
            System.out.println("Flight from Wroclaw to Madrid: "+searchFlight.findFilght(new Flight("wroclaw", "madrid")));
        } catch (RouteNotFoundException e) {
            System.out.println("This Flight doesn't exist");
        }

        try {
            System.out.println("Flight from Moscow to Madrid: "+searchFlight.findFilght(new Flight("moscow", "madrid")));
        } catch (RouteNotFoundException e) {
            System.out.println("This Flight doesn't exist");
        }
    }
}
