package com.kodilla.testing.forum;

public class Triangle implements Shape{
    private int height;
    private int a;

    public Triangle(int height, int a) {
        this.height = height;
        this.a = a;
    }

    public int getHeight() {
        return height;
    }

    public int getA() {
        return a;
    }

    @Override
    public String drawShape() {
        return "Triangle";
    }

    @Override
    public double calcField() {
        return (getA() * getHeight())/2;
    }
}
