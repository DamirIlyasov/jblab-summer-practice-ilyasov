package Day2;

import java.util.Scanner;

/**
 * Created by hp on 23.08.2016.
 */
public class Ex7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double result = (Math.pow(x, 5) - 4 * Math.pow(x, 3) + 2 * Math.pow(x, 2) - 5 * x + 10);
        System.out.println(result);
    }

}
