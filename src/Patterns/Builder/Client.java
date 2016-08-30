package Patterns.Builder;/*  Created by Ilyasov Damir on 30.08.2016. */

public class Client {
    public static void main(String[] args) {
        Person person = Person.newBuilder().setAge(19).setName("Damir").setLastName("Ilyasov").setWeight(65).build();

    }
}

