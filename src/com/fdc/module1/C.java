package com.fdc.module1;

public class C extends A{
    int c=20;

    public void printC(){
        System.out.println("I am in Class C= "+c);
    }

    public static void main(String[] args) {
        C c1=new C();
        c1.printC();
        c1.printA();
    }
}
