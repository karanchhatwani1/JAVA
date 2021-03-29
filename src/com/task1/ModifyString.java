package com.task1;

import java.util.Scanner;

public class ModifyString {

    public static String modify(String s,String replacement){
        char ch[] = s.toCharArray();
        char ch1[] = replacement.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            for(int j=replacement.length()-1;j>=0;j--){
                if(ch[i] == ch1[j]){
                    ch[i]=ch1[j+1];
                    sb.append(ch[i]);
                }
            }
        }
        String stringAfterReplacement = sb.toString();
        return stringAfterReplacement;
    }

    public static void main(String[] args) {
        String ex1;
        String ex2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Initial String :");
        ex1 = sc.next();
        System.out.println("Replacements to be done : ");
        ex2 = sc.next();

        String result = modify(ex1,ex2);
        System.out.println("String after corresponding replacements : "+result);
    }
}
