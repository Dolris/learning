package com.alpha.work1;

public class MyCalculate {
    /*
    3. Добавьте в пакет work1 класс MyCalculate со статическим методом
    calcPi(), задача которого вычислить и вернуть значение числа π по
    переданному ему количеству элементов ряда n:
    π = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...
     */
    public static double calcPi(int n) {
        int sign = 1;
        double pi = 0;
        if (n < 1) {
            System.out.println("Wrong param");
            return pi;
        }
        for (int i = 1; i < 2*n; i = i + 2) {
            pi = pi + sign * (double)4/i;
            sign = -1 * sign;
        }
        return pi;
    }
}
