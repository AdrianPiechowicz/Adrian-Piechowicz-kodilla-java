package com.kodilla.patterns2.aop.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTest {
    @Autowired
    private Calculator calculator;
    private static final Logger LOGGER = LoggerFactory.getLogger(CalculatorTest.class);
    @Test
    public void testAdd() {
        //given
        //when
        double result = calculator.add(1,1);
        //then
        LOGGER.info("Testing add method");
        assertEquals(2,result);
    }

    @Test
    public void testSub() {
        //given
        //when
        double result = calculator.sub(3,1);
        //then
        LOGGER.info("Testing sub method");
        assertEquals(2,result);
    }

    @Test
    public void testMul() {
        //given
        //when
        double result = calculator.mul(2,2);
        //then
        LOGGER.info("Testing mul method");
        assertEquals(4,result);
    }

    @Test
    public void testDiv() {
        //given
        //when
        double result = calculator.div(2,2);
        //then
        LOGGER.info("Testing div method");
        assertEquals(1,result);
    }

    @Test
    public void testFactorial() {
        //given
        //when
        BigDecimal result = calculator.factorial(new BigDecimal("5"));
        //then
        LOGGER.info("Testing facotiral method");
        System.out.println(result);
        assertTrue(BigDecimal.ONE.compareTo(result) < 0);
    }
}