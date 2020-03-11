package com.codespace.task5;

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
    public static Circle parseCircle(String text) {
        String[] str = text.split(":",3);
        String[] params = (str[2]).split(",", -1);
        switch (str[0].toUpperCase()) {
            case "CIRCLE":
                return new Circle(Double.parseDouble(params[0]), str[1]);
            default: System.out.println("Wrong Input" + text + " for CIRCLE");
                return null;
        }
    }


}
