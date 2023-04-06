package MyReflect4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class MyReflectDemo1 {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        Class clazz = Class.forName("MyReflect4.Student");

        //获取所有的方法对象（包含父类中所有的公共方法）
        /*Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }*/

        //获取所有的方法对象（不能获取父类的，但是可以获取本类中私有的）
        /*Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }*/

        Method m = clazz.getDeclaredMethod("eat", String.class);
        //System.out.println(m);

        //获取权限修饰符
        int modifiers = m.getModifiers();
        System.out.println(modifiers);

        //获取方法名字
        String name = m.getName();
        System.out.println(name);

        //获取方法的形参
        Parameter[] parameters = m.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        //获取方法抛出的异常
        Class[] exceptionTypes = m.getExceptionTypes();
        for (Class exceptionType : exceptionTypes) {
            System.out.println(exceptionType);
        }

        //方法运行
        Student s = new Student();
        m.setAccessible(true);
        Object result = m.invoke(s, "hanbao");
        System.out.println(result);
    }
}
