package com.task0;

public class WhiteSpace {
    public static void main(String[] args) {
        String s = "My Name is Karan";
        String str = s.replaceAll("\\s","");
        System.out.println("String with white spaces : "+s);
        System.out.println("String without white spaces : "+str);
    }
}
