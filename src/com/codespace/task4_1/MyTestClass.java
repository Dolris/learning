package com.codespace.task4_1;

public class MyTestClass {
    private static final int A1 = 1;
    public void test() {
        class LokalClass {
            public void callMe() {
                System.out.println("Private variable #1 = " + A1);
                System.out.println("Static class variable #2 = " + MyTestClass.MyStaticNested.A2);
                MyInner i1 = new MyInner();
                System.out.println("Inner class variable #3 = " + i1.A3);
                i1.callMe();
            }
        }
        LokalClass l1 = new LokalClass();
        l1.callMe();
    }
    static class MyStaticNested {
        private static final int A2 = 2;
    }
    class MyInner {
        private static final int A3 = 3;
        public void callMe() {
            System.out.println("Private variable #1 = " + A1);
            System.out.println("Static class variable #2 = " + MyTestClass.MyStaticNested.A2);
        }
    }
}
