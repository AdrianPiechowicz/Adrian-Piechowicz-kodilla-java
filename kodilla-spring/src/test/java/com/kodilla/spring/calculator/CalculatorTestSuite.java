package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //When
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 6;
        double b = 2;

        //Given
        String sumResult = calculator.sum(a,b);
        String subResult = calculator.sub(a,b);
        String mulResult = calculator.mul(a,b);
        String divResult = calculator.div(a,b);

        //Then
        Assert.assertEquals("Value of the operation is 8.0.",sumResult);
        Assert.assertEquals("Value of the operation is 4.0.",subResult);
        Assert.assertEquals("Value of the operation is 12.0.",mulResult);
        Assert.assertEquals("Value of the operation is 3.0.",divResult);

    }
}
