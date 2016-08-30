package Patterns.Builder;/*  Created by Ilyasov Damir on 30.08.2016. */

public class Person {
    private String name;
    private String lastName;
    private int age;
    private int weight;

    public void print(){
            
    }
    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    private Person(){

    }
    public static PersonBuilder newBuilder(){
        return new Person().new PersonBuilder();
    }
    public class PersonBuilder{
        private PersonBuilder(){
        }
        public PersonBuilder setName(String name){
            Person.this.name = name;
            return this;
        }
        public PersonBuilder setLastName(String lastName){
            Person.this.lastName = lastName;
            return this;
        }
        public PersonBuilder setAge(int age){
            Person.this.age = age;
            return this;
        }
        public PersonBuilder setWeight(int weight){
            Person.this.weight = weight;
            return this;
        }
        public Person build(){
            return Person.this;
        }
    }

    public class newBuilder extends Person {
    }
}
