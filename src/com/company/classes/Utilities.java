package com.company.classes;

public class Utilities {
    static String correct_name(String str){
        if (str.matches("[a-zA-Z]+")){
            return str;
        }
        else {
            return "Invalid name entered.";
        }
    }
    static double  correct_baggage_weight(double correct){
        if(correct <= 100){
            return correct;
        }
        else {
            return 0;
        }
    }
    static int correct_period_of_placement(int correct){
        if (correct <= 21){
            return correct;
        }
        else {
            return 0;
        }
    }
    static int correct_number_of_luggage(int correct){
        if (correct <= 3){
            return correct;
        }
        else {
            return 0;
        }
    }
}
