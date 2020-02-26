package com.codespace.task1;

import java.util.Scanner;

public class Runner {
    public void run() {
        Scanner sc = new Scanner(System.in);
        for (DaysOfWeek dow : DaysOfWeek.values()) {
            System.out.println("DOW " + dow.ordinal() + " is " + dow.name());
            switch (dow) {
                case MONDAY: case WEDNESDAY: case FRIDAY:
                    System.out.println("Java lessons today");
                    break;
                default: System.out.println("No Java lessons today");
                    break;
            }
        }
        System.out.println("The next day of week: " + DaysOfWeek.valueOf(sc.nextLine().toUpperCase()).nextDay());
    }
}
