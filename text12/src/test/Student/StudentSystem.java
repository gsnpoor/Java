package test.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    private static final String ADD_STUDENT = "1";
    private static final String DELETE_STUDENT = "2";
    private static final String UPDATE_STUDENT = "3";
    private static final String QUERY_STUDENT = "4";
    private static final String EXIT = "5";
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop: while (true) {
            System.out.println("----------------欢迎来到管理系统----------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请输入选择");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose){
                case ADD_STUDENT -> addStudent(list);
                case DELETE_STUDENT -> deleteStudent(list);
                case UPDATE_STUDENT -> updateStudent(list);
                case QUERY_STUDENT -> queryStudent(list);
                case EXIT -> {
                    System.out.println("退出");
                    break loop;
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    public static void addStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("请输入id");
        s.setId(sc.next());
        System.out.println("请输入姓名");
        s.setName(sc.next());
        System.out.println("请输入年龄");
        s.setAge(sc.nextInt());
        System.out.println("请输入家庭住址");
        s.setAddress(sc.next());


        if (contains(list, s.getId())) {
            list.add(s);
            System.out.println("添加成功");
        }
        else {
            System.out.println("添加失败，重复");
        }
    }
    public static void deleteStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输出要删除的id");
        String id = sc.next();
        if(!contains(list,id)){
            list.remove(getIndex(list, id));
            System.out.println("删除成功");
        }
        else
            System.out.println("删除失败");
    }
    public static void updateStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生id");
        String id = sc.next();
        if(!contains(list, id)){
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId().equals(id)) {
                    Student stu = list.get(i);
                    System.out.println("请输入要修改的学生姓名");
                    stu.setName(sc.next());
                    System.out.println("请输入要修改的学生年龄");
                    stu.setAge(sc.nextInt());
                    System.out.println("请输入要修改的学生家庭地址");
                    stu.setAddress(sc.next());

                    System.out.println("修改成功");
                    return;
                }
            }
        }
        else
            System.out.println("学生不存在");
    }
    public static void queryStudent(ArrayList<Student> list){
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后查询");
            return;
        }
        System.out.println("id\t\t姓名\t\t年龄\t\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }

    public static boolean contains(ArrayList<Student> list, String id){
        for (int i = 0; i < list.size(); i++) {
            Student str = list.get(i);
            if(str.getId().equals(id))
                return false;
        }
        return true;
    }
    public static int getIndex(ArrayList<Student> list, String id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
