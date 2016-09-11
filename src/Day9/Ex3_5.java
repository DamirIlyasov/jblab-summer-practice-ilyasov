package Day9;/*  Created by Ilyasov Damir on 11.09.2016. */

import java.util.Arrays;

public class Ex3_5 {
    public static int compare(String str1, String str2) {
        int str1Lenght = str1.length();
        int str2Length = str2.length();
        int k = (str1Lenght >= str2Length) ? str2Length : str1Lenght;
        for (int i = 0; i < k; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.charAt(i) < str2.charAt(i) ? 1 : -1;
            }
        }
        return str1.equals(str2) ? 0 : str1Lenght < str2Length ? 1 : -1;
    }

    public static void main(String[] args) {
        int n = args.length;
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = args[i];
        }
        String str;
        int k = 0;
        boolean check = false;
        for (int i = 0; i < n && !check; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (compare(stringArray[j], stringArray[j + 1]) == -1) {
                    str = stringArray[j];
                    stringArray[j] = stringArray[j + 1];
                    stringArray[j + 1] = str;
                    check = true;
                }
            }
            if (check) {
                check = false;
            } else {
                check = true;
            }
        }
        System.out.println(Arrays.toString(stringArray));
    }
}
