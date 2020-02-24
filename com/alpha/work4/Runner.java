package com.alpha.work4;

import com.alpha.work4.calcarea.Calculate;

import java.util.Scanner;

public class Runner {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        System.out.println("Square is: " + Calculate.areaCircle(sc.nextDouble()));
        System.out.print("Enter square size: ");
        System.out.println("Square is: " + Calculate.areaSquare(sc.nextInt()));
    }
}
