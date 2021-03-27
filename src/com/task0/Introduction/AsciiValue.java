package com.task0.Introduction;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        char c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character");
        c = sc.next().charAt(0);
        int asciiChar = (int)c;

        System.out.println("Ascii value of the entered character is : "+asciiChar);

    }
}
