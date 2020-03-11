package com.codespace.task12_2;

public class MyTestMethod {
    public static <Type extends Comparable> int calcNum(Type[] array, Type maxValue) {
        int i = 0;
        for (Type a : array) {
            if (a.compareTo(maxValue) > 0) i++;
        }
        return i;
    }
    public static <Type extends Comparable> Double calcSum(Type[] array, Type maxValue) {
        Double i = 0.0;
        for (Type a : array) {
            if (a.compareTo(maxValue) > 0) i = i + Double.parseDouble(a.toString());
        }
        return i;
    }
}
