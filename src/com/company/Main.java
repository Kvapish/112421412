package com.company;

import com.company.classes.Airport;
import com.company.classes.Airports;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Airports airports = new Airports();

        airports.add(new Airport("alexandr","Kvapish","alexandrovich",212,2,2,22.5,LocalDateTime.of(2022,12,2,21,20),1));

        System.out.println(airports);
    }
}
