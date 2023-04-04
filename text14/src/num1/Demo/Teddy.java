package num1.Demo;

public class Teddy extends Dog{
    public void touch(){
        System.out.println("蹭一蹭");
    }

    @Override
    public void eat() {
        System.out.println("不吃饭");
    }
}
