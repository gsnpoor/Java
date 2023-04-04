package num1.Demo;

public class dog extends Animal implements swim{
    public dog() {
    }

    public dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("gutou");
    }

    @Override
    public void swim() {
        System.out.println("goupao");
    }
}
