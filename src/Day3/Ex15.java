package Day3;

/**
 * Created by hp on 23.08.2016.
 */
public class Ex15 {
    public static void main(String[] args) {
        double sum = 0;
        double mult = 1;
        double[] array = new double[10];
        for (double i : array) {
            sum += i;
            mult *= i;
        }
        System.out.println(sum);
        System.out.println(mult);
    }
}
