package com.company.classes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Locale;

public class Airport {
    private String name;
    private String surname;
    private String patronymic;
    private int baggage_number;
    private double baggage_weight;
    private LocalDateTime placement_time;
    private int period_of_placement;

    public static String correctCase(String string){
        char[] chars = string.strip().toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            result += (i == 0) ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]);
        }
        return result;
    }
    public Airport(String name,String surname , String patronymic , int baggage_number, double baggage_weight,LocalDateTime placement_time ,int period_of_placement) {
       this.setName(name);
       this.setSurname(surname);
       this.setPatronymic(patronymic);
       this.setBaggage_number(baggage_number);
       this.setBaggage_weight(baggage_weight);
       this.setPlacement_time(placement_time);
       this.setPeriod_of_placement(period_of_placement);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getBaggage_number() {
        return baggage_number;
    }

    public void setBaggage_number(int baggage_number) {
        this.baggage_number = baggage_number;
    }

    public double getBaggage_weight() {
        return baggage_weight;
    }

    public void setBaggage_weight(double baggage_weight) {
        this.baggage_weight = baggage_weight;
    }

    public LocalDateTime getPlacement_time() {
        return placement_time;
    }

    public void setPlacement_time(LocalDateTime placement_time) {
        this.placement_time = placement_time;
    }

    public int getPeriod_of_placement() {
        return period_of_placement;
    }

    public void setPeriod_of_placement(int period_of_placement) {
        this.period_of_placement = period_of_placement;
    }

    @Override
    public String toString() {
        return "Airports{" +
                "Name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", Patronymic='" + patronymic + '\'' +
                ", Baggage number=" + baggage_number +
                ", Baggage weight=" + baggage_weight +
                ", Placement time=" + placement_time +
                ", Period of placement=" + period_of_placement +
                '}';
    }

}
