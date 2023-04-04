package num1;

public class test9 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
//        默认创建一个长度为16的字节数组
//        添加的内容小于16，直接存
//        添加的内容大于16会扩容（原来的容量*2+2）
//        如果扩容之后还不够，以实际长度为准
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("abc");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("abcdefghijklmnopqrstuvwxyz123456");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
