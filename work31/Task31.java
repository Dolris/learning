package work31;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        /*
        1. Создайте проект PracticalWork3 с пакетом work31, в котором создайте
        класс Task31.
        2. Добавьте в класс Task31 метод public static void main(String[] args) { }.
        3. Добавьте в метод main(...) код, который преобразует вес, заданный в
        фунтах, в килограммы, но выводит раздельно количество полученных
        килограмм и грамм (в 1 фунте 453,6 грамм).
        4. Запустите приложение на исполнение.*/
        Scanner sc = new Scanner(System.in);
        double grams = 453.6 * Integer.parseInt(sc.nextLine());
        System.out.println("It's " + (int)(grams/1000.0) + " kilograms and " +
                (grams - 1000*(int)(grams/1000.0)) + " grams");
    }
}
