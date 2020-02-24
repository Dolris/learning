package com.alpha.work1a;

public class Runner {
    public void run() {
        Device d = new Device("KJKJBKLBNJK", "Great_Plant", 5250.15);
        Monitor m = new Monitor("HD2000", "Samsung", 3300.99, 1600, 900);
        Monitor m1 = new Monitor("HD2000", "Samsung", 3300.99, 1600, 900);
        EthernetAdapter e = new EthernetAdapter("RT202020VC", "Asus", 516.99, 1000, "a-a-a-a-a-a-a-a");
        System.out.println(d);
        System.out.println(m);
        System.out.println(m1);
        System.out.println(m.equals(m1));
        System.out.println("Hash of monitor = " + m.hashCode());
        System.out.println("Hash of EthernetAdapter = " + e.hashCode());
        System.out.println(e);
    }
}
