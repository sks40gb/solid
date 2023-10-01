package com.sunil.solid;

import java.util.List;

public class ShapesPrinter {

    private AreaCalculator areaCalculator = new AreaCalculator();

    public String json(List<Shape> shapes){
        int sum = areaCalculator.sum(shapes);
        return "{sum : %s}".formatted(sum);
    }

    public String csv(List<Shape> shapes){
        int sum = areaCalculator.sum(shapes);
        return "sum,%s".formatted(sum);
    }

}
