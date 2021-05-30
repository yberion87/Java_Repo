package com.kodilla.testing.forum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeCollectorTest {
    @Test
    public void testAddShapes(){

        //Given
        Shape circle = new Circle(4);
        Shape triangle = new Triangle(3,2);
        Shape square = new Square(5);

        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);

        //Then
        int result = shapeCollector.getListOfShapes().size();

        //When
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testRemoveShapes(){
        //Given
        Shape circle = new Circle(4);
        Shape triangle = new Triangle(3,2);
        Shape square = new Square(5);

        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);

        //When
        boolean result = shapeCollector.removeFigure(square);

        //Then
        Assertions.assertTrue(result);
    }

    @Test
    public void testGetFigure(){
        //Given
        Shape circle = new Circle(4);
        Shape triangle = new Triangle(3,2);
        Shape square = new Square(5);

        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);

        //When

        String result = shapeCollector.getFigure(0);

        //Then
        Assertions.assertEquals("Circle", result);
    }


}