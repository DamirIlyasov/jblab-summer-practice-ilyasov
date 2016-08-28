package Patterns.Wrapper;/*  Created by Ilyasov Damir on 26.08.2016. */

public class Main {
    public static void main(String[] args) {
        PrintInterface printer = new QuotesWrapper(new MinusesWrapper((new PlusesWrapper(new Printer("hi")))));
        printer.print();
    }
}
