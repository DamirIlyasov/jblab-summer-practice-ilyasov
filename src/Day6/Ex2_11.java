package Day6;/*  Created by Ilyasov Damir on 30.08.2016. */

import java.util.Random;
import java.util.Scanner;

public class Ex2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(random.nextInt(10) - 3);
            ;
        }
    }
}
