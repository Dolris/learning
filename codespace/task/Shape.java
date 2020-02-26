package com.codespace.task;

public abstract class Shape implements Drawable, Comparable, Cloneable {
    private String color;
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
    public Shape() {this("Unknown");}
    public Shape(String color) {this.color = color;}
    @Override
    public String toString() {return "class=" + this.getClass().getSimpleName() + ", color=" + getColor();}
    public abstract double calcArea();
    @Override
    public void draw() {
        System.out.println(this.toString() + ", area = " + this.calcArea());
    }
    @Override
    public int compareTo(Object obj) {
        return Double.compare(this.calcArea(), ((Shape) obj).calcArea());
    }
    @Override
    public Object clone() {
        Shape shape = null;
        try{ shape = (Shape) super.clone();
            shape.color = new String (this.color);
        } catch(CloneNotSupportedException cns) {
            System.out.println("Error while cloning shape" + cns);
        } return shape;
    }

}
