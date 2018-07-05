package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlight {

    private final Map<String, Boolean> flightMap = new HashMap();

    public SearchFlight() {
        setFlightMap();
    }

    public Boolean findFilght(Flight flight) throws RouteNotFoundException {

        boolean answer= false;

        if(flightMap.containsKey(flight.getDepartureAirport().toLowerCase())){
            answer = true;
        } else {
            throw new RouteNotFoundException();
        }

        return answer;
    }

    private void setFlightMap(){
        flightMap.put("wroclaw", true);
        flightMap.put("warsaw", true);
        flightMap.put("berlin", true);
        flightMap.put("hamburg", true);
        flightMap.put("prague", true);
    }
}
