package work64;

import java.util.Scanner;

public class Task64 {
    public static void main(String[] args) {
        /*
        2. Добавьте в класс Task64 метод public static String
        convertDecimalToBinary(int number), который получает некоторое целое
        положительное число number, преобразует его в двоичное число и
        возвращает в виде строки символов.
        3. Добавьте в класс Task64 метод public static void main(String[] args),
        который вводит целое число и выводит результат его обработки методом
        convertDecimalToBinary().
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal: ");
        System.out.println("Result is: " + convertDecimalToBinary(sc.nextInt()));
    }
    public static String convertDecimalToBinary(int number) {
        String str = "";
        System.out.println("For check: " + Integer.toBinaryString(number));
        while (number > 1) {
            str = number%2 + str;
            number = number/2;
        }
        return number%2 + str;
    }
}
