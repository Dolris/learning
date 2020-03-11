package com.codespace.task3_3;

import com.codespace.task3_3.MyPhone;

public class Runner {
    public void run() {
        MyPhone mp = new MyPhone();
        mp.swichOn();
        System.out.println("====================");
        mp.call(7);
    }
}
