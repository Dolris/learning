package com.codespace.task3_4;

import java.util.ArrayList;

public class MyMixer<T> {
    public ArrayList array = new ArrayList();
    public MyMixer() {}
    public void shuffle() {
        int e;
        T el;
        if (array.isEmpty()) return;
        for (int i = 0; i < array.size() ; i++) {
            e = (int)(array.size() * Math.random());
            if (i != e) {
                el = (T)(array.get(i));
                array.set(i, array.get(e));
                array.set(e, el);
            }
        }
    }

}
