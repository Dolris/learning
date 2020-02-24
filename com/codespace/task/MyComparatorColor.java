package com.codespace.task;

import java.util.Comparator;

public class MyComparatorColor implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        return (((Shape)obj1).getColor()).compareTo(((Shape)obj2).getColor());
    }
}
