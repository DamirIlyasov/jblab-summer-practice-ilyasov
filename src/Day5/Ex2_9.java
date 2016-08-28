package Day5;/*  Created by Ilyasov Damir on 26.08.2016. */

import java.util.Scanner;

public class Ex2_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();

        System.out.println(equals(string1, string2));


    }

    public static boolean equals(String a, String b) {
        boolean result = false;
        if (a.length() == b.length()) {
            char[] char1 = a.toCharArray();
            char[] char2 = b.toCharArray();
            for (int i = 0; i < a.length(); i++) {
                if (char1[i] == char2[i]) {
                    result = true;
                } else {
                    result = false;
                    return result;
                }
            }
        }

        return result;
    }
}
