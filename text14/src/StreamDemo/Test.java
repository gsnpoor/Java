package StreamDemo;

public class Test {
    public static void main(String[] args) {
        Person s = new Student();
        s.setAge(18);
        s.setName("zhangsan");

        Teacher t= new Teacher();
        t.setAge(30);
        t.setName("wangjianguo");

        Administrator a = new Administrator();
        a.setAge(35);
        a.setName("guanli");

        register(s);
        register(t);
        register(a);
    }

    public static void register(Person p) {
        p.show();
    }
}
