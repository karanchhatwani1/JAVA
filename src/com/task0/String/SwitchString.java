package com.task0.String;

import java.util.Scanner;

public class SwitchString {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the branch you want to choose :");
        str = sc.next();

        switch (str){
            case "CSE":
                System.out.println("You have chosen CSE");
                break;

            case "ME":
                System.out.println("You have chosen ME");
                break;

            case "EE":
                System.out.println("You have chosen EE");
                break;

            default:
                System.out.println("You have chosen Nothing");
                break;

        }
    }
}
