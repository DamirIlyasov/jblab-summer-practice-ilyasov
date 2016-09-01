package Day6;/*  Created by Ilyasov Damir on 30.08.2016. */

import java.util.Scanner;

public class Ex2_14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double result = 0;
        for (int i = 1; i <= n; i++) {
            result += (Math.pow(factorial(i - 1), 2)) / (factorial(2 * i));
        }
        System.out.println(result);


    }

    public static int factorial(int m) {
        int result = 1;
        for (int i = 0; i < m; i++) {
            result *= i;
        }
        return result;
    }
}
