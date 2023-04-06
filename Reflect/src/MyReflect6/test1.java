package MyReflect6;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class test1 {
    public static void main(String[] args) throws IllegalAccessException, IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Student s = new Student("小A",23,"女",167.5,"睡觉");
        Teacher t = new Teacher("波妞",10000);
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("Reflect\\prop.properties");
        prop.load(fis);
        fis.close();
        System.out.println(prop);

        //获取全类名和方法名
        String className = (String) prop.get("classname");
        String methodName = (String) prop.get("method");

        Class clazz = Class.forName(className);

        //获取构造方法
        Constructor con = clazz.getDeclaredConstructor();
        Object o = con.newInstance();
        System.out.println(o);

        //获取成员方法并运行
        Method method = clazz.getDeclaredMethod(methodName);
        method.setAccessible(true);
        method.invoke(o);

    }
}
