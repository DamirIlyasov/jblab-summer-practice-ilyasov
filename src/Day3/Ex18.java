package Day3;

import java.util.Scanner;

/**
 * Created by hp on 23.08.2016.
 */
public class Ex18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        array[0] = 1;
        System.out.print(array[0] + " ");
        for (int i = 1; i < n; i++) {
            array[i] = i % 2 > 0 ? -(array[i - 1] + 2) : Math.abs(array[i - 1]) + 2;
            System.out.print(array[i] + " ");
        }


    }
}
