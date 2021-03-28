package com.task0.DecisionMakingAndLoops;

public class LexicographicalOrder {
    public static void main(String[] args) {
        String[] str = {"life","is","very","unfair"};

        for(int i=0;i<3;i++){
            for(int j =i+1;j<4;j++){
                if(str[i].compareTo(str[j])>0){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("In lexicographical order :");
        for(int i = 0;i<4;i++){
            System.out.println(str[i]);
        }
    }
}
