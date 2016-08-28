package Day5;/*  Created by Ilyasov Damir on 26.08.2016. */

import java.util.Scanner;

public class Ex2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        double sum = 0;
        double mult = 1;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                mult = (i + j) / (i * j);
            }
            sum += mult;
        }
        System.out.println(sum);
    }
}
