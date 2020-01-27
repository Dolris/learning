package work55;

import java.util.Scanner;

public class Task55 {
    public static void main(String[] args) {
        /*
        1. Откройте проект PracticalWork5 и добавьте в него пакет work55, в
        котором создайте класс Task55.
        2. Добавьте в класс Task55 метод public static void main(String[] args) { }.
        3. Добавьте в метод main(...) код, который:
        − вводит некоторую строку;
        − выводит в консоль все уникальные (те, которые не повторяются, т.е.
        присутсвуют в единственном числе) символы этой строки.
        4. Запустите приложение на исполнение.
         */
        Scanner sc = new Scanner(System.in);
        String someStr = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < someStr.length(); i++) {
            found = false;
            for (int j = i + 1; j < someStr.length(); j ++) {
                if (someStr.charAt(i) == someStr.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found & !(someStr.charAt(i) == ' ')) System.out.print(someStr.charAt(i));
            someStr = someStr.replace(someStr.charAt(i), ' ');
        }
    }
}
