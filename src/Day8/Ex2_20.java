package Day8;/*  Created by Ilyasov Damir on 30.08.2016. */

import java.util.Scanner;

public class Ex2_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n / 2; i++) {
            int g = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = g;

        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}