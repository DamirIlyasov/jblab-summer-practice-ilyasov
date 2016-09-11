package Day9.Task2;/*  Created by Ilyasov Damir on 11.09.2016. */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HumanBuilderInvocationHandler implements InvocationHandler {

    private Human wrapped;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long time = System.currentTimeMillis();
        Object dataOutput = method.invoke(wrapped, args);
        time = System.currentTimeMillis() - time;
        System.out.println(method.getName() + " spend " + time + " ms");
        return dataOutput;
    }
    public HumanBuilderInvocationHandler(Human human) {
        wrapped = human;
    }
    public static void main(String[] args) {
        MyHuman myHuman = MyHuman.createHuman().setName("Damir").setLastName("Asdasd").build();
        
    }

}
