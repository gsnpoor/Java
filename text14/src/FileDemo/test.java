package FileDemo;

public class test {
    public static void main(String[] args) {
        /*final int a = 10;
        final Person s = new Person("zhangsan", 23);
        System.out.println(s);
        s.setAge(18);
        s.setName("wangwu");
        System.out.println(s);*/

        final int[] arr = {1,2,3,4,5};
        arr[0] = 10;
        arr[1] = 20;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr);
        }
    }
}

final class Fu{
    public void show(){
        System.out.println("fulei");
    }
}
/*
class Zi extends Fu{

}*/
