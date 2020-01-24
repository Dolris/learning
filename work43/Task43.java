package work43;

import java.util.Scanner;

public class Task43 {
    public static void main(String[] args) {
        /*
        1. Откройте проект PracticalWork4 и добавьте в него пакет work43, в
        котором создайте класс Task43.
        2. Добавьте в класс Task43 метод public static void main(String[] args) { }.
        3. Добавьте в метод main(...) код, который выводит в консоль цифры в
        следующем порядке:
        1
        2 1
        3 2 1
        4 3 2 1
        5 4 3 2 1
        6 5 4 3 2 1
        7 6 5 4 3 2 1
        8 7 6 5 4 3 2 1

        4. Запустите приложение на исполнение.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int in = Integer.parseInt(sc.nextLine());
        int cur = 1;
        int tmp;
        while (cur <= in) {
            tmp = cur;
            while (true) {
                System.out.print(tmp + " ");
                if (tmp > 1) tmp--; else break;
            }
            System.out.println("");
            cur++;
        }
    }
}
