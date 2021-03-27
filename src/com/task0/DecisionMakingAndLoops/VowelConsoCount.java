package com.task0.DecisionMakingAndLoops;

public class VowelConsoCount {
    public static void main(String[] args) {
        String s = "My name is karan";
        int countV = 0,countC = 0;
        char ch[] = s.toCharArray();

        for(int i=0;i<s.length();i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                countV++;
            }else if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
                countV++;
            }
            else{
                countC++;
            }
        }
        System.out.println("Total number of vowels in the sentence are : "+countV);
        System.out.println("Total number of consonants in the sentence are : "+countC);
    }
}
