package com.sunil.solid;

public class Cube implements Shape, ThreeDShape{

    private final int length;

    public Cube(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getLength(), 6);
    }

    @Override
    public double volume() {
        return Math.pow(getLength(), 3);
    }


}
