package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        int len=0, wid=0;
        int area=0;
        int conv_rate=350;
        int result=0;
        int rem=0;
        System.out.print("What is the length of the ceiling? ");
        len=sc.nextInt();
        System.out.print("What is the width of the ceiling? ");
        wid=sc.nextInt();
        area=len*wid;
        result=area/conv_rate;
        rem=area%conv_rate;
        if(rem>0){
            result=result+1;
        }
        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet\n", result, area);
    }
}