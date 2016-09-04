package Day7;/*  Created by Ilyasov Damir on 03.09.2016. */

import java.util.Scanner;

public class Ex2_16 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double limit = 0.000001;
        double result = 0;
        for (int i = 1; result > limit; i++) {
            result += Math.pow(x, i * 2) * (doublefactorial(2 * i - 1) / doublefactorial(2 * i));
        }
        System.out.println(result);


    }

    public static int doublefactorial(int x) {
        if (x < 1) {
            return x;
        }
        int result = 1;
        if (x % 2 == 1) {
            for (int i = 1; i < x; i++) {
                if (i % 2 == 1) {
                    result *= i;
                }
            }
        }
        if (x % 2 == 0) {
            for (int i = 1; i < x; i++) {
                if (i % 2 == 0) {
                    result *= i;
                }
            }
        }
        return result;
    }
}
