package com.task3.task3_3;

public class Main {
    public static void main(String[] args) {
        TouristPlace touristPlace = new TouristPlace("Nargarh Fort","10Pm to 8Pm",100);
        touristPlace.addFamousFor("Scenery");
        touristPlace.rate(4);
        touristPlace.rate(8);
        touristPlace.rate(20);
        System.out.println(touristPlace.starRating);
    }
}
