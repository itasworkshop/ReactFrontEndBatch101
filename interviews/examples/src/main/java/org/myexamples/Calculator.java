package org.myexamples;

public class Calculator {

    public int addition(int a,int b){
        return a+b;
    }

    public static void main(String[] args){
        Calculator obj = new Calculator();
        System.out.println(obj.addition(25,35));
    }
}
