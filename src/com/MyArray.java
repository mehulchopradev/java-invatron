package com;

// MyArray is a type - data type
// Data type can be parameterized

// If the MyArray object is created with an Integer parameter data, then
// get() shud return Integer
// set() shud expect Integer

// If the MyArray object is created with an String parameter data, then
// get() shud return String
// set() shud expect String

// Generic classes
public class MyArray<E extends Number> { // Type parameter must be something which is a Object. Doesnt support primitives

    E[] elements;

    public MyArray(E[] elements) {
        this.elements = elements;
    }

    public E get(int index) {
        return this.elements[index-1];
    }

    public void set(int index, E element) {
        this.elements[index - 1] = element;
    }

    public void printAll() {
        for (E element: this.elements) {
            System.out.println(element);
        }
    }
}
