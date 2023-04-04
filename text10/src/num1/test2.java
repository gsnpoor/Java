package num1;

public class test2 {
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = s1;
        s1 = "123";
        //System.out.println(s2);

        String s3 = new String("abc");
        String s4 = "abc";
        System.out.println(s4.equals(s3));
        System.out.println(s3.equals(s4));


////        System.out.println(s3);
////        System.out.println(s1 == s2);
//        //System.out.println(s1 == s3);
//        System.out.println(s1);
//        //boolean result1 = s1.equals(s2);
//        boolean result2 = s1.equals(s3);
//        //System.out.println(result1);
//        System.out.println(result2);
    }
}
