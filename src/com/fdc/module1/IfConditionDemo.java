package com.fdc.module1;

import java.util.Scanner;

public class IfConditionDemo {
    public static void main(String[] args) {
        // 3,March
        //5, May
        Scanner myScn=new Scanner(System.in);
        System.out.print("Enter the number for the month:");
        int month=myScn.nextInt();

        if (month<1 || month>12)
            System.out.println("Invalid Input");
        else if(month==1)
            System.out.println("Jan");
        else if(month==2)
            System.out.println("Feb");
        else if(month==3)
            System.out.println("Mar");
        else if(month==4)
            System.out.println("Apr");
        else if(month==5)
            System.out.println("May");
        else if(month==6)
            System.out.println("Jun");
        else if(month==7)
            System.out.println("Jul");
        else if(month==8)
            System.out.println("Aug");
        else if(month==9)
            System.out.println("Sep");
        else if(month==10)
            System.out.println("Oct");
        else if(month==11)
            System.out.println("Nov");
        else if(month==12)
            System.out.println("Dec");

    }
}
