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



















//
//        int count;
//        int pcount=0;
//        for(int n=1;n<=1000000;n++)
//        {
//            count=0;
//            for(int i=1;i<=n;i++)
//            {
//                if(n%i==0)
//                {
//                    count++;
//                }
//            }
//            if(count==2)
//            {
//                pcount++;
//                System.out.println("prime:"+n);
//            }
//            else
//            {
//                System.out.println("not prime:"+n);
//                pcount++;
//            }
//        }
//        System.out.println("total count:"+pcount);
//
//
//
//
//
//























//        int a=2,b=10,count,pcount=0;
//        for(int i=a;i<=b;i++){
//            count=0;
//            for(int j=2;j<=i/2;j++)
//                if (i % j == 0)
//                    count++;
//            if(count==0)
//
//                pcount++;
//        }
//
//        System.out.println("the count of the prime number are " +pcount);
















//
//        int no=4;
//        int count=0;
//        for(int i=2;i<=no-1;i++){
//            if(no%i==0){
//                count++;
//            }
//
//        }
//        if(count==0){
//            System.out.println(" prime number");
//        }
//        else{
//            System.out.println("not a prime number");
//        }

    }
}