package com.company;

public class primenumber_range {
    public static void main(String[] args) {


       int count,pcount=0;
        for (int n=1;n<=50;n++){
            count = 0;

           for (int i=1;i<=n;i++)
           {
               if (n%i==0)
               {
               count++;
               }
           }
           if (count==2)
           {
               pcount++;
            System.out.println("prime "+n);
           }
           else
               {
            System.out.println("not prime "+n);
               }
       }
        System.out.println("total : "+pcount);

    }
}
