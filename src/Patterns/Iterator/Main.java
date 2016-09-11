package Patterns.Iterator;/*  Created by Ilyasov Damir on 10.09.2016. */

public class Main {
    public static void main(String[] args) {
        RangeCollection collection = new RangeCollection(5);
        Iterator a = collection.iterator();

        while (a.hasNext()){
            System.out.println(a.next());
        }
    }
}
