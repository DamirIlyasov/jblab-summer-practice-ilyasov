package Day3;

/**
 * Created by hp on 23.08.2016.
 */
public class Ex14 {
    public static void main(String[] args) {

        int[][] table = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int f = 0; f < 10; f++) {

                table[i][f] = (i + 1) * (f + 1);
                System.out.print(table[i][f] + " ");

            }
            System.out.println();
        }


    }
}
