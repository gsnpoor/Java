package com.meituan;

import java.util.Scanner;

class SolutionDazi {
    public void Func(String s) {
        int len = s.length();
        int count = 0, num = 0;
        boolean flag = false;
        if (len == 1) {
            if (YN(s.charAt(0))) {
                System.out.println(2);
            } else {
                System.out.println(1);
            }
            return;
        }
        for (int i = 0; i < len - 1; i++) {
            if (YN(s.charAt(i)) != YN(s.charAt(i + 1))) {
                if (num == 0) {
                    count += flag != YN(s.charAt(i)) ? 2 : 1;
                } else {
                    count += num + (flag != YN(s.charAt(i)) ? 2 : 1);
                    flag = YN(s.charAt(i));
                    num = 0;
                }
            } else {
                num++;
            }
        }
        if (num != 0) {
            count += num + (flag != YN(s.charAt(len - 1)) ? 2 : 1);
        } else {
            count += (flag != YN(s.charAt(len - 1)) ? 2: 1);
        }
        System.out.println(count);
    }

    public boolean YN(char ch) {
        return ch < 'a';
    }
}

public class dazi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String s = sc.next();
            new SolutionDazi().Func(s);
            T--;
        }
    }
}
