package lesson01;

import java.util.Collections;
import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String symbol;
        Integer cols;
        System.out.println("Symbols to use (whitespace will be added):");
        symbol = sc.nextLine() + " ";
        System.out.println(String.join("", Collections.nCopies(4, symbol)) + "\n" +
                String.join("", Collections.nCopies(1, symbol))+ "\n" +
                String.join("", Collections.nCopies(1, symbol))+ "\n" +
                String.join("", Collections.nCopies(3, symbol))+ "\n" +
                String.join("", Collections.nCopies(1, symbol))+ "\n" +
                String.join("", Collections.nCopies(1, symbol))+ "\n" +
                String.join("", Collections.nCopies(4, symbol)));


        System.out.println("How many rows?");
        Integer rows = Integer.parseInt(sc.nextLine());
        System.out.println("How many columns?");
        cols = Integer.parseInt(sc.nextLine());
        for (byte row = 1; row <= rows; row++) {
            for (byte col = 1; col <= cols; col++) {
                System.out.print(getAlignedNumber(col*row, 5));
            }
            System.out.println("");
        }
    }
    private static String getAlignedNumber(Integer num, Integer length) {
        String str = String.valueOf(num);
        if (str.length() < length) {
            return String.join("", Collections.nCopies(length - String.valueOf(num).length(), " ")) + str;
        }
        else {
            return str;
        }
    }
}
