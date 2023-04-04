package num1;

public class test6 {
    public static void main(String[] args){
//        String s = "123" + "456";
//        System.out.println(s.charAt(1));

        StringBuilder sb = new StringBuilder("abc");
        sb.append(1);
        sb.append(2.4);
        sb.append(true);
        System.out.println(sb.append(1).append(2).append(true).length());
//        sb.reverse();

        System.out.println(sb);
        System.out.println(sb.length());
        String str = sb.toString(); //把stringbuilder转换为字符串
        System.out.println(str);
    }
}
