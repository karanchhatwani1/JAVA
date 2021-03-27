package com.task0.Introduction;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphabet");
        c = sc.next().charAt(0);

        boolean lower_case = (c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u');
        boolean upper_case = (c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U');

        if(lower_case||upper_case){
            System.out.println("Given alphabet is a vowel");
        }
        else{
            System.out.println("Given alphabet is a consonant");
        }
    }
}
