package com.abc.geometry;

import com.xyz.Shape;

// Developer X of Company abc
public class Square extends Shape {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int area() {
        return this.side * this.side;
    }

    public int perimeter() {
        return 4 * this.side;
    }
}
