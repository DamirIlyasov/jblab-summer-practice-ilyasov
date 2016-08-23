package Day2;

import java.util.Scanner;

/**
 * Created by hp on 23.08.2016.
 */
public class Ex12 {
    public static void main(String[] args) {

        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split("");
        for (int i = 0; i < input.length(); i++) {
            if (inputArray[i].equals("a")) {
                counter++;
            }
        }

        System.out.println(counter);

    }
}
