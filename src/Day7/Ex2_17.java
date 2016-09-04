package Day7;/*  Created by Ilyasov Damir on 30.08.2016. */

import java.util.Scanner;

public class Ex2_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int mincounter = 0;
        int maxcounter = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > max) {
                max = array[i];
                maxcounter = 1;
            } else if (array[i] == max) {
                maxcounter++;
            }
            if (array[i] < min) {
                min = array[i];
                mincounter = 1;
            } else if (array[i] == min) {
                mincounter++;
            }

        }
        System.out.println("Min amount = " + mincounter);
        System.out.println("Max amount = " + maxcounter);
    }
}
