package com.fdc.module1;

public class SumOfNaturalNumbers {

    public int getTheSumOfNaturalNumbersByUsingForLoop(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            //System.out.println("The current sum=" + sum);
        }

        return sum;

    }


    public int getTheSumOfNaturalNumbersByUsingWhileLoop(int n){
        int sum=0;
        int i=1;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        return sum;
    }


}
