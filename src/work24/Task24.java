package work24;

public class Task24 {
    public static void main(String[] args) {
        int i = 456;
        System.out.println("Difference with reversed : " + (i - (100*(i%10) + (i%100 - i%10) + (i%1000 - i%100)/100)));
    }
}
