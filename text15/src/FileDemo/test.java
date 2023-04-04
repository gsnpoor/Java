package FileDemo;

public class test {
    public static void main(String[] args) {
        new Swim(){

            @Override
            public void swim() {
                System.out.println("重写游泳的方法");
            }
        }.swim();
    }
}
