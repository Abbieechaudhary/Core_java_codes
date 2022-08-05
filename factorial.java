package com.company;
import java.util.*;

public class factorial {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        int fact=1;
        for(int i=1;i<=input1;i++)
        {
            fact=fact*i;
        }

        System.out.println(fact);

    }
}
