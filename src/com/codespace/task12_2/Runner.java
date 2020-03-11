package com.codespace.task12_2;

import java.util.function.DoubleToIntFunction;

public class Runner {
    public void run() {
        Integer[] i = new Integer[10];
        Double[] d = new Double[10];
        for (int k = 0; k <10; k++) {
            i[k] = (int)(20*Math.random());
            System.out.println("Integer " + k + " is " + i[k]);
            d[k] = 20*Math.random();
            System.out.println("Double " + k + " is " + d[k]);
        }
        System.out.println("Integers more than 7 - " + MyTestMethod.<Integer>calcNum(i, 7));
        System.out.println("Integers sum = " + MyTestMethod.<Integer>calcSum(i, 7));
        System.out.println("Doubles more than 7,54 - " + MyTestMethod.<Double>calcNum(d, 7.54));
        System.out.println("Doubles sum = " + MyTestMethod.<Double>calcSum(d, 7.54));
    }
}
