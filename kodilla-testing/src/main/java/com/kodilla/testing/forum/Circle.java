package com.kodilla.testing.forum;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String drawShape() {
        return "Circle";
    }

    @Override
    public double calcField() {
        return Math.PI * Math.pow(radius,2);
    }
}
