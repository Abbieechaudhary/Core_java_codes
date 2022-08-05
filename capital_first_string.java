package com.company;

public class capital_first_string {
    public static String input(String str){
        str=" "+str;            //make a space before the first word of the string
        String s1="";           //create a string to make output string

        for(int i=0;i<str.length();i++)  //loop for run through index
        {
            if(str.charAt(i)==' ')  // check space available
            {
                s1=s1+Character.toUpperCase(str.charAt(i+1))+".";   //store character at index2(except space) and add dot . in string(s1)
            }
        }
        return s1;            //return string s1
    }

    public static void main(String[] args) {
        String str="my name is aakash chaudhary";
        System.out.println(input(str));
    }
}

