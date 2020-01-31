package work65;

import java.util.Scanner;

public class Task65 {
    public static void main(String[] args) {
        /*
        2. Добавьте в класс Task65 метод public static void printPyramid(int height),
        который создает и выводит на консоль пирамиду высотой height (значение в
        диапазоне от 1 по 9). Например, для height = 4:

           1
          121
         12321
        1234321

        3. Добавьте в класс Task65 метод public static void main(String[] args),
        который вводит высоту пирамиды и выводит пирамиду с использованием
        метода printPyramid().
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pyramid height: ");
        printPyramid(sc.nextInt());
    }
    public static void printPyramid(int height) {
        if (height < 1 || height > 9) {
            System.out.println("Wrong height");
            return;
        }
        for (int row = 1; row <= height; row++) {
            // spaces
            for (int i = 0; i < height - row; i++) {
                System.out.print(" ");
            }
            // digit asc
            for (int i = 0; i < row; i++) {
                System.out.print(i + 1);
            }
            // digit desc
            for (int i = row - 1; i > 0; i--) {
                System.out.print(i);
            }
            // spaces
            //for (int i = 0; i < height - row; i++) {
            //    System.out.print(" ");
            //}
            System.out.println("");
        }
    }
}
