package work21;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int w;
        System.out.println("Enter number of weeks ");
        w = Integer.parseInt(s.nextLine());
        System.out.println("Seconds in " + w + " weeks: " + w * 7 * 24 * 3600);
    }
}
