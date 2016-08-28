package Day5;/*  Created by Ilyasov Damir on 26.08.2016. */

import java.util.Scanner;

public class Ex2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = (x > 6) ? (Math.pow(x, 2) - 1) / (3 * x + 5) : Math.pow(x + 1, 3) / (x - 7) + 2;

        System.out.println(y);
    }
}
