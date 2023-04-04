package StreamDemo;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张无忌");
        list1.add("周芷若");
        list1.add("赵敏");
        list1.add("张强");
        list1.add("张三丰");

        list1.stream()
                .filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .forEach(s -> System.out.println(s));

        /*ArrayList<String> list2 = new ArrayList<>();
        for (String name: list1){
            if (name.startsWith("张")) {
                list2.add(name);
            }
        }
        for (String s : list2) {
            System.out.println(s);
        }
        System.out.println("-------------------");
        ArrayList<String> list3 = new ArrayList<>();
        for (String name: list2){
            if (name.length() == 3) {
                list3.add(name);
            }
        }
        for (String s : list3) {
            System.out.println(s);
        }*/
    }
}
