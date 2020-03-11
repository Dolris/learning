package com.codespace.task2_2;

import java.util.Scanner;

public class Runner {
    public void run() {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        System.out.print("Enter first name: ");
        p.setFirstName(sc.nextLine());
        System.out.print("Enter last name: ");
        p.setLastName(sc.nextLine());
        System.out.print("Enter age: ");
        try {p.setAge(sc.nextInt());}
        catch (InvalidAgeException e) {System.out.print("Error: " + e.getMessage());}
        System.out.println("Person: " + p);
    }
}
