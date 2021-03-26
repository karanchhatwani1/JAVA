package com.task0;

public class Swapping {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int t;

        System.out.println("Value of a is : "+a);
        System.out.println("Value of b is : "+b);

        t = b;
        b = a;
        a = t;

        System.out.println("Value of a after swapping : "+a);
        System.out.println("Value of b after swapping : "+b);

    }
}
