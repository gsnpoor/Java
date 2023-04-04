package num1.Demo;

public class test5 {
    public static void main(String[] args) {
        /*String regex1 = "(.).+\\1";
        System.out.println("abuba".matches(regex1));
        System.out.println("*adsdad*".matches(regex1));
        System.out.println("132121".matches(regex1));
        System.out.println("asdasdasd1".matches(regex1));
        System.out.println("-------------------------------------");

        String regex2 = "((.)\\2*).+\\1";
        System.out.println("aaaaacccaaaaaa".matches(regex2));
        System.out.println("abcabc".matches(regex2));
        System.out.println("123123123".matches(regex2));
        System.out.println("11122233311".matches(regex2));*/
        String str = "我要学学编编编编编编编程程程程程程程程程程程程";
        //(.)表示第一组，$1表示把第一组的内容再拿出来用
        System.out.println(str.replaceAll("(.)\\1+", "$1"));
    }
}
