package work74;

import java.util.Arrays;
import java.util.Scanner;

public class Task74 {
    public static void main(String[] args) {
        /*
        2. Добавьте в класс Task74 метод public static void transpositionMatrix(int[][]
        matrix), который выполняет транспонирование матрицы.
        3. Добавьте в класс Task74 метод public static int[][] createMatrix(int size),
        который создает матрицу размером size на size и инициализирует ее
        случайными значениями.
        4. Добавьте в класс Task74 метод public static void printMatrix(int[][] matrix),
        который выводит матрицу.
        5. Добавьте в класс Task74 метод public static void main(String[] args),
        который вводит размерность матрицы, создает ее, затем отображает, затем
        транспонирует и снова отображает.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int[][] tbl = createMatrix(sc.nextInt());
        System.out.println("==========");
        printMatrix(tbl);
        System.out.println("==========");
        transpositionMatrix(tbl);
        printMatrix(tbl);
    }
    public static void transpositionMatrix(int[][] matrix){
        int element;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix.length; j ++) {
                element = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = element;
            }
        }
    }
    public static int[][] createMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int col = 0; col < size; col ++) {
            for (int row = 0; row < size; row ++) {
                matrix[col][row] = (int)(Math.random() * 50);
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {System.out.println("" + Arrays.toString(row));}
    }
}
