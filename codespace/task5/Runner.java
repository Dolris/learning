package com.codespace.task5;

import static com.codespace.task5.Shape.parseShape;

public class Runner {
    public void run() {
        System.out.println("Run Rectangle:RED:10,20: " + Shape.parseShape("Rectangle:RED:10,20"));
        System.out.println("Run Circle:BLACK:10: " + Shape.parseShape("Circle:BLACK:10"));
        System.out.println("Run Triangle:GREEN:9,7,12: " + Shape.parseShape("Triangle:GREEN:9,7,12"));
    }
}
