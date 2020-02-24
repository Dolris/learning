package com.alpha.work2a;

public class Shape {
    private String color;
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
    public Shape() {this("Unknown");}
    public Shape(String color) {this.color = color;}
    @Override
    public String toString() {return "class=" + this.getClass().getSimpleName() + ", color=" + getColor();}
    public double calcArea() {return 0.0;}
}
