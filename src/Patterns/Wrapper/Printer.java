package Patterns.Wrapper;/*  Created by Ilyasov Damir on 26.08.2016. */

public class Printer implements PrintInterface {

    String value;
    Printer(String value){
        this.value = value;
    }
    @Override
    public void print() {
        System.out.print(value);
    }
}
