package MyReflect3;

import java.lang.reflect.Field;

public class MyReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class clazz = Class.forName("MyReflect3.Student");

        /*Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        Field gender = clazz.getField("gender");
        System.out.println(gender);*/

        //获取单个的成员变量
        Field name = clazz.getDeclaredField("name");
        //System.out.println(name);
        //获取权限修饰符
        int modifiers = name.getModifiers();
        //System.out.println(modifiers);

        //获取成员变量的名字
        String n = name.getName();
        System.out.println(n);

        //获取成员变量的数据类型
        Class<?> type = name.getType();
        System.out.println(type);

        //获取成员变量的值
        Student s = new Student("zhangsan",23,"nan");
        name.setAccessible(true);
        //Object value = name.get(s);
        Student value = (Student) name.get(s);
        System.out.println(value);

        name.set(s,"lisi");
        System.out.println(s);
    }
}
