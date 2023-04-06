package MyReflect2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class MyReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("MyReflect2.Student");

        //获取构造方法
        /*Constructor[] cons1 = clazz.getConstructors();
        for (Constructor con : cons1) {
            System.out.println(con);
        }

        Constructor[] cons2 = clazz.getDeclaredConstructors();
        for (Constructor constructor : cons2) {
            System.out.println(constructor);
        }*/

        /*Constructor con1 = clazz.getDeclaredConstructor();
        System.out.println(con1);

        Constructor con2 = clazz.getDeclaredConstructor(String.class);
        System.out.println(con2);

        Constructor con3 = clazz.getDeclaredConstructor(int.class);
        System.out.println(con3);*/

        Constructor con4 = clazz.getDeclaredConstructor(String.class, int.class);

        /*int modifiers = con4.getModifiers();

        Parameter[] parameters = con4.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }*/

        //暴力反射：临时取消权限校验
        con4.setAccessible(true);
        Student stu = (Student) con4.newInstance("zhangsan", 23);
        System.out.println(stu);

    }
}
