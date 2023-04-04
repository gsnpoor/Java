package num1;

import java.util.StringJoiner;

public class test8 {
    public static void main(String[] args){
        StringJoiner sj = new StringJoiner("---", "[", "]");

        sj.add("aaa").add("bbb").add("ccc");

        System.out.println(sj);
        System.out.println(sj.length());
    }
}
