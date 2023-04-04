package StreamDemo;

public class BaskertballCoach extends Coach{
    public BaskertballCoach(String name, int age) {
        super(name, age);
    }

    public BaskertballCoach() {
    }

    @Override
    public void teach() {
        System.out.println("篮球教练正在教如何打篮球");
    }
}
