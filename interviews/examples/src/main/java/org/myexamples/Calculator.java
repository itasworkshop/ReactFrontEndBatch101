package org.myexamples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public int addition(int a,int b){
        return a+b;
    }

    public int division(int a,int b){
        return a/b;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.addition(25, 35));
        //System.out.println(obj.division(25,0));
        logger.debug("Performing Subtraction --->");
        logger.debug(obj.division(25, 5));
        //logger.error(obj.division(25,0));

        try {
            obj.division(25, 0);
        } catch (ArithmeticException e) {
            logger.error("{}", e.getMessage());
        }
    }
}
