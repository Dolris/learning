package work54;

public class Task54 {
    public static void main(String[] args) {
        /*
        1. Откройте проект PracticalWork5 и добавьте в него пакет work54, в
        котором создайте класс Task54.
        2. Добавьте в класс Task54 метод public static void main(String[] args) { }.
        3. Добавьте в метод main(...) код, который:
        − описываются две переменные myStr1 и myStr2 типа String (например, со
        значениями «Cartoon» для первой и «Tomcat» для второй);
        − выведите в консоль все буквы, которые присутствуют в первом слове,
        но отсутствуют во втором.
        4. Запустите приложение на исполнение.
         */
        String myStr1 = "Cartoon", myStr2 = "Tomcat";
        boolean found = false;
        for (int i = 0; i < myStr1.length(); i++) {
            found = false;
            for (int j = 0; j < myStr2.length(); j++) {
                if (myStr1.charAt(i) == myStr2.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(myStr1.charAt(i));
            }
        }
    }
}
