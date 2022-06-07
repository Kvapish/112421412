package com.company.classes;

import java.util.ArrayList;
import java.util.Locale;

public class Airports {
    private final ArrayList<Airport> airports;

    public Airports(ArrayList<Airport> airports) {
        this.airports = airports;
    }
    public Airports(){
        airports = new ArrayList<>();
    }

    public ArrayList<Airport> getAirports(){
        return airports;
    }

    public void add(Airport airport) {
        this.airports.add(airport);
    }
    public ArrayList getList() {
        return airports;
    }

    @Override
    public String toString() {
        String result = "";
        for (Airport a : airports) {
            result += a + System.lineSeparator();
        }
        return result;
    }
}
