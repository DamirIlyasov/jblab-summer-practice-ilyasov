package Day8;/*  Created by Ilyasov Damir on 04.09.2016. */

import java.util.Scanner;

public class Ex3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = 0;
        if (a > b) {
            while (a % b != 0) {
                a = a % b;
            }
            result = b;
        } else {
            while (b % a != 0) {
                b = b % a;
            }
            result = a;
        }
        System.out.println(result);

    }
}
