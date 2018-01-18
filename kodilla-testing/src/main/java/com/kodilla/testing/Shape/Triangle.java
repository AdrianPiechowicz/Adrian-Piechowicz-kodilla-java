package com.kodilla.testing.Shape;

public class Triangle implements Shape {

    int side;
    int height;

    public Triangle(int side, int height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public  String getShapeName()
    {
        return "This is a triangle." ;
    }

    @Override
    public double getField() {
         return 0.5*side*height ;
    }
}
