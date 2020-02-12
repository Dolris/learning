package work33;

public class Task33 {
    public static void main(String[] args) {
        /*
        1. Откройте проект PracticalWork3 и добавьте в него пакет work33, в
        котором создайте класс Task33.
        2. Добавьте в класс Task33 метод public static void main(String[] args) { }.
        3. Добавьте в метод main(...) код, который вычисляет и выводит
        окончательную стоимость итальянского шкафа на распродаже, если
        начальная его стоимость составляла 830.0 $, затем упала на 13%, а после
        роста курса долларов поднялась на 7%.
        4. Запустите приложение на исполнение.
         */
        System.out.println("Wardrobe price with discount after exchange rate change is: " +
                ((double)Math.round(100*830.0 * (1 - 0.13) * (1 + 0.07))/100));
    }
}
