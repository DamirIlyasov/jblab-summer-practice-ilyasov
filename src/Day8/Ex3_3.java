package Day8;/*  Created by Ilyasov Damir on 10.09.2016. */

import java.util.Scanner;

public class Ex3_3 {
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
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int d = compare(str1, str2);
        System.out.println(d);
    }
}
