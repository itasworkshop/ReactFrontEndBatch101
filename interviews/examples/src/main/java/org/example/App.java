package org.example;

import static org.example.Calculator.addition;

/**
 * Hello world!
 *
 */

class Calculator{

    static String collgName = "IITR";
    //block
    {
       int a = 10;
    }

    public static int addition(int a,int b){
        int result = a+b;
        System.out.println( "addition is "+ result );
        System.out.println(collgName);
        return result;
    }

}


public class App 
{
    public static void main( String[] args )
    {

        System.out.println(addition(25,35));
        System.out.println( "Hello World!" );
    }
}
