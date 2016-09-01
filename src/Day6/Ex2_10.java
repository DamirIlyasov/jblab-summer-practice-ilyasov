package Day6;/*  Created by Ilyasov Damir on 30.08.2016. */

import java.util.Scanner;

public class Ex2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 1;
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    result *= i;
                }

            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    result *= i;
                }
            }
        }
        System.out.println(result);
    }
}
