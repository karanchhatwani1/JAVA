package com.task0.String;

public class NumericString {
    public static void main(String[] args) {
        String s = "34a";
        int a;
        boolean numeric = true;
        try{
            a = Integer.parseInt(s);
        }catch(Exception e){
            System.out.println(e);
            numeric = false;
        }
        if(numeric){
            System.out.println(s+" is numeric");
        }else{
            System.out.println("It is not numeric");
        }
    }
}
