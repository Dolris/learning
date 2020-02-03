package work72;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task72 {
    public static void main(String[] args) {
        /*
        2. Добавьте в класс Task72 метод public static int sumOddElementsArray(int[]
        array), который получает массив целых положительных значений и
        возвращает сумму нечетных элементов этого массива или -1, если с
        массивом что-то не так.
        3. Добавьте в класс Task72 метод public static void main(String[] args),
        который описывает массив целых положительных чисел, использует метод
        sumOddElementsArray() и выводит результат его работы.
         */
        int[] arr = {0,2,3,2,4,5,1};
        System.out.print("Array: " + Arrays.toString(arr));
        System.out.print(" >> " + sumOddElementsArray(arr));
    }
    public static int sumOddElementsArray(int[] array) {
        int sum = 0;
        for(int el : array) {
            if (el < 0) {return -1;}
            else if (el%2 == 1) {sum = sum + el;}
        }
        return sum;
    }
}
