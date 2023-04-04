package num1;

public class test1 {
    public static void main(String[] args){
        String s2 = "abc";
        String s3 = new String(s2);
        s2 = "123";
        System.out.println(s2);
        System.out.println(s3);

//        byte[] ss = {97, 98, 99};
//        String s4 = new String(ss);
//        System.out.println(s4);
//
//        char[] sr = {'a', 'b', 'c'};
//        String s5 = new String(sr);
//        System.out.println(s5);
    }
}
