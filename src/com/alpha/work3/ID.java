package com.alpha.work3;

import java.util.Random;

public class ID {
    public int getId() {return id;}

    private int id;
    private static int nextId = new Random().nextInt(100);
    public ID() {
        this.id = nextId;
        nextId++;
    }
}
