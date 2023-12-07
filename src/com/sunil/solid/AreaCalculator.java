package com.sunil.solid;

import java.util.List;

public class AreaCalculator implements Calculator{

    public int sum(List<Shape> shapes) {
        int sum = 0;
        for (Shape shape : shapes) {
            sum += shape.area();
        }
        return sum;
    }

}
