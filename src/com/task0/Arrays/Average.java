package com.task0.Arrays;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int sum  = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array elements :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        int avg = sum/arr.length;
        System.out.println("Average is : "+avg);
    }
}
