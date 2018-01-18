package com.kodilla.testing.Shape;

public class Circle implements Shape {

    public Circle() {
    }

    @Override
    public String getShapeName(){
        return "This is a circle.";
    }

    @Override
    public double getField() {
        return 2*3.14*5*5;
    }
}
