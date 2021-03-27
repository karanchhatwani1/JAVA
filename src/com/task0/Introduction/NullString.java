package com.task0.Introduction;

import java.util.Scanner;

public class NullString {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string to be checked :");
        str = sc.next();

        if(isNull(str)){
            System.out.println("The given string is null");
        }
        else{
            System.out.println("The given string is not null");
        }
    }

    private static boolean isNull(String s) {
        if(s!=null && !s.trim().isEmpty()){
            return false;
        }
        return true;
    }
}
