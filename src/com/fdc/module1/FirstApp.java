package com.fdc.module1;

public class FirstApp {

    public static void main(String[] args) {
        System.out.println("First Parameters "+args[0]+" "+args[1]+" "+args[2]);

        int x= Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        int z=Integer.parseInt(args[2]);

        //int value = sumOfTwoNumber(10,25);
        System.out.println("Sum of Two Numbers="+sumOfTwoNumber(x,y,z));

        System.out.println("Sum of Two Numbers="+sumOfTwoNumber(18,20, 67));

    }

    public static int sumOfTwoNumber(int a, int b, int z){
       // int sum=a+b;
        return a+b+z;

    }





}
