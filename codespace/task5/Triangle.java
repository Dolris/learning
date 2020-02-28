package com.codespace.task5;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;
    public double getA() {return a;}
    public double getB() {return b;}
    public double getC() {return c;}
    public void setA(double a) {this.a = a;}
    public void setB(double b) {this.b = b;}
    public void setC(double c) {this.c = c;}
    public Triangle(double a, double b, double c, String color) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.setColor(color);
    }
    public Triangle(double a, double b, double c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Triangle() {this(0.0 , 0.0, 0.0);}
    @Override
    public String toString() {return super.toString() + ", a=" + a + ", b=" + b + ", c=" + c;}
    @Override
    public double calcArea() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public static Triangle parseTriangle(String text) {
        String[] str = text.split(":",3);
        String[] params = (str[2]).split(",", -1);
        switch (str[0].toUpperCase()) {
            case "TRIANGLE":
                return new Triangle(Integer.parseInt(params[0]), Integer.parseInt(params[1]), Integer.parseInt(params[2]), str[1]);
            default: System.out.println("Wrong Input" + text + " for TRIANGLE");
                return null;
        }
    }
}
