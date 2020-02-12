package work62;

import java.util.Scanner;

public class Task62 {
    public static void main(String[] args) {
        /*
        2. Добавьте в класс Task62 метод public static String latestDigit(int number),
        который получает целое число, определяет две последние цифры и
        возвращает их в виде строки символов в обратном порядке.
        3. Добавьте в класс Task62 метод public static void main(String[] args),
        который вводит переменную целого типа и выводит результат ее
        обработки методом latestDigit().
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        System.out.println("Result is: " + latestDigit(sc.nextInt()));
    }
    public static String latestDigit(int number) {
        return "" + number%10 + (number%100)/10;
    }
}
