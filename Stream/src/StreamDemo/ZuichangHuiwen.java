package StreamDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZuichangHuiwen {
    public static void main(String[] args) {
        System.out.println(longestPalindrome1("abab"));
    }

    public String longestPalindrome2(String s) {
        String str = "";
        int start = 0;
        int end = 0;
        boolean boo = false;
        if (s.length() == 1 || (s.length() == 2 && s.charAt(0) == s.charAt(1))) {
            return s;
        }
        if (s.length() % 2 == 0) {
            start = s.length() / 2 - 1;
            end = s.length() / 2;
            while (start > -1) {
                if (s.charAt(start) != s.charAt(end)) {
                    boo = false;
                    break;
                }
                boo = true;
                start--;
                end++;
            }
            if (boo) {
                return s;
            }
        }

        String regex = "(\\w)(\\1)+";
        Pattern r = Pattern.compile(regex);
        Matcher m = r.matcher(s);
        if (m.find()) {
            String str2 = m.group();
            if (str2.length() > str.length())
                str = str2;
        }
        for (int i = 1; i < s.length(); ++i) {
            String str1 = String.valueOf(s.charAt(i));
            start = i - 1;
            end = i + 1;
            while (true) {
                if (start < 0 || end >= s.length())
                    break;
                if (s.charAt(start) == s.charAt(end)) {
                    str1 = String.valueOf(s.charAt(start)) + str1 + String.valueOf(s.charAt(end));
                    start--;
                    end++;
                } else {
                    break;
                }
            }
            if (str1.length() > str.length())
                str = str1;
        }
        return str;
    }

    public static String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        String str1 = new StringBuffer(s).reverse().toString();
        if (s.equals(str1)) {
            return s;
        }
        int len = str1.length();
        String ans = "";
        for (int i = 0; i < len - 1; ++i) {
            int end = len;
            while (i < end) {
                String ans1 = str1.substring(i, end);
                if (s.contains(ans1)
                        && ans.length() < ans1.length()
                        && ans1.equals(new StringBuffer(ans1).reverse().toString()))
                    ans = ans1;
                end--;
            }
        }
        return ans;
    }

    public static String longestPalindrome1(String s) {

        if (s == null || s.length() == 0) {
            return "";
        }
        int strLen = s.length();
        int left = 0;
        int right = 0;
        int len = 1;
        int maxStart = 0;
        int maxLen = 0;

        for (int i = 0; i < strLen; i++) {
            left = i - 1;
            right = i + 1;
            //确定中心字符串
            while (left >= 0 && s.charAt(left) == s.charAt(i)) {
                len++;
                left--;
            }
            while (right < strLen && s.charAt(right) == s.charAt(i)) {
                len++;
                right++;
            }
            //向两侧扩散
            while (left >= 0 && right < strLen && s.charAt(right) == s.charAt(left)) {
                len = len + 2;
                left--;
                right++;
            }

            if (len > maxLen) {
                maxLen = len;
                maxStart = left;
            }
            len = 1;
        }
        return s.substring(maxStart + 1, maxStart + maxLen + 1);
    }
}
