package num1;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("张三", 23, "diyi");
        Student s2 = new Student("李四", 24, "dier");
        Student s3 = new Student("王五", 25, "disan");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println(contains(list, "王五"));
    }

    public static String contains(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getName().equals(id)){
                return stu.getGrade();
            }
        }
        return "-1";
    }
}
