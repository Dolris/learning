package com.codespace.task;

public abstract class Shape implements Drawable {
    private String color;
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
    public Shape() {this("Unknown");}
    public Shape(String color) {this.color = color;}
    @Override
    public String toString() {return "class=" + this.getClass().getSimpleName() + ", color=" + getColor();}
    public abstract double calcArea();
    @Override
    public void draw(){
        System.out.println(this.toString() + ", area = " + this.calcArea());
    }
}
