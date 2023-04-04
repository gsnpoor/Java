package IOTest;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class IOTestDemo3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        login(username, password);
    }

    public static void Register(String username, String password) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Stream\\aaa\\userinfo.txt"));
        String line;
        HashMap<String, String> hm = new HashMap();
        while ((line = br.readLine()) != null) {
            String[] userInfo = line.split("&");
            String rightUserName = userInfo[0].split("=")[1];
            String rightUserPassword = userInfo[1].split("=")[1];
            hm.put(rightUserName, rightUserPassword);
        }
        br.close();

        if (hm.containsKey(username)) {
            System.out.println("用户名已存在");
        } else {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Stream\\aaa\\userinfo.txt", true));
            bw.write("username=" + username + "&password=" + password);
            bw.newLine();
            bw.close();
            System.out.println("注册成功");
        }
    }

    public static void login(String username, String password) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Stream\\aaa\\userinfo.txt"));
        String line;
        HashMap<String, String> hm = new HashMap();
        while ((line = br.readLine()) != null) {
            String[] userInfo = line.split("&");
            String rightUserName = userInfo[0].split("=")[1];
            String rightUserPassword = userInfo[1].split("=")[1];
            hm.put(rightUserName, rightUserPassword);
        }
        br.close();

        if (hm.containsKey(username) && hm.get(username).equals(password)) {
            System.out.println("登陆成功");
        } else {
            System.out.println("密码错误");
        }
    }
}
