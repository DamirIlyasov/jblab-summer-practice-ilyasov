package Day5;/*  Created by Ilyasov Damir on 26.08.2016. */

public class Ex2_6 {
    public static void main(String[] args) {
        double g = 1;
        int x = 3;
        double e = 1;
        for (int i = 0; !(e < 0.000001); i++) {
            e = 1 / Math.pow(x, 2);
            switch (i % 2) {
                case 0: {
                    g -= e;
                    x += 2;
                    break;
                }
                case 1: {
                    g += e;
                    x += 2;
                }
            }
        }
        System.out.println(g);
    }
}
