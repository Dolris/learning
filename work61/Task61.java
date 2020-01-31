package work61;

import java.util.Scanner;

public class Task61 {
    public static void main(String[] args) {
        /*
        2. Добавьте в класс Task61 метод public static double areaTriangle(double a,
        double b, double c), который вычисляет и возвращает значение площади
        треугольника по формуле Герона:

        p ( p − a)( p − b)( p − c)

        , где a, b, c –

        стороны треугольника, p – полупериметр.
        3. Добавьте в класс Task61 метод public static void main(String[] args),
        который:
        − вводит значения сторон треугольника и выводит площадь
        треугольника, используя метод areaTriangle().
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 of triangle: ");
        double a = sc.nextDouble();
        System.out.print("Enter side 2 of triangle: ");
        double b = sc.nextDouble();
        System.out.print("Enter side 3 of triangle: ");
        double c = sc.nextDouble();
        System.out.println("Square is: " + areaTriangle(a, b, c));
    }
    public static double areaTriangle(double a, double b, double c) {
        double p = (a + b + c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
