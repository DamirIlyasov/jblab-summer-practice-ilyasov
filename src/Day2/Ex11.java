package Day2;

import java.util.Scanner;

/**
 * Created by hp on 23.08.2016.
 */
public class Ex11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int k = 1;
        int n = scanner.nextInt();
        double result = 1;

        for (int i = 0; i < n; i++) {
            result = result * (4 * Math.pow(k, 2)) / (4 * Math.pow(k, 2) - 1);
            k++;
        }
        System.out.println(result);

    }
}
