package com.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetList {
    static List<Integer> getList(String s){
       String s1[];
       s1 = s.split(";");
       List<Integer> a = new ArrayList<>();
       for(int i=0;i<s1.length;i++){
           a.add(Integer.parseInt(s1[i]));
       }
       return a;
    }
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        s = sc.next();
        List<Integer> a = getList(s);
        System.out.println("List = "+a);
    }
}
