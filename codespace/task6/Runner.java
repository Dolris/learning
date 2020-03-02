package com.codespace.task6;

import java.util.Scanner;

public class Runner {
    public void run() {
        Scanner sc = new Scanner(System.in);
        try {
        System.out.println("a = 5, b = 3, division = " + divisionInt(5, 3));}
        catch (ArithmeticException e) {System.out.println("Sorry, no result " + e.getMessage());}
        try {System.out.println("a = 0, b = 3, division = " + divisionInt(0, 3));}
        catch (ArithmeticException e) {System.out.println("Sorry, no result " + e.getMessage());}
        try {System.out.println("a = 5, b = 0, division = " + divisionInt(5, 0));}
        catch (ArithmeticException e) {System.out.println("Sorry, no result "+ e.getMessage());}
        try {System.out.println("a = 2.54, b = 3.02, division double = " + divisionDouble(2.54, 3.02));}
        catch (ArithmeticException e) {System.out.println("Sorry, error "+ e.getMessage());}
        try {System.out.println("a = 2.54, b = 0.0, division double = " + divisionDouble(2.54, 0));}
        catch (ArithmeticException e) {System.out.println("Sorry, error "+ e.getMessage());}
    }
    private Integer divisionInt(int a, int b) {
        return a/b;
    }
    private Double divisionDouble(double a, double b) {
        if (b == 0) throw new ArithmeticException();
        return a/b;
    }
}
