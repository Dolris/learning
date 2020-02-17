package com.alpha.work2a;

public class Circle extends Shape {
    private double radius = 0;
    public double getRadius() { return radius;}
    public void setRadius(double radius) {this.radius = radius;}
    public Circle() {
        this(0.0);
    }
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.setColor(color);
    }
    @Override
    public String toString() {return super.toString() + ", radius=" + radius;}
    @Override
    public double calcArea() {return Math.PI*radius*radius;}



}
