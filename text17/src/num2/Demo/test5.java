package num2.Demo;

public class test5 {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(10);
        Integer i3 = Integer.valueOf(128);
        Integer i4 = Integer.valueOf(128);
        Integer i5 = Integer.valueOf(-128);
        Integer i6 = Integer.valueOf(-128);
        System.out.println(i1 == i2);
        System.out.println(i3 == i4);
        System.out.println(i5 == i6);
    }
}
