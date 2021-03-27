package com.task0.Introduction;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RoundFigure {
    public static void main(String[] args) {

        double num;
        int n;
        Scanner sc = new Scanner(System.in);
        num = sc.nextDouble();

        System.out.format("%.4f",num);
    }
}
