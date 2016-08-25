package Day4;

/**
 * Created by hp on 25.08.2016.
 */
public class Ex2_4 {
    public static void main(String[] args) {
        int sum = 0;
        int[] array = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
            if (i % 3 == 0) {
                sum += array[i];
            }
        }
    }
}
