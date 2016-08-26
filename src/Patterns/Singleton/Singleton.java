package Patterns.Singleton;/*  Created by Ilyasov Damir on 25.08.2016. */

public class Singleton {
    private Singleton() {
    }

    private static Singleton object = new Singleton();
    private String msg;


    public static void setMsg(String msg) {
        object.msg = msg;
    }

    public static void printMsg() {
        System.out.println(object.msg);
    }

    public static Singleton getObject() {
        return object;
    }

    public static void min(int a, int b) {
        if (a > b) {
            System.out.println(a + ">" + b);
        }
        if (a < b) {
            System.out.println(a + "<" + b);
        } else {
            System.out.println(a + "=" + b);
        }
    }


}
