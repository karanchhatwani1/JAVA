package com.task0.Introduction;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        y = sc.nextInt();

        if((y%400 == 0 && y%100 ==0) || (y%4 == 0 && y%100 != 0)){
            System.out.println("the given year is a leap year");
        }

         //the leap year should be either divided by 400 and 100 both
         //or it should be either divided by 4 and not divided by hundred
         // if these conditions satisfies then the given year is a leap yr

        else{
            System.out.println("the given year is not a leap year");
        }

    }
}
