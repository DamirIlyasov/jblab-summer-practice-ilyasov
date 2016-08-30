package Day6;/*  Created by Ilyasov Damir on 30.08.2016. */

import java.util.Scanner;

public class Ex2_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int s = 0;
        int a = 1;
        for (int i = 1; i <= n; i++) {
            a *= x + i;
            s += a;
        }
        System.out.println(s);
    }
}
