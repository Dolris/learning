package com.codespace.task3_2;

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
    public static Rectangle parseRectangle(String text) {
        String[] str = text.split(":",3);
        String[] params = (str[2]).split(",", -1);
        int side1;
        int side2;
        switch (str[0].toUpperCase()) {
            case "RECTANGLE":
                try {
                    side1 = Integer.parseInt(params[0]);
                    side2 = Integer.parseInt(params[1]);
                }
                catch (NumberFormatException e)
                {throw new InvalidShapeStringException("Wrong side parameters for RECTANGLE");}
                if (!(side1 > 0 && side2 > 0))
                    throw new InvalidShapeStringException("Wrong sides for RECTANGLE");
                return new Rectangle(side1,side2, str[1]);
            default: throw new InvalidShapeStringException("Wrong Input for RECTANGLE");
        }
    }
}
