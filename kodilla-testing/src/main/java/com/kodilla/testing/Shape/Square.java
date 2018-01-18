package com.kodilla.testing.Shape;

import com.kodilla.testing.Shape.Shape;

public class Square implements Shape {
    @Override
    public String getShapeName() {

        return "This is a square.";
    }

    @Override
    public double getField() {
        return 5*5;
    }
}
