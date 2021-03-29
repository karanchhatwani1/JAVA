package com.task1;

import java.util.Arrays;
import java.util.Scanner;

public class TotalWeight {
    public static int totalWeight(String s,int[]weights){
        char ch[] = s.toCharArray();
        int sum = 0;
        int k=0;
        StringBuilder sb = new StringBuilder();
        Arrays.sort(ch);
        int freq[] = new int[5];

        for(int i=0;i<s.length();i++){
            if(ch[i]!='\0'){
                freq[k] = 1;
                for(int j=i+1;j<s.length();j++){
                    if(ch[i]==ch[j]){
                        freq[k]++;
                        ch[j]='\0';
                    }
                }
                k++;
            }
        }
        for(int i=0;i<s.length();i++){
            if(ch[i]!='\0'){
                sb.append(ch[i]);
            }
        }
        String s2 = sb.toString();

        char ch2[] = s2.toCharArray();

        for(int i=0;i<s2.length();i++){
            System.out.print("("+freq[i]+ch2[i]+" = "+freq[i]*weights[i]+")");
            sum = sum + freq[i]*weights[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        String s;
        int weight[] = new int[5];
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the Alphabetical String from A to E :");
        s = sc.next();
        System.out.println("Enter the Weights of Alphabets from A to E : ");
        for(int i=0;i<5;i++){
            weight[i] = sc.nextInt();
        }
        int n = totalWeight(s,weight);
        System.out.println(" = "+n);
    }
}
