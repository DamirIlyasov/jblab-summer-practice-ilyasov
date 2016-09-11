package Day9.Task2;/*  Created by Ilyasov Damir on 11.09.2016. */

public class MyHuman implements Human{
    private String name;
    private String lastName;

    private MyHuman() {
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void say(String word) {
        System.out.println(word);
    }

    public static HumanBuilder createHuman() {
        return new MyHuman().new HumanBuilder();
    }
    class HumanBuilder extends MyHuman{
        private HumanBuilder(){

        }
        public HumanBuilder setName(String name){
            MyHuman.this.name = name;
            return this;
        }
        public HumanBuilder setLastName(String lastName){
            MyHuman.this.lastName = lastName;
            return this;
        }
        public MyHuman build(){
            return MyHuman.this;
        }
    }
}

