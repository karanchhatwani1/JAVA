package com.task0.DecisionMakingAndLoops;

public class NumberPower {
    public static void main(String[] args) {
        int base = 3;
        int exponent = 4;
        int result = 1;
        while(exponent != 0){
            result = result * base;
        }
        System.out.println(result);
    }
}
