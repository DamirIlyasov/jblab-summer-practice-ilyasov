package Day7;/*  Created by Ilyasov Damir on 30.08.2016. */

import java.util.Scanner;

public class Ex2_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        double result = sum / n;
        System.out.println(result);
    }
}
