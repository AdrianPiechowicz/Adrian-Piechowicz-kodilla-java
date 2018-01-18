package com.kodilla.testing.Shape;

public class Triangle implements Shape {

    @Override
    public  String getShapeName()
    {
        return "This is a triangle." ;
    }

    @Override
    public double getField() {
         return 0.5*5*7 ;
    }
}
