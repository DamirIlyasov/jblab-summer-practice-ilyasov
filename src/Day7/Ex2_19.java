package Day7;/*  Created by Ilyasov Damir on 03.09.2016. */

import java.util.Scanner;

public class Ex2_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int minposition = 0;
        int maxposition = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > max) {
                max = array[i];
                maxposition = i;
            }
            if (array[i] < min) {
                min = array[i];
                minposition = i;
            }
        }
        int c = array[minposition];
        array[minposition] = array[maxposition];
        array[maxposition] = array[minposition];

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
