package org.myexamples;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calc= new Calculator();

    @Test
    public void testAddition(){
        Assert.assertEquals(calc.addition(5,35),40);
    }
}
