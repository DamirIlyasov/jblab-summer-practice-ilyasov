package Day4;

import java.util.Scanner;

/**
 * Created by hp on 25.08.2016.
 */
public class Ex2_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int a : array) {
            switch (a % 2) {
                case 0: {
                    System.out.println("c");
                    break;
                }
                case 1: {
                    System.out.println("n");
                    break;
                }
                default: {
                    System.out.println("Error");
                }
            }

        }

    }
}
