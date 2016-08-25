package Day4;

import java.util.Scanner;

/**
 * Created by hp on 25.08.2016.
 */
public class Ex20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            array2[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            array1[i] = array2[array1[i]];
        }

        for (int x : array1) {
            System.out.println(x + " ");
        }

    }
}
