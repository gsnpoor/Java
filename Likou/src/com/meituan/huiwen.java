package com.meituan;

import java.util.Scanner;

class solutionhw {
    public String yn(String s) {
        int end = s.length() - 1;
        int start = 0;
        boolean flag = true;
        for (int i = 0; i < end; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            return "Yes";
        }
        while (true) {
            if (start >= end) {
                return "No";
            }
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                break;
            }
        }
        String sub = s.substring(start, end + 1);
        int len = sub.length();
        String Yes1 = getYS(sub, len);
        if (Yes1 != null) return Yes1;
        sub = new StringBuilder(sub).reverse().toString();
        String Yes = getYS(sub, len);
        if (Yes != null) return Yes;
        return "No";
    }

    private static String getYS(String sub, int len) {
        for (int i = 0; i < len / 2 + 1; i++) {
            char c = sub.charAt(i);
            String substring = sub.substring(0, len - i) + c + sub.substring(len - i);
            StringBuilder sb = new StringBuilder(substring);
            if (substring.equals(sb.reverse().toString())) {
                return "Yes";
            }
        }
        return null;
    }
}

public class huiwen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ss = new solutionhw().yn(s);
        System.out.println(ss);
    }
}
