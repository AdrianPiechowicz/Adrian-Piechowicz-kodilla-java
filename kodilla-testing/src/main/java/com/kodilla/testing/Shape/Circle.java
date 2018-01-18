package com.kodilla.testing.Shape;

public class Circle implements Shape {
    int radius;
    public Circle(int radius) {
        this.radius= radius;
    }

    @Override
    public String getShapeName(){
        return "This is a circle.";
    }

    @Override
    public double getField() {
        return 2*3.14*radius*radius;
    }
}
