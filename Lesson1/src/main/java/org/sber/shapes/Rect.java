package org.sber.shapes;

public class Rect extends Shape{

    private final int NUMBER_OF_SIDE = 4;

    private int sideA;
    private int sideB;

    public Rect() {
    }

    public Rect(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double perimeter() {
        return (sideA + sideB)*2;
    }

    @Override
    public double surfaceArea() {
        return sideA * sideB;
    }

}
