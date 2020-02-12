package work63;

import java.util.Scanner;

public class Task63 {
    public static void main(String[] args) {
        /*
        2. Добавьте в класс Task63 метод public static char
        getFirstCharacterOfWord(String str, int numberWord), который определяет и
        возвращает первый символ слова под номером numberWord в строке str, в
        которой слова разделены только пробелами.
        3. Добавьте в класс Task63 метод public static void main(String[] args),
        который вводит необходимые данные и выводит результат выполнения
        метода getFirstCharacterOfWord().
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.print("Enter word number: ");
        System.out.println(">>> " + getFirstCharacterOfWord(str.trim(), sc.nextInt()));
    }
    public static char getFirstCharacterOfWord(String str, int numberWord) {
        if (str.equals("") || numberWord < 1) {return ' ';};
        if (numberWord == 1) return str.charAt(0);
        else {
            int foundedWords = 0, idx = 0;
            while (foundedWords < numberWord - 1) {
                if (str.indexOf(' ', idx + 1) < idx) return ' ';
                idx = str.indexOf(' ', idx + 1);
                if (str.charAt(idx+1) != ' ') {foundedWords++;}
            }
            return str.charAt(idx + 1);
        }
    }
}
