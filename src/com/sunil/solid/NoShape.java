package com.sunil.solid;

public class NoShape implements Shape{

    @Override
    public double area() {
       throw new RuntimeException("Area cannot be calculated.");
    }
}
