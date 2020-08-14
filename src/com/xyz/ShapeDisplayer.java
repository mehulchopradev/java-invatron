package com.xyz;

public class ShapeDisplayer {

    public static void displayShape(Shape shape) {
        // any sub class of Shape can be passed here
        System.out.println("************************************************");
        System.out.println("Area of shape is " + shape.area());
        System.out.println("Perimeter of shape is " + shape.perimeter());
        System.out.println("************************************************");
    }
}
