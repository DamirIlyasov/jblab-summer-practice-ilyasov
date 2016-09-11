package Day8;/*  Created by Ilyasov Damir on 10.09.2016. */

public class Ex3_4 {
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
        String min = args[0];
        String max = args[0];
        for (int i = 0; i < args.length; i++) {
            if (compare(args[i], min) == 1) {
                min = args[i];
            }
            if (compare(args[i], max) == -1) {
                max = args[i];
            }
        }
        System.out.println(min + max);
    }

}
