package com.task2;

import java.util.Locale;
import java.util.Scanner;

public class WordGuessGame {
    static String startGame(String s){
        s.toUpperCase();
        StringBuilder sb = new StringBuilder();
        int i=0;
        char ch[] = s.toCharArray();
        for(i=0;i<ch.length;i++){
            if(ch[i] !='A'&&ch[i]!='E'&&ch[i] !='I'&&ch[i]!='O'&&ch[i]!='U'){
                ch[i] = '_';
            }
        }
        System.out.print("Word : ");
        for(i=0;i<ch.length;i++){
            System.out.print(ch[i]);
            sb.append(ch[i]);
        }
        String s1 = sb.toString();
        return s1;
    }
    static String Guess(char c,String originalString,String s1){
        char enteredCharacter = Character.toUpperCase(c);
        boolean contains = false;
        int count1 = 0;
        StringBuilder sb1 = new StringBuilder(s1);
        int i=0;
        originalString.toUpperCase();
        char ch[] = originalString.toCharArray();
        for(char c1 : ch){
            if(c1 == enteredCharacter){
                contains = true;
                sb1.setCharAt(i, enteredCharacter);
                s1 = sb1.toString();
                count1++;
            }
            i++;
        }
        if(contains) {
            System.out.println("Character found "+count1+" time(s)");
        }else{
            System.out.println("Character not present");
        }
        return s1;
    }
    public static void main(String[] args) {
        String s = "SHAMBHO";
        int count = 1;
        char c;
        Scanner sc = new Scanner(System.in);
        char ch[] = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i] !='A'||ch[i]!='E'||ch[i] !='I'||ch[i]!='O'||ch[i]!='U'){
                count++;
            }
        }
        String s2 = startGame(s);
        System.out.println("\nChances = "+count);
        System.out.print("Guess = ");
        c = sc.next().charAt(0);
        while (count>0){
            count--;
            String s3 = Guess(c,s,s2);
            s2 = s3;
            if(s3.equals(s)){
                System.out.println("You have Guessed the word");
                break;
            }
            System.out.println("\nWord = "+s3);
            System.out.println("Chances = "+count);
            System.out.print("Guess = ");
            c = sc.next().charAt(0);

        }
    }
}
