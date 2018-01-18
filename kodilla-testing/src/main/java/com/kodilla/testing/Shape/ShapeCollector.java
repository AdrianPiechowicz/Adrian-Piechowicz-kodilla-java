package com.kodilla.testing.Shape;

import java.util.LinkedList;

public class ShapeCollector {
    LinkedList<Shape> collection = new LinkedList<Shape>();

    public void addFigure(Shape shape){
        collection.add(shape);
    }

    public void removeFigure(Shape shape){
        collection.remove(shape);
    }

    public Shape getFigure(int n){
        Shape result =collection.get(n);
        return result;
    }

    public void showFigures(){
        int i=0;
        for (Shape shape: collection){

            System.out.println("Shape "+i+" is "+shape);
            i++;
        }

    }

    public LinkedList<Shape> getCollection(){
        return collection;
    }

}
