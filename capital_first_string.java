package com.company;

public class capital_first_string {
    public static void input(String str){
        str=" "+str;
        String s1="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                   s1=s1+Character.toUpperCase(str.charAt(i+1))+".";
            }
        }
        System.out.println(s1);
    }

    public static void main(String[] args) {
        String str="my name is aakash chaudhary";
        input(str);
        System.out.println();
    }
}
