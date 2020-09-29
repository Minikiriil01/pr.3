package com.company;

public class Rectangle extends Shape{
    protected double a;
    protected double b;
    public Rectangle(String color, boolean filled){
        super(color, filled);
        this.filled = false;
        this.color = "blue";
        a = 5;
        b = 6;
    }
    public Rectangle(String color, boolean filled, double a, double b){
        super(color, filled);
        this.filled = false;
        this.color = "blue";
        this.a = a;
        this.b = b;
    }
    public Rectangle(double a, double b, String color, boolean filled){
        super(color, filled);
        this.color = color;
        this.filled = filled;
        this.a = a;
        this.b = b;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public void setAB(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double getArea() {
        return Math.PI * a * b;
    }
    @Override
    public double getPerimeter() {
        return 2*a + 2*b;
    }
    @Override
    public String toString() {
        return "Фигура: прямоугольник, стороны : "+this.a + ", " + this.b + sep + "цвет : "+this.color; }
}
