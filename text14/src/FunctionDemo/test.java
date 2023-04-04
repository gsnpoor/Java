package FunctionDemo;

public class test {
    public static void main(String[] args) {
        Person p = new Person("laowang", 30);

        Dog d = new Dog(2, "heise");
        p.keepPet(d,"gutou");

        Animal c = new Cat(4,"baise");
        p.keepPet(c,"maoliang");
    }
}
