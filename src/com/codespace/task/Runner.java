package com.codespace.task;

import java.util.Arrays;

public class Runner {
    public void run() throws CloneNotSupportedException {
        Shape[] shapes = new Shape[9];
        shapes[0] = new Rectangle(1.1,2.2, "Red");
        shapes[1] = new Rectangle(3.5,5.7, "Blue");
        shapes[2] = new Rectangle(7.9,11.17, "Green");
        shapes[3] = new Rectangle(13.17,31.22, "Brown");

        shapes[4] = new Circle(1.2, "Red");
        shapes[5] = new Circle(3.5, "Blue");
        shapes[6] = new Circle(7.11, "Green");

        shapes[7] = new Triangle(7.9,11.17, 13.18, "Green");
        shapes[8] = new Triangle(13.17,31.22, 23.7, "Brown");
        showShapes(shapes);
        System.out.println("Sum of all areas: " + sumArea(shapes));
        System.out.println("Sum of Circle areas: " + sumSpecificArea(shapes, "Circle"));
        System.out.println("Sum of Rectangle areas: " + sumSpecificArea(shapes, "Rectangle"));
        System.out.println("Sum of Triangle areas: " + sumSpecificArea(shapes, "Triangle"));

        System.out.println("Comparing Rectangles 1 vs 2: " + shapes[0].compareTo(shapes[1]));
        System.out.println("Comparing Rectangles 4 vs 3: " + shapes[3].compareTo(shapes[2]));

        System.out.println("Sorting shapes");
        Arrays.sort(shapes);
        showShapes(shapes);

        System.out.println("Sorting shapes using comparator");
        Arrays.sort(shapes, new MyComparatorColor());
        showShapes(shapes);

        System.out.println("Cloning");
        Shape shapeClone = shapes[0].clone();
        shapeClone.draw();
        shapes[0].draw();

    }
    public void showShapes(Shape[] shapes) {
        for (Shape s : shapes) {
            //System.out.println("Object: "+ s + "; Area=" + s.calcArea());
            s.draw();
        }
    }
    public double sumArea(Shape[] shapes) {
        double area = 0;
        for (Shape s : shapes) {
            area = area + s.calcArea();
        }
        return area;
    }
    public double sumSpecificArea(Shape[] shapes, String shapetype) {
        double area = 0;
        for (Shape s : shapes) {
            area = area + (s.getClass().getSimpleName().equals(shapetype)?s.calcArea():0);
        }
        return area;
    }
}
