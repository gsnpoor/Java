package com.LK;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class codefun_12460 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {8, 0, 1, 2, 3, 4, 5, 6, 7},
                {8, 1, 2, 3, 4, 5, 6, 7, 8},
                {8, 2, 3, 4, 5, 6, 7, 8, 9},
                {8, 0, 1, 2, 3, 4, 5, 8, 9},
                {8, 0, 1, 2, 3, 6, 7, 8, 9},
                {8, 0, 1, 4, 5, 6, 7, 8, 9},
                {8, 2, 3, 4, 5, 6, 7, 8, 9}
        };
        int[] count = sr1(arr);
        Map<Integer, Integer> count1 = sr(arr);
        for (int i = 0; i < count.length; i++) {
            System.out.print(count[i] + ", ");
        }
        System.out.println();
        System.out.println("-------------------");
        System.out.println(count1.toString());
        int ell = min(count);

        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        sc.hasNextInt();
    }

    public static int[] sr1(int[][] arr) {
        int[] count = new int[10];

        for (int i = 0; i < 7; i++) {
            int len = arr[i][0];
            for (int j = 1; j <= len; j++) {
                count[arr[i][j]]++;
            }
        }

        return count;
    }

    public static Map<Integer, Integer> sr(int[][] arr) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < 7; i++) {
            int len = arr[i][0];
            for (int j = 1; j <= len; j++) {
                if (!count.containsKey(arr[i][j])) {
                    count.put(arr[i][j], 1);
                } else {
                    Integer num = count.get(arr[i][j]) + 1;
                    count.put(arr[i][j], num);
                }
            }
        }

        AtomicReference<Integer> maxIndex = new AtomicReference<>(0);
        Integer maxValue = 0;
        count.forEach((key, value) -> {
            if (value < maxValue) {
                maxIndex.set(key);
            }
        });

        return count;
    }

    public static int min(int[] count) {
        int num = 0;
        int ell = 0;
        for (int i = 0; i < 10; i++) {
            if (num < count[i]) {
                ell = i;
            }
        }
        return ell;
    }
}
