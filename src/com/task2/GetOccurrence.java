package com.task2;

import com.sun.security.jgss.GSSUtil;

import java.util.HashMap;
import java.util.Scanner;

public class GetOccurrence {
    static HashMap<Integer,Integer> getOccurrenceHashMAp(String s){
        HashMap<Integer,Integer> a = new HashMap<>();
        String s1[] = s.split(";");
        int[] array = new int[s1.length];
        for(int i=0;i<s1.length;i++){
            array[i] = Integer.parseInt(s1[i]);
        }
        int[] freq = new int[array.length];

        for(int i=0;i<array.length;i++){
            freq[i] = 1;
            for(int j=i+1;j<array.length;j++){
                if(array[i] == array[j]){
                    freq[i] = freq[i]+1;
                    array[j] = 0;
                }
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]!= 0){
                a.put(array[i],freq[i]);
            }
        }
        return a;
    }
    public static void main(String[] args) {
        String s;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the String : ");
        s = sc.next();
        HashMap<Integer,Integer> a = getOccurrenceHashMAp(s);
        System.out.println(a);
    }
}
