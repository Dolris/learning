package com.codespace.task3_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public void run() {
        MyMixer<String> s = new MyMixer<String>();
        s.array.add("AAA");
        s.array.add("BBB");
        s.array.add("CCC");
        s.array.add("DDD");
        s.array.add("EEE");
        MyMixer<Integer> i = new MyMixer<Integer>();
        i.array.add(1);
        i.array.add(2);
        i.array.add(3);
        i.array.add(4);
        i.array.add(5);
        System.out.println("Strings: " + s.array.toString());
        System.out.println("Integers: " + i.array.toString());
        s.shuffle();
        i.shuffle();
        System.out.println("Strings: " + s.array.toString());
        System.out.println("Integers: " + i.array.toString());
    }
}
