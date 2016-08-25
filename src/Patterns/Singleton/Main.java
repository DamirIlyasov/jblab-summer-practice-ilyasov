package Patterns.Singleton;/*  Created by Ilyasov Damir on 25.08.2016. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Singleton object = Singleton.getObject();

        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        object.setMsg(n);
        object.printMsg();

        
    }
}
