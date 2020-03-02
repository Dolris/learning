package com.codespace.task3_2;

import java.util.Scanner;

import static com.codespace.task3_2.Shape.parseShape;

public class Runner {
    public void run() {
        //Scanner sc = new Scanner(System.in);
        try{System.out.println("Run Triangle:GREEN:9,7,12: " + parseShape("Triangle:GREEN:9,7,12"));}
        catch (InvalidShapeStringException e) {System.out.println("error: " + e.getMessage());};
        try{System.out.println("Run Triangle:GREEN:9,0,12: " + parseShape("Triangle:GREEN:9,0,12"));}
        catch (InvalidShapeStringException e) {System.out.println("error: " + e.getMessage());};
        try{System.out.println("Run Triangle:GREEN:9,sss,12: " + parseShape("Triangle:GREEN:9,sss,12"));}
        catch (InvalidShapeStringException e) {System.out.println("error: " + e.getMessage());};
        try{System.out.println("Run Rectangle:RED:10,20: " + parseShape("Rectangle:RED:10,20"));}
        catch (InvalidShapeStringException e) {System.out.println("error: " + e.getMessage());};
        try{System.out.println("Run Rectangle:RED:10,0: " + parseShape("Rectangle:RED:10,0"));}
        catch (InvalidShapeStringException e) {System.out.println("error: " + e.getMessage());};
        try{System.out.println("Run Rectangle:RED:10,qqqqq: " + parseShape("Rectangle:RED:10,qqqqq"));}
        catch (InvalidShapeStringException e) {System.out.println("error: " + e.getMessage());};
        try{System.out.println("Run Circle:BLACK:10: " + parseShape("Circle:BLACK:10"));}
        catch (InvalidShapeStringException e) {System.out.println("error: " + e.getMessage());};
        try{System.out.println("Run Circle:BLACK:0: " + parseShape("Circle:BLACK:0"));}
        catch (InvalidShapeStringException e) {System.out.println("error: " + e.getMessage());};
        try{System.out.println("Run Circle:BLACK:bbbbb: " + parseShape("Circle:BLACK:bbbbb"));}
        catch (InvalidShapeStringException e) {System.out.println("error: " + e.getMessage());};
    }
}
