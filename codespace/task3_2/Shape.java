package com.codespace.task3_2;

public class Shape {
    private String color;
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
    public Shape() {this("Unknown");}
    public Shape(String color) {this.color = color;}
    @Override
    public String toString() {return "class=" + this.getClass().getSimpleName() + ", color=" + getColor();}
    public double calcArea() {return 0.0;}
    public static Shape parseShape(String text) {
        String[] str = text.split(":",3);
        switch (str[0].toUpperCase()) {
            case "RECTANGLE":
                return Rectangle.parseRectangle(text);
            case "TRIANGLE":
                return Triangle.parseTriangle(text);
            case "CIRCLE":
                return Circle.parseCircle(text);
            default: throw new InvalidShapeStringException("Can not parse string to shape");
        }
    }
}
