package com.LK;

public class LK_70 {
    //f(x) = f(x - 1) + f(x - 2)
    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }

    public static int climbStairs(int n) {
        int p = 0, q = 1, r = 1;
        for (int i = 2; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
            //System.out.println("x = " + r + "  (x-1) = " + q + "  (x-2) = " + p);
        }
        return r;
    }
}
