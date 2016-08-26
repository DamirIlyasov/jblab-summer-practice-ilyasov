package Day4;

import java.util.Scanner;

/**
 * Created by hp on 25.08.2016.
 */
public class Ex2_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (int a : array) {
            int x = a > 0 ? 1 : -1;
            switch (x) {
                case 1: {
                    System.out.println("+");
                    break;
                }
                case -1: {
                    if (a == 0) {
                        System.out.println("0");
                    } else {
                        System.out.println("-");
                    }
                }

            }
        }


    }
}
