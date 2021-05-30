package com.kodilla.testing.forum;

public class Square implements Shape{

    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    @Override
    public String drawShape() {
        return "Square";
    }

    @Override
    public double calcField() {
        return Math.pow(a, 2);
    }
}
