package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    public  int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int sum(){
       return getA() + getB();
    }

    public int subtract(){
        return getA() - getB();
    }
}
