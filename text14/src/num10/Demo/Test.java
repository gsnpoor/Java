package num10.Demo;

public class Test {
    public static void main(String[] args) {
        Frog fr = new Frog();
        Dog dg = new Dog();
        Sheep sh = new Sheep();

        fr.eat();
        dg.eat();
        sh.eat();

        fr.water();
        dg.water();
        sh.water();
    }
}
