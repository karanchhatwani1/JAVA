package com.task0;

public class Frequency {
    public static void main(String[] args) {
        String str = "karan chhatwani";
        int[] freq = new int[str.length()];
        int i,j;
        char ch[] = str.toCharArray();

        for(i=0;i<str.length();i++){
            freq[i] = 1;
            for(j=i+1;j<str.length();j++){
                if(ch[i] == ch[j]){
                    freq[i]++;
                    ch[j] = '0';
                }
            }
        }
        System.out.println("Displaying number of characters");
        for(i=0;i<str.length();i++){
            if(ch[i]!=' ' && ch[i]!='0'){
                System.out.println(ch[i]+"-"+freq[i]);
            }
        }
    }
}
