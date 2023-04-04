package num1.Demo;

public class frog extends Animal implements swim{
    public frog() {
    }

    public frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("chongzi");
    }

    @Override
    public void swim() {
        System.out.println("wayong");
    }
}
