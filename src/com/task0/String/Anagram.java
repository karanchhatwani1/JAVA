package com.task0.String;


import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "Life";
        String s2 = "File";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if(s1.length() == s2.length()){
            char ch1[] = s1.toCharArray();
            char ch2[] = s2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            boolean result = Arrays.equals(ch1,ch2);
            if(result){
                System.out.println("The given arrays are equal");
            }
            else{
                System.out.println("The given arrays are unequal");
            }
        }
        else{
            System.out.println("The given arrays are unequal");
        }
    }
}
