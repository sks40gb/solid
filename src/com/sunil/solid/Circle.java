package com.sunil.solid;

public class Circle implements Shape{
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double area() {
       return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double volume() {
        throw new RuntimeException("I am forced to implement this method");
    }
}

