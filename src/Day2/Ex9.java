package Day2;

import java.util.Scanner;

/**
 * Created by hp on 23.08.2016.
 */
public class Ex9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y;

        if (x > 2) {
            y = (Math.pow(x, 2) - 1) / (x + 2);
        }

        if (x > 0 && x < 2) {
            y = (Math.pow(x, 2) - 1) * (x + 2);
        } else {
            y = Math.pow(x, 2) * (1 + 2 * x);
        }

        System.out.println(y);

    }
}
