package ObjectStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//序列化流
public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {
        Student stu = new Student("zhangsan",23,"nanjing");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("text18\\aaa.txt"));
        oos.writeObject(stu);
        oos.close();
    }
}
