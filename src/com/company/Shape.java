package com.company;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    String sep = System.getProperty("line.separator");

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String toString() {
        return "";
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
