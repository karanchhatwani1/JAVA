package com.task0.String;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDate {
    public static void main(String[] args) {
        String string = "2021-12-05";
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
        System.out.println(date);
    }
}
