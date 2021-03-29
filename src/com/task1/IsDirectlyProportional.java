package com.task1;

import java.util.Scanner;

public class IsDirectlyProportional {
    static boolean isDirectlyProportional(int[] x,int[] y){
        int count=0,count2=0;
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x.length;j++){
                if(y[i]%x[j]==0){
                    count++;
                    break;
                }
            }
        }
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x.length;j++){
                if(x[i]%y[j]==0){
                    count2++;
                    break;
                }
            }
        }
        if(count==x.length || count2==y.length){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int x[] = new int[5];
        int y[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in x : ");
        for(int i=0;i<x.length;i++){
            x[i] = sc.nextInt();
        }
        System.out.println("Enter the elements in y : ");
        for(int i=0;i<x.length;i++){
            y[i] = sc.nextInt();
        }
        boolean b = isDirectlyProportional(x,y);
        if(b){
            System.out.println("x and y are directly proportional");
        }
        else{
            System.out.println("x and y are not proportional");
        }
    }
}
