package com.fdc.module1;

public class UseAddition {

    public static void main(String[] args) {
        Addition a1=new Addition();
        a1.setX(10);
        a1.setY(20);
       int sum= a1.addition(a1.getX(),a1.getY());
        System.out.println("Sum="+sum);

    }
}
