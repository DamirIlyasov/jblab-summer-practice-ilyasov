package Patterns.Wrapper;/*  Created by Ilyasov Damir on 26.08.2016. */

public class PlusesWrapper implements PrintInterface {

    PrintInterface component;

    PlusesWrapper(PrintInterface component){
        this.component = component;
    }

    @Override
    public void print() {
        System.out.print("+");
        component.print();
        System.out.print("+");
    }
}
