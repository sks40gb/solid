package com.sunil.solid;

import java.util.List;

public class App {

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube(2);
        List<Object> shapes = List.of(circle, square, cube);

        int sum = areaCalculator.sum(shapes);
        ShapesPrinter printer =  new ShapesPrinter();
        System.out.println(printer.json(sum));  //{sum : 478}
        System.out.println(printer.csv(sum));   //sum,478

    }
}
