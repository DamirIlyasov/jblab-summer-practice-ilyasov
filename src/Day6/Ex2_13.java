package Day6;/*  Created by Ilyasov Damir on 30.08.2016. */

import java.util.Scanner;

public class Ex2_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double x = scanner.nextDouble();
        double a = x;
        double result = 0;
        for (int i = n; i >= 1; i++) {
            result = a + i;
            a = x / (result);
        }
        System.out.println(result);
    }
}
