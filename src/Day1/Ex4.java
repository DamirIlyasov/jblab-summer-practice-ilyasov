package Day1;

/**
 * Created by hp on 22.08.2016.
 */
public class Ex4 {
    public static void main(String[] args) {
        int[] a = new int[100];
        int sum = 0;
        int prod = 1;
        for (int i = 0; i <= 100; i++) {
            a[i] = (int) Math.random();
            if (a[i] % 2 == 0) {
                sum = sum + a[i];
            }
            if (a[i] > 0) {
                prod = prod * a[i];
            }
        }
        System.out.println("Sum = " + sum);
        System.out.println("Prod = " + prod);
    }
}
