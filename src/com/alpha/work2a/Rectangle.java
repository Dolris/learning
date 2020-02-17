package com.alpha.work2a;

public class Rectangle extends Shape {
    private double width = 0;
    private double height = 0;
    public double getWidth() {return width;}
    public double getHeight() {return height;}
    public void setWidth(double width) {this.width = width;}
    public void setHeight(double height) {this.height = height;}

    public Rectangle() {this(0.0 , 0.0);}
    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.setColor(color);
    }
    @Override
    public String toString() {return super.toString() + ", width=" + width + ", height=" + height;}
    @Override
    public double calcArea() {return width*height;}
}
