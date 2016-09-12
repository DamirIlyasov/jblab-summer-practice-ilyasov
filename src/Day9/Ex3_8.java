package Day9;/*  Created by Ilyasov Damir on 11.09.2016. */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int max = 1;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
                if (map.get(a[i]) > max) {
                    max = map.get(a[i]);
                }
            } else {
                map.put(a[i], 1);
            }
        }
        System.out.println(max);
    }
}

