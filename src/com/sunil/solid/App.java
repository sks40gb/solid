package com.sunil.solid;

import java.util.List;

public class App {

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube(2);
        List<Shape> shapes = List.of(circle, square, cube);

        ShapesPrinter printer =  new ShapesPrinter(new AreaCalculator());
        System.out.println(printer.json(shapes));
        System.out.println(printer.csv(shapes));

    }
}
