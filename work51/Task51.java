package work51;

import java.util.Scanner;

public class Task51 {
    public static void main(String[] args) {
        /*
        1. Создайте проект PracticalWork5 с пакетом work51, в котором создайте
        класс Task51.
        2. Добавьте в класс Task51 метод public static void main(String[] args) { }.
        3. Добавьте в метод main(...) код, который:
        − задает некоторую строку str (например, «The decimal system, invented in
        India around AD 600, was a revolution in quantitative reasoning: using
        only 10 symbols, even very large numbers could be written down
        compactly»);
        − выводит в консоль вторую ее половину.
        4. Запустите приложение на исполнение.
         */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.substring(str.length()/2));
    }
}
