package Day5;/*  Created by Ilyasov Damir on 26.08.2016. */

public class Ex2_8 {
    public static void main(String[] args) {
        char[] array1 = args[0].toCharArray();
        char[] array2 = args[1].toCharArray();
        boolean result = false;
        int counter = 0;

        checkpoint:
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[0]){
                for (int j = 1; j < array2.length; j++) {
                    if (array1[i+j] == array2[j]){
                        counter += 1 ;
                    }
                }
                if (counter == array2.length){
                    System.out.println("True");
                    break checkpoint;
                }
                counter = 0;
            }
        }
    }
}
