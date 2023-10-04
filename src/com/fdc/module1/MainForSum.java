package com.fdc.module1;

import java.util.Scanner;

public class MainForSum {
    public static void main(String[] args) {
        SumOfNaturalNumbers snm = new SumOfNaturalNumbers();
        int sum;int n;

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number to sum");
        n = scn.nextInt();
        sum = snm.getTheSumOfNaturalNumbersByUsingForLoop(n);
        System.out.println("Sum of Natural Number up to 10 (For Loop)=" + sum);

        System.out.println("Enter the number to sum");
        n = scn.nextInt();
        sum = snm.getTheSumOfNaturalNumbersByUsingWhileLoop(n);
        System.out.println("Sum of Natural Numbers up to 10 (Using While Loop)=" + sum);


    }
}
