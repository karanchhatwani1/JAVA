package com.task0.String;

public class CompareStrings {
    public static void main(String[] args) {
        String str = "karan";
        String str1 = "karan";

        //== compares the reference of the string while .equals compares the strings only
        if(str.equals(str1)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are unequal");
        }
    }
}
