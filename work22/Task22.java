package work22;

public class Task22 {
    public static void main(String[] args) {
        long ts = System.currentTimeMillis()/1000;
        System.out.println("Passed " + (ts/3600)/24 + ":" + (ts/3600 - 24*((ts/3600)/24)) + ":" +
                (ts/60 - 60*(ts/3600)) + ":" + ts % 60 + " ");
    }
}
