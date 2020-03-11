package com.codespace.task3_2;

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
        double radius;
        switch (str[0].toUpperCase()) {
            case "CIRCLE":
                try {radius = Double.parseDouble(params[0]);}
                catch (NumberFormatException e)
                {throw new InvalidShapeStringException("Wrong radius parameter for CIRCLE");}
                if (!(radius > 0 ))
                    throw new InvalidShapeStringException("Wrong radius for CIRCLE");
                return new Circle(radius, str[1]);
            default: throw new InvalidShapeStringException("Wrong Input for CIRCLE");
        }
    }


}
