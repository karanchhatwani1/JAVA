package com.task0.String;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIGKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();

        Random random = new Random();
        int length = 7;

        for(int i=0;i<length;i++){
            int index = random.nextInt(alphabet.length());

            char randomCh = alphabet.charAt(index);

            sb.append(randomCh);
        }
        String randomString = sb.toString();
        System.out.println("Random string is : "+randomString);
    }
}
