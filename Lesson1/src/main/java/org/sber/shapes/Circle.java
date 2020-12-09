package org.sber.shapes;

public class Circle extends Shape{

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double surfaceArea() {
        return Math.PI * (radius*radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
