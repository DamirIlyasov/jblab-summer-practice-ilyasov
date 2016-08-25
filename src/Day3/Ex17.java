package Day3;

import java.util.Scanner;

/**
 * Created by hp on 23.08.2016.
 */
public class Ex17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String space = "";
        String figures = "";
        for (int i = 0; i < n; i++) {
            figures = figures + "1";
        }
        for (int i = 0; i < n; i++) {
            System.out.println(space + figures);
            space += " ";
        }

    }
}
