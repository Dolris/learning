package work46;

import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        /*
        1. Откройте проект PracticalWork5 и добавьте в него пакет work46, в
        котором создайте класс Task46.
        2. Добавьте в класс Task45 метод public static void main(String[] args) { }.
        3. Добавьте в метод main(...) код, в котором:
        – вводится переменная целого типа;
        – вычисляется и выводится сумма квадратов цифр введенного числа;
        4. Запустите приложение на исполнение.
         */
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int summ = 0;
        while (true) {
            if (num > 0) {
                summ = summ + (num%10)*(num%10);
                num = num/10;
                System.out.println(num);
            }
            else break;
        }
        System.out.println(summ);
    }
}
