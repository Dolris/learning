package work53;

public class Task53 {
    public static void main(String[] args) {
        /*
        1. Откройте проект PracticalWork5 и добавьте в него пакет work53, в
        котором создайте класс Task53.
        2. Добавьте в класс Task53 метод public static void main(String[] args) { }.
        3. Добавьте в метод main(...) код, в котором:
        − определяется переменная строкового типа, содержащая несколько
        слов (например, «An information system is designed to collect, process,
        store and distribute information»);
        – меняются местами первое и последнее слова этой строки;
        – выводится результат в консоль.
        4. Запустите приложение на исполнение.
         */
        String str = "An information system is designed to collect, process, store and distribute iNformation";
        int firstSpace = 0, lastSpace = str.length();
        for (int i = 0; i < str.length(); i++) {
            if (("" + str.charAt(i)).equals(" ")) {
                firstSpace = i;
                break;
            }
        }
        for (int i = str.length()-1; i > 0; i--) {
            if (("" + str.charAt(i)).equals(" ")) {
                lastSpace = i;
                break;
            }
        }
        System.out.println("firstSpace = " + firstSpace + " lastSpace = " + lastSpace);
        System.out.println(str.substring(lastSpace + 1) + str.substring(firstSpace, lastSpace + 1) + str.substring(0, firstSpace));
    }
}
