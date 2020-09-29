package com.company;

public class Square extends Rectangle{
    protected double a;

    public Square(String color, boolean filled) {
        super(color, filled);
        this.filled = false;
        this.color = "blue";
        a = 7;
    }

    public Square(String color, boolean filled, double a) {
        super(color, filled);
        this.filled = false;
        this.color = "blue";
        this.a = a;
    }

    public Square(double a, String color, boolean filled) {
        super(color, filled);
        this.color = color;
        this.filled = filled;
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setAB(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return Math.PI * a * a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }

    @Override
    public String toString() {
        return "Фигура: прямоугольник, сторона - : " + this.a + sep + "Цвет: " + this.color;
    }
}
