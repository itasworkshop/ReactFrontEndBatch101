package org.example;

class Calculator1{

    //over loading-- same method but different implement -- based on no of par or type of para
    public void addition(int a,int b){
        System.out.println("hello from two input");
        System.out.println(a+b);
    }

    public void addition(int a,int b,int c){
        System.out.println("hello from three input");
        System.out.println(a+b+c);
    }

}

public class TestOverLoading {
    public static void main( String[] args ) {
        Calculator1 obj = new Calculator1();
        obj.addition(10,20);
    }
}
