package Day9;/*  Created by Ilyasov Damir on 11.09.2016. */

import java.util.Scanner;

public class Ex3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter l, m, n");
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        double m1;
        double m2 = 1;
        double sum;
        for (int i = 1; i <= l; i++) {
            sum = 0;
            for (int j = 1; j <= m; j++) {
                m1 = 1;
                for (int k = 1; k <= n; k++) {
                    m1 = m1 * Math.exp(i * j * k) / (Math.cos(i) + Math.sin(j) + Math.tan(k));

                }
                sum = sum + m1;
            }
            m2 = m2 * sum;
        }
        System.out.println("result = " + m2);
    }
}
