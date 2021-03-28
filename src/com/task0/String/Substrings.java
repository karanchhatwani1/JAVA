package com.task0.String;

public class Substrings {
    public static void main(String[] args) {
        String s = "My name is karan";
        String s1 = "name";

        boolean sub = s.contains(s1);
        if(sub){
            System.out.println("The given string is the substring of main string");
        }
        else{
            System.out.println("The given string is not the substring of main string");
        }
    }
}
