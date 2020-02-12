package work71;

import java.util.Arrays;
import java.util.Scanner;

public class Task71 {
    public static void main(String[] args) {
        /*
        2. Добавьте в класс Task71 метод public static int[] createArray(int size),
        создает массив четных чисел, начиная с 2, размерностью size.
        3. Добавьте в класс Task71 метод public static void main(String[] args),
        который вводит количество элементов массива, создает массив, используя
        метод createArray() и выводит его в консоль.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        System.out.print("Result: " + Arrays.toString(createArray(sc.nextInt())));
    }
    public static int[] createArray(int size) {
        int[] me = new int[size];

        for (int i = 0; i < size; i++) {
            me[i] = 2 * (i + 1);
        }
        return me;
    }
}
