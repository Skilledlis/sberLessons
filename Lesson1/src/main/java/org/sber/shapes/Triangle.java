package org.sber.shapes;

public class Triangle extends Shape{

    private final int NUMBER_OF_SIDE = 3;

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double perimeter() {
        return sideA+sideB+sideC;
    }

    @Override
    public double surfaceArea() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p-sideA) * (p - sideB) * (p - sideC));
    }
}
