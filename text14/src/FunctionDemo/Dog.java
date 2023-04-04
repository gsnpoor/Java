package FunctionDemo;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }
    @Override
    public void eat(String something) {
        System.out.println(getAge() + "," + getColor() + something + "猛吃");
    }

    public void lookhome(){
        System.out.println("狗再看家");
    }
}
