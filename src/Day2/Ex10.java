package Day2;

import java.util.Scanner;

/**
 * Created by hp on 23.08.2016.
 */
public class Ex10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y;

        y = x > -4 ? (x - 1) / (x + 3) : 2 * x + 5;

        System.out.println(y);

    }
}
