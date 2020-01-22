package work23;

public class Task23 {
    public static void main(String[] args) {
        int i1 = 72, i2 = 81;
        System.out.println("Was: i1 = " + i1 + ", i2 = " + i2);
        i1 += i2;
        i2 -= i1;
        i1 +=i2;
        i2 = -i2;
        System.out.println("Was: i1 = " + i1 + ", i2 = " + i2);
    }
}
