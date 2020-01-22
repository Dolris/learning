package work13;

public class Task13 {
    public static void main (String[] args) {
        /* One letter will be 5 chars wide and 5 height */
        System.out.println(repeat(" ", 2) + repeat("+", 3) + repeat(" ", 3) + "+" +
                repeat(" ", 2) + " +" + repeat(" ", 3) + "+ " + repeat(" ", 2) + "+" +
                repeat(" ", 2));
        System.out.println(repeat(" ", 4) + "+  + +  +" + repeat(" ", 3) + "+  + + ");
        System.out.println(repeat(" ", 4) + "+ +" + repeat(" ", 3) + "+ +" + repeat(" ", 3) +
                "+ +" + repeat(" ", 3) + "+");
        System.out.println("+" + repeat(" ", 3) + "+ " + repeat("+", 5) + "  + +  " +
                repeat("+", 5));
        System.out.println(" " + repeat("+", 3) + "  +" + repeat(" ", 3) + "+ " + repeat(" ", 2) +
                "+" + repeat(" ", 2) + " +" + repeat(" ", 3) + "+");
    }
    public static String repeat(String c, int n) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) s.append(c);
        return s.toString();
    }
}
