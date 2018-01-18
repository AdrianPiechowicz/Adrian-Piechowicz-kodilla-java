package com.kodilla.testing.Shape;

import com.kodilla.testing.Shape.Shape;

public class Square implements Shape {
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {

        return "This is a square.";
    }

    @Override
    public double getField() {
        return side*side;
    }
}
