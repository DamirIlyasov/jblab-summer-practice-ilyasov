package Day1;

/**
 * Created by hp on 22.08.2016.
 */
public class Ex5 {
    public static void main(String[] args) {
        Object[] a = new Object[10];
        for (int i = 0; i < 10; i++) {
            if (a[i] == null) {
                System.out.println("Null element found");
                break;
            }
        }
    }
}
