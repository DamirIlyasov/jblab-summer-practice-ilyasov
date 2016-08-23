package Day3;

import java.util.Scanner;

/**
 * Created by hp on 23.08.2016.
 */
public class Ex16 {
    public static void main(String[] args) {


        int counter = 0;
        int result = 0;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n != 0) {

            result = (counter % 2 > 0) ? result - n % 10 : result + n % 10;
            n = n / 10;
            counter++;

        }

        System.out.println(result);


    }
}
