package Day4;

/**
 * Created by hp on 24.08.2016.
 */
public class Ex19 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            if (Integer.parseInt(args[i]) % 3 == 0) {
                sum += Integer.parseInt(args[i]);
            }
        }
        System.out.println(sum);

    }
}
