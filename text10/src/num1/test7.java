package num1;

import java.util.Scanner;

public class test7 {
    //实用stringbuilder的场景：字符串的拼接和反转
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("第一个");
        String s1 = sc.next();
        if (s1.equals(new StringBuilder().append(s1).reverse().toString()))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
