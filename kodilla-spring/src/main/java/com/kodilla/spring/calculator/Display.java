package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {
    public String displayValue(double value) {
        return "Value of the operation is "+value+".";
    }
}
