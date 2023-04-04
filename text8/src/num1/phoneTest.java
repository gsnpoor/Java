package num1;

public class phoneTest {
    public static void main(String[] args){
        phone p = new phone("小白", 19);
        String name = p.getName();
        int age = p.getAge();
        System.out.println(name);
        System.out.println(age);
    }
}
