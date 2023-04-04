package string1;

import java.util.Scanner;

public class ss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length1 = sc.nextInt();
        int wide1 = sc.nextInt();
        int s1 = mj(length1, wide1);
        int length2 = sc.nextInt();
        int wide2 = sc.nextInt();
        int s2 = mj(length2, wide2);
        System.out.println(bj(s1, s2));
    }
    public static int mj(int length, int wide){
        return length * wide;
    }
    public static int bj(int a1, int a2){
        if (a1 > a2)
            return a1;
        else
            return a2;
    }
}
