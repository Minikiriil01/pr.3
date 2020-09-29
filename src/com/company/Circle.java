package com.company;

public class Circle extends Shape{
    protected double radius;
    public Circle(String color, boolean filled){
        super(color, filled);
        this.filled = false;
        this.color = "blue";
        radius = 3;
    }
    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.filled = false;
        this.color = "blue";
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    @Override
    public String toString() {
        return "Фигура: окружность - радиус - : "+this.radius+ sep + "цвет: "+this.color; }
}
