package num10.Demo;

public abstract class Animal {
    private String name;
    private int age;

    public abstract void eat();
    public void water(){
        System.out.println("在喝水");
    }

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
