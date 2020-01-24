package work41;

import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        /*
        Создайте проект PracticalWork4 с пакетом work41, в котором создайте
        класс Task41.
        2. Добавьте в класс Task41 метод public static void main(String[] args) { }.
        3. Добавьте в метод main(...) код, который описывает/вводит три переменные
        (любого типа) и вычисляет наибольшее значение из трех. Результат
        выводится на консоль.
        4. Запустите приложение на исполнение.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first variable: ");
        int i1 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter second variable: ");
        int i2 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter third variable: ");
        int i3 = Integer.parseInt(sc.nextLine());
        System.out.println("The max value is: " + ((i1>i2 && i1>i3)?i1:((i1>i2 && i1<=i3)?i3:i2)));
    }
}
