package ObjectStream;

import java.io.*;
import java.util.ArrayList;

//序列化多个数据
public class ObjectStreamDemo3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student stu1 = new Student("zhangsan",23,"nanjing");
        Student stu2 = new Student("lisi",24,"nanjing");
        Student stu3 = new Student("wangwu",25,"nanjing");

        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("text18\\aaa.txt"));
        oos.writeObject(list);
        oos.close();
    }
}
