package work44;

public class Task44 {
    public static void main(String[] args) {
        /*
        1. Откройте проект PracticalWork4 и добавьте в него пакет work44, в
        котором создайте класс Task44.
        2. Добавьте в класс Task44 метод public static void main(String[] args) { }.
        3. Добавьте в метод main(...) код, который выводит в консоль 10 первых
        чисел, кратных 3 или 4 из диапазона от 1 до 300.
        4. Запустите приложение на исполнение.
         */
        int i = 0;
        int r = 0;
        final int MAX_RESULTS = 10;
        while (i <= 300) {
            i++;
            if (i%3 == 0 || i%4 == 0) {
                System.out.println(i);
                r++;
                if (r >= MAX_RESULTS) break;
            }
        }
    }
}
