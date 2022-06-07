package com.company;

import com.company.classes.Airport;
import com.company.classes.Airports;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        int M = 20;
        Airports airports = new Airports();
        for (int i = 0; i < M; i++) {
            airports.add(new Airport("ssss","ssss","ssssss",22,21212.2224242,LocalDateTime.of(2021,12,4,2,5),2));
        }
        System.out.println(airports);
    }
}
