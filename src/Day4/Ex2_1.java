package Day4;

import java.util.Scanner;

/**
 * Created by hp on 25.08.2016.
 */
public class Ex2_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }
        boolean result = true;
        for (int i = 0; i < n && result; i++) {
            result = (((x[i + 2] - x[i]) / (x[i + 1] - x[i])) == ((y[i + 2] - y[i]) / (y[i + 1] - y[i])));
        }
        System.out.println(result);

    }
}
