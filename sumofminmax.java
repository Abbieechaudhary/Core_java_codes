package com.company;

import java.util.*;
        public class sumofminmax{
            public static int maxDigit(int n){
                int mx = Integer.MIN_VALUE;
                while(n>0){
                    if(mx<n%10) mx = n%10;
                    n/=10;
                }
                return mx;
            }
            public static int minDigit(int n ){
                int min = Integer.MAX_VALUE;
                while(n>0){
                    if(min > n%10 ) min = n%10;
                    n/=10;
                }
                return min;
            }
            public static int Difference(int x, int y, int z){
                return (minDigit(x) + minDigit(y)+minDigit(z))-(maxDigit(x) + maxDigit(y) + maxDigit(z));
            }
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                System.out.println(Difference(x,y,z));
            }
        }



