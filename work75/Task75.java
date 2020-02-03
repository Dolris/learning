package work75;

import java.util.Arrays;
import java.util.Scanner;

public class Task75 {
    public static void main(String[] args) {
        /*
        2. Добавьте в класс Task75 метод public static int[]
        countOfSequenceNumbers(String numbers), который получает
        последовательность цифр numbers в виде строки символов (символы из
        диапазона ['1'– '9']) и подсчитывает в этой последовательности количество
        единиц, количество двоек, количество троек и т.д., записывая их в массив.
        3. Добавьте в класс Task75 метод public static void main(String[] args),
        который вводит строку цифровых символов, обрабатывает ее методом
        countOfSequenceNumbers() и выводит результат.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string of digits: ");
        System.out.println(">>>" + Arrays.toString(countOfSequenceNumbers(sc.nextLine())));
    }

    public static int[] countOfSequenceNumbers(String numbers) {
        int[] counter = {0,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < numbers.length(); i++) {
            counter[Integer.parseInt("" + numbers.charAt(i))]++;
        }
        return counter;
    }
}
