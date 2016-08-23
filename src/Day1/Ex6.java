package Day1;

/**
 * Created by hp on 22.08.2016.
 */
public class Ex6 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = (int) Math.random();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
