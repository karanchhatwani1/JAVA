package com.task0.Introduction;

import java.util.Scanner;

public class LargestValue {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a");
        a = sc.nextInt();
        System.out.println("Enter the value of b");
        b = sc.nextInt();
        System.out.println("Enter the value of c");
        c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("a is greatest");
        }
        else if(b>a && b>c){
            System.out.println("b is greatest");
        }
        else if(c>a && c>b){
            System.out.println("c is greatest");
        }
        else if(a==b && a==c){
            System.out.println("All three values are equal");
        }
        else if(a==b||a==c){
            System.out.println("Two of the given values are equal");
        }
    }
}
