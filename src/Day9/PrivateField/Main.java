package Day9.PrivateField;/*  Created by Ilyasov Damir on 11.09.2016. */

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        ClassWithPrivateSmth someClass = new ClassWithPrivateSmth();

        try {
            Field reflectField = ClassWithPrivateSmth.class.getDeclaredField("name");
            Field reflectField2 = ClassWithPrivateSmth.class.getDeclaredField("a");

            reflectField.setAccessible(true);
            reflectField2.setAccessible(true);

            String fieldValue = (String) reflectField.get(someClass);
            Integer fieldValue2 = (Integer) reflectField2.get(someClass);

            System.out.println(reflectField);
            System.out.println(fieldValue);
            System.out.println(reflectField2);
            System.out.println(fieldValue2);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
            ;
        }

    }
}
