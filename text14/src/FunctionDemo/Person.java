package FunctionDemo;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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

    /*public void keepPet(Dog dog, String something){
        System.out.println(age + "," +name + "," + dog.getColor() + "," + dog.getAge() + "狗");
        dog.eat(something);
    }
    public void keepPet(Cat cat, String something){
        System.out.println(age + "," +name+ "," + cat.getColor() + "," + cat.getAge() + "狗");
        cat.eat(something);
    }*/

    public void keepPet(Animal animal, String something){
        if (animal instanceof Dog d){
            System.out.println(age + "," +name + "," + d.getColor() + "," + d.getAge() + "狗");
            d.eat(something);
        } else if (animal instanceof Cat c) {
            System.out.println(age + "," +name+ "," + c.getColor() + "," + c.getAge() + "猫");
            c.eat(something);
        }else {
            System.out.println("没有这种动物");
        }
    }

}
