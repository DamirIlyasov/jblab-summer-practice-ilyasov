package Day9;/*  Created by Ilyasov Damir on 11.09.2016. */

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        Set<Integer> special = new LinkedHashSet<Integer>();
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (special.contains(array[i])) {
                special.add(array[i]);
            } else {
                special.remove(array[i]);
            }
        }
        System.out.println(special.size());
    }
}
