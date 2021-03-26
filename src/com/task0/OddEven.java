package com.task0;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();

        if(num%2 == 0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
}
