package com.sunil.solid;

import java.util.List;

public class ShapesPrinter {

    private final Calculator calculator;

    public ShapesPrinter(Calculator calculator){
        this.calculator = calculator;
    }

    public String json(List<Shape> shapes){
        int sum = calculator.sum(shapes);
        return "{sum : %s}".formatted(sum);
    }

    public String csv(List<Shape> shapes){
        int sum = calculator.sum(shapes);
        return "sum,%s".formatted(sum);
    }

}
