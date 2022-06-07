package com.company.classes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Locale;

public class Airport {
    private String name;//фамилия
    private String surname;//имя
    private String patronymic;//отчество пассажира
    private int flight_number;//номер рейса
    private int baggage_number;//номер багажной квитанции
    private int number_of_luggage;//количество мест багажа;
    private double baggage_weight;//суммарный вес багажа пассажира
    private LocalDateTime placement_time;//время размещения багажа
    private int period_of_placement;//срок размещения


    public Airport(String name,String surname , String patronymic ,int flight_number , int baggage_number,int number_of_luggage, double baggage_weight,LocalDateTime placement_time ,int period_of_placement) {
       this.setName(name);
       this.setSurname(surname);
       this.setPatronymic(patronymic);
       this.setFlight_number(flight_number);
       this.setBaggage_number(baggage_number);
       this.setNumber_of_luggage(number_of_luggage);
       this.setBaggage_weight(baggage_weight);
       this.setPlacement_time(placement_time);
       this.setPeriod_of_placement(period_of_placement);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Utilities.correct_name(name.substring(0, 1).toUpperCase() + name.substring(1));
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = Utilities.correct_name(surname.substring(0, 1).toUpperCase() + surname.substring(1));
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = Utilities.correct_name(patronymic.substring(0, 1).toUpperCase() + patronymic.substring(1));
    }

    public int getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(int flight_number) {
        this.flight_number = Math.max(flight_number,0);
    }

    public int getBaggage_number() {
        return baggage_number;
    }

    public void setBaggage_number(int baggage_number) {
        this.baggage_number = Math.max(baggage_number,0);
    }

    public double getBaggage_weight() {
        return baggage_weight;
    }

    public void setBaggage_weight(double baggage_weight) {
        this.baggage_weight = Utilities.correct_baggage_weight(Math.max(baggage_weight,0));
    }

    public int getNumber_of_luggage() {
        return number_of_luggage;
    }

    public void setNumber_of_luggage(int number_of_luggage) {
        this.number_of_luggage = Utilities.correct_number_of_luggage(Math.max(number_of_luggage,0));
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
        this.period_of_placement = Utilities.correct_period_of_placement(Math.max(period_of_placement,0));
    }

    @Override
    public String toString() {
        String weight = "";
        if (baggage_weight == 0){
            weight+=" Incorrect baggage weight entered";
        }
        else {
            weight+=baggage_weight;
        }
        String period = "";
        if (period_of_placement == 0){
            period +=" Incorrect placement period entered.";
        }
        else {
            period +=period_of_placement;
        }
        String luggage = "";
        if(number_of_luggage == 0){
            luggage +=" Incorrect number of pieces of baggage entered.";
        }
        else {
            luggage += number_of_luggage;
        }
        return "Airport{" +
                "Name :'" + name + '\'' +
                " , Surname :'" + surname + '\'' +
                " , Patronymic :'" + patronymic + '\'' +
                " , Flight number :" + flight_number +
                " , Baggage number :" + baggage_number +
                " , The total weight of the passenger's baggage; :" + luggage +
                " , Baggage weight :" + weight +
                " , Placement time :" + placement_time +
                " , Period of placement :" + period +
                '}';
    }
}
