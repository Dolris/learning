package work42;

import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        /*
        1. Откройте проект PracticalWork4 и добавьте в него пакет work42, в
        котором создайте класс Task42.
        2. Добавьте в класс Task42 метод public static void main(String[] args) { }.
        3. Добавьте в метод main(...) код, в котором:
        – вводится переменная целого типа (например, с именем x);
        – выводится текст «Один», «Два», ..., «Девять», если значение
        переменной 1,2,...9, или «Другое», если значение переменной меньше
        1 или больше 9;
        – определить выводимый текст двумя способами:
        • через цепочку операторов if-else’if;
        • через оператор switch.
        4. Запустите приложение на исполнение.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int i = Integer.parseInt(sc.nextLine());
        // Using if;
        System.out.println("Entered value is: " + (i == 1 ? "One" : (i == 2 ? "Two" : (i == 3 ? "Three" : (i == 4 ? "Four" : (i == 5 ? "Five" : (i == 6 ? "Six" : (i == 7 ? "Seven" : (i == 8 ? "Eight" : (i == 9 ? "Nine" : "Other"))))))))));
        // Using switch;
        switch (i) {
            case 1: System.out.println("Entered value is: One");
                    break;
            case 2: System.out.println("Entered value is: Two");
                break;
            case 3: System.out.println("Entered value is: Three");
                break;
            case 4: System.out.println("Entered value is: Four");
                break;
            case 5: System.out.println("Entered value is: Five");
                break;
            case 6: System.out.println("Entered value is: Six");
                break;
            case 7: System.out.println("Entered value is: Seven");
                break;
            case 8: System.out.println("Entered value is: Eight");
                break;
            case 9: System.out.println("Entered value is: Nine");
                break;
            default: System.out.println("Entered value is: Other");
                break;
        }
    }
}
