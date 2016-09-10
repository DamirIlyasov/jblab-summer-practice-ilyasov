package Day8;/*  Created by Ilyasov Damir on 10.09.2016. */

import java.util.Scanner;

public class Ex3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int result = 0;
        int k;
        if (string.charAt(0) == '-') {
            for (int i = 1; i < string.length(); i++) {
                result = result * 10 - Character.getNumericValue(string.charAt(i));
            }
        } else {
            for (int i = 0; i < string.length(); i++) {
                result = result * 10 + Character.getNumericValue(string.charAt(i));
            }
        }

        System.out.println(result);
    }

}
