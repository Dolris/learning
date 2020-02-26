package com.codespace.task4;

public class Runner {
    public void run() {
        Integer i1 = new Integer(42);
        Integer i2 = new Integer("33");
        Integer i3 = Integer.valueOf(25);
        Integer i4 = new Integer(42);

        Integer i5 = new Integer(223);
        Integer i6 = new Integer(435);
        Integer i7 = new Integer(999999);
        Integer i8 = new Integer(223);

        System.out.println("i1 = " + i1 + ", i2 = " + i2 + " using == got " + (i1 == i2));
        System.out.println("i1 = " + i1 + ", i3 = " + i3 + " using equals got " + (i1.equals(i3)));
        System.out.println("i1 = " + i1 + ", i4 = " + i4 + " using == got " + (i1 == i4));
        System.out.println("i1 = " + i1 + ", i4 = " + i4 + " using equals got " + (i1.equals(i4)));

        System.out.println("i5 = " + i5 + ", i6 = " + i6 + " using == got " + (i5 == i6));
        System.out.println("i5 = " + i5 + ", i7 = " + i7 + " using equals got " + (i5.equals(i7)));
        System.out.println("i5 = " + i5 + ", i8 = " + i8 + " using == got " + (i5 == i8));
        System.out.println("i5 = " + i5 + ", i8 = " + i8 + " using equals got " + (i5.equals(i8)));

        System.out.println("Byte 101 + Double 98799.78 = " + compute(new Byte("101"), new Double("98799.78")));
    }
    public Integer compute(Byte a, Double b) {
        return a.intValue() + b.intValue();
    }
}
