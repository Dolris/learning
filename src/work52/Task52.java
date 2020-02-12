package work52;

public class Task52 {
    public static void main(String[] args) {
        /*
        1. Откройте проект PracticalWork5 и добавьте в него пакет work52, в
        котором создайте класс Task52.
        2. Добавьте в класс Task52 метод public static void main(String[] args) { }.
        3. Добавьте в метод main(...) код, в котором:
        – определяется переменная строкового типа, которая содержит название
        некоторой организации из трех слов (например, «National Aviation
        University»);
        – составляет и сохраняет в переменной аббревиатуру этой организации;
        – выводит результат в консоль.
        4. Запустите приложение на исполнение.
         */
        String name = "National Aviation University";
        String abbr = "";
        if (!("" + name.charAt(0)).equals(" ")) abbr = abbr + name.charAt(0);
        for (int i=0; i < name.length()-1; i++) {
            if (("" + name.charAt(i)).equals(" ") & !("" + name.charAt(i + 1)).equals(" ")) {
                abbr = abbr + name.charAt(i + 1);
            }
        }
        System.out.println(abbr.toUpperCase());
    }
}
