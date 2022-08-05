package com.company;
import java.util.*;

public class addinglastnumber {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);   //Scanner sc to take inputs

        int input1=sc.nextInt();     //enter the first input
        int input2=sc.nextInt();    //enetr the second input

        if (input1<0&&input2<0) {
            int input3 = 0 - input1 % 10;
            int input4 = 0 - input2 % 10;
            int sum1 = input3 + input4;
            System.out.println("sum1= "+sum1);
        }
         if (input1<0&&input2>0) {
            int input5 = input1 % 10;
            int input6 = input2 % 10;
            int sum2 = -(input5 - input6);
            System.out.println("sum2= " + sum2);
        }

         if (input1>0&&input2<0){
                int input7=input1%10;
                int input8=input2%10;
                int sum3=(input7-input8);
                System.out.println("sum3= "+sum3);

            }
         if (input1>0&&input2>0){
             int input9=input1%10;
             int input10=input2%10;
             int sum4=(input9+input10);
            System.out.println("sum4="+sum4);
        }














    }
}
