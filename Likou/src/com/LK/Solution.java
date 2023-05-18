package com.LK;

public class Solution {
    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("dvdg"));
    }
    public static int lengthOfLongestSubstring(String s) {
        String ss = "";
        boolean flag = true;
        int num = 0, max1 = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (!ss.contains(String.valueOf(s.charAt(i)))) {
                ss = ss + s.charAt(i);
                num++;
                flag = true;
            } else {
                max1 = Math.max(max1, num);
                num = 1;
                ss = String.valueOf(s.charAt(i));
                System.out.println(ss);
                flag = false;
            }
        }
        if (flag)
            return num;
        else
            return max1;
    }
}
