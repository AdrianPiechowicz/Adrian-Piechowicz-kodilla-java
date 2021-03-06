package com.kodilla.testing.Shape;

import org.junit.*;
import com.kodilla.testing.Shape.Shape;
import com.kodilla.testing.Shape.Circle;
import com.kodilla.testing.Shape.ShapeCollector;

import java.util.LinkedList;

public class ShapeCollectionTestSuite {
    private static int counter =0;
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test suite begin.");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Test suite end.");
    }

    @Before
    public void before(){
        counter++;
        System.out.println("Test case "+counter);
    }

    @After
    public void after(){
        System.out.println("Test case ends.");
    }

    @Test
    public void testAddFigure(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        Circle circle = new Circle(2);
        shapeCollector.addFigure(circle);

        //then
        Assert.assertEquals(1,shapeCollector.collection.size());
    }

    @Test
    public void testRemoveFigure(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        Square square = new Square(2);
        shapeCollector.addFigure(square);
        shapeCollector.removeFigure(square);

        //then
        Assert.assertEquals(0,shapeCollector.collection.size());
    }

    @Test
    public void testGetFigure(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        Triangle shape3 = new Triangle(3,5);
        shapeCollector.addFigure(new Square(3));
        shapeCollector.addFigure(new Circle(3));
        shapeCollector.addFigure(shape3);
        Shape result = shapeCollector.getFigure(2);

        //then
        Assert.assertEquals(shape3,result);
    }

    @Test
    public void testShowFigures(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        shapeCollector.addFigure(new Square(2));
        shapeCollector.addFigure(new Circle(2));
        LinkedList<Shape> result = shapeCollector.getCollection();

        //then
        Assert.assertEquals(2,result.size());
        Assert.assertEquals("This is a square.",result.get(0).getShapeName());
        Assert.assertEquals("This is a circle.",result.get(1).getShapeName());

    }

    @Test
    public void testGetField(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        shapeCollector.addFigure(new Square(5));
        double result = shapeCollector.getFigure(0).getField();

        //then
        Assert.assertEquals(25,result,0);
    }

}
