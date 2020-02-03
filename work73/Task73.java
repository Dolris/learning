package work73;

import java.util.Arrays;
import java.util.Scanner;

public class Task73 {
    public static void main(String[] args) {
        /*
        2. Добавьте в класс Task73 метод public static int[][] createMatrix(int size),
        который создает матрицу размером size на size и инициализирует ее
        числами, начиная с 1, двигаясь по столбцам.
        Например, матрица размером 4х4 будет иметь следующий вид:

        3. Добавьте в класс Task73 метод public static void printMatrix(int[][] matrix),
        который выводит матрицу.
        4. Добавьте в класс Task73 метод public static void main(String[] args),
        который вводит размерность матрицы, создает ее и затем отображает.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        printMatrix(createMatrix(sc.nextInt()));
    }
    public static int[][] createMatrix(int size) {
        int[][] matrix = new int[size][size];
        int x = 0;
        for (int col = 0; col < size; col ++) {
            for (int row = 0; row < size; row ++) {
                matrix[col][row] = ++x;
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {System.out.println("" + Arrays.toString(row));}
    }
}
