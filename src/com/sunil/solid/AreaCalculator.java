package com.sunil.solid;

import java.util.List;

public class AreaCalculator{

    public int sum(List<Object> shapes) {
        int sum = 0;
        for (Object shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = ((Circle) shape);
                sum += Math.PI * Math.pow(circle.getRadius(), 2);
            } else if (shape instanceof Square) {
                Square square= (Square) shape;
                sum +=  Math.pow(square.getLength(),2);
            }
        }
        return sum;
    }

}
