package com.task0.String;

public class StringOperators {
    public static void main(String[] args) {
        String name1 = new String("karan");
        String name2 = new String("karan");

        if(name1 == name2){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Both are unequal");
        }
        if(name1.equals(name2)){
            System.out.println("Both Are Equal");
        }else{
            System.out.println("Both are unequal");
        }
        // == takes the reference of the string while .equals takes the string
    }
}
