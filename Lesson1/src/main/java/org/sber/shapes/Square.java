package org.sber.shapes;

public class Square extends Rect {

    private final int NUMBER_OF_SIDE = 4;

    private int sideA;

    public Square(){

    }

    public Square(int sideA) {
        this.sideA = sideA;
    }

    @Override
    public double perimeter() {
        return sideA*4;
    }

    @Override
    public double surfaceArea() {
        return sideA * sideA;
    }

}
