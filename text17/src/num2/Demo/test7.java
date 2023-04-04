package num2.Demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test7 {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4,5};
        System.out.println(longestPalindrome("cbbd"));
    }

    public static int lengthOfLongestSubstring(String s) {
        String ss = "";
        int a1 = 0, a2 = 0;
        int num = 0, max1 = 0;
        while (a2 < s.length()) {
            if (!ss.contains(String.valueOf(s.charAt(a2)))) {
                ss = ss + s.charAt(a2++);
                num++;
            } else {
                a1++;
                a2 = a1 + 1;
                ss = String.valueOf(s.charAt(a1));
                max1 = Math.max(max1, num);
                num = 1;
            }
        }
        max1 = Math.max(max1, num);
        return max1;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1 + len2;
        int mu = len / 2;
        int a1 = 0;
        int a2 = 0;
        double num = 0.00000;


        if (len % 2 == 1) {
            while ((a1 + a2) <= mu) {
                if (nums1[a1] < nums2[a2])
                    num = nums1[a1++];
                else
                    num = nums2[a2++];
            }
            return num;
        } else {
            return 1;

        }
    }
    public static String longestPalindrome(String s) {
        int a1 = 0;
        int len = s.length();
        int a2 = 0;
        for (int i = 0; i < len; i++) {
            a1 = i;

            a2 = len - i -1;
            while(true){
                if (s.charAt(a1) != s.charAt(a2) || a1 == a2){
                    break;
                }
                a1++;
                a2--;
            }
            if ((a2 - a1) == 1 && s.charAt(a1) == s.charAt(a2)) {
                    a2 = len - i -1;
                    a1 = i;
                    break;
            }
        }
        String  ss = "";
        for (int i = 0; i < a2 - a1 +1; i++) {
                ss = ss + s.charAt(a1 + i);
        }
        return ss;
    }
}
