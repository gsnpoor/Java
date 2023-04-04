package num2.Demo;

public class test {
    public static void main(String[] args) {
        Manager m = new Manager("h001", "zhangsan", 15000, 8000);
        System.out.println(m.getId()+","+m.getName()+","+m.getSalary()+","+m.getBouns());
        m.work();
        m.eat();

        Cook c = new Cook();
        c.setId("h002");
        c.setName("lisi");
        c.setSalary(13000);
        System.out.println(c.getId()+","+c.getName()+","+c.getSalary());
        c.work();
        c.eat();
    }
}
