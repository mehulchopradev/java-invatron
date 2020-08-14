package com.abc.geometry;

import com.xyz.Shape;

// Developer Z of company abc joining 6 months after Developer X
public class Rectangle extends Shape {

    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return this.length * this.breadth;
    }

    public int perimeter() {
        return 2 * (this.length + this.breadth);
    }
}
