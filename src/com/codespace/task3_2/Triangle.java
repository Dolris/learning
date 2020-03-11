package com.codespace.task3_2;

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
        int side1;
        int side2;
        int side3;
        switch (str[0].toUpperCase()) {
            case "TRIANGLE":
                try {
                    side1 = Integer.parseInt(params[0]);
                    side2 = Integer.parseInt(params[1]);
                    side3 = Integer.parseInt(params[2]);
                }
                catch (NumberFormatException e)
                {throw new InvalidShapeStringException("Wrong side parameters for TRIANGLE");}
                if (!(side1 > 0 && side2 > 0  && side3 > 0))
                    throw new InvalidShapeStringException("Wrong sides for TRIANGLE");
                    return new Triangle(side1, side2, side3, str[1]);
            default: throw new InvalidShapeStringException("Wrong Input for TRIANGLE");
        }
    }
}
