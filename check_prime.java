package com.company;
import java.util.*;

public class check_prime {

    public static void main(String[] args) {

        /* IS PRIME NUMBER*/
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        int count=0;
        for(int i=2;i<input1;i++)
            if(input1%i==0){
                count++;
            }
        if (count==0){
            System.out.println("prime ");
        }
        else{
            System.out.println("not prime ");
        }



















//        int input1=sc.nextInt();
//        int fact=1;
//        for(int i=1;i<=input1;i++)
//        {
//            fact=fact*i;
//            System.out.println(fact);
//        }


    }
}
