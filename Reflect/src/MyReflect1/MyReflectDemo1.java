package MyReflect1;

public class MyReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz1 = Class.forName("MyReflect1.Student");

        Class clazz2 = Student.class;

        Student s = new Student();
        Class clazz3 = s.getClass();

        System.out.println(clazz1 == clazz2);
        System.out.println(clazz3 == clazz2);

    }
}
