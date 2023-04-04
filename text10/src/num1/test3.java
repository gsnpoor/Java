package num1;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args){
        String rightUsername = "zhangsan";
        String rightPassword = "123456";
        for (int i = 0; i < 3 ; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入账号");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
            if (username.equals(rightUsername) && password.equals(rightPassword)){
                System.out.println("用户登陆成功");
                break;
            }else {
                System.out.println("登陆失败，" + "还剩下" + (2-i) + "次机会");
            }
        }
    }
}
