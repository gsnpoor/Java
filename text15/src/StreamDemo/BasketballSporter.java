package StreamDemo;

public class BasketballSporter extends Sporter{

    public BasketballSporter(String name, int age) {
        super(name, age);
    }

    public BasketballSporter() {
    }

    @Override
    public void study() {
        System.out.println("篮球运动员在学习如何打篮球");
    }
}
