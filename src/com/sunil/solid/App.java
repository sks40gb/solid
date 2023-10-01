package com.sunil.solid;

import java.util.List;

public class App {

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        List<Object> shapes = List.of(circle, square);

        int sum = areaCalculator.sum(shapes);
        //System.out.println("Total sum : " + sum);
        System.out.println(areaCalculator.json(shapes));  //{sum : 414}
        System.out.println(areaCalculator.csv(shapes));   //sum,414

    }
}
