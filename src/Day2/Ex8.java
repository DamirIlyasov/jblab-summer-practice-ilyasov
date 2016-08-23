package Day2;

import java.util.Scanner;

/**
 * Created by hp on 23.08.2016.
 */
public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array1 = new String[3];
        String[] array2 = new String[3];

        for (int i = 0; i < 3; i++) {
            array1[i] = scanner.nextLine();
        }

        for (int i = 0; i < 3; i++) {
            array2[i] = scanner.nextLine();
        }

        String[] result = new String[6];
        System.arraycopy(array1, 0, result, 0, 3);
        System.arraycopy(array2, 0, result, 3, 3);
        for (int i = 0; i < 6; i++) {
            System.out.print(result[i] + " ");

        }
    }
}
