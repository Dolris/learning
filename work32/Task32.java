package work32;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        /*
        1. Откройте проект PracticalWork3 и добавьте в него пакет work32, в
        котором создайте класс Task32.
        2. Добавьте в класс Task32 метод public static void main(String[] args) { }.
        3. Добавьте в метод main(...) код, который вычисляет и выводит в консоль
        сумму прибыли по заданному депозиту на заданное количество месяцев
        под 12% годовых.
        4. Запустите приложение на исполнение.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter deposit amount (integer): ");
        Integer amt = Integer.parseInt(sc.nextLine());
        System.out.print("Enter deposit term (months): ");
        Integer term = Integer.parseInt(sc.nextLine());
        double brutto = (double)amt * (0.12 * term/12);
        System.out.println("Brutto profit amount (before tax): " + ((double)Math.round(100*brutto)/100));
        System.out.println("Net profit amount (after tax): " + ((double)Math.round(100*brutto * 0.805)/100));

    }
}
