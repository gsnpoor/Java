package ObjectStream;

import java.io.*;

//反序列化流
public class ObjectStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("text18\\aaa.txt"));
        Student o = (Student) ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
