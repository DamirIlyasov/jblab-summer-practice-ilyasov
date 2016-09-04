package Day7;/*  Created by Ilyasov Damir on 30.08.2016. */

import java.util.Scanner;

public class Ex2_15 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double limit = 0.000001;
        double result = (-1) * ((Math.pow(x, 2)) / factorial(2));
        for (int i = 2; result > limit; i++) {
            result += Math.pow(-1, i) * ((Math.pow(x, 2 * i)) / factorial(2 * i));
        }
        System.out.println(result);


    }

    public static int factorial(int x) {
        if (x < 1) {
            return x;
        }
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }
}
