package com.meituan;

import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public void myFunc(ArrayList<ArrayList<Integer>> arr) {
        ArrayList<ArrayList<Integer>> arrList = new ArrayList<>();
        int size = arr.get(0).size();
        for (int i = 0; i < size; i++) {
            ArrayList<Integer> arrItem = new ArrayList<>();
            for (ArrayList<Integer> integers : arr) {
                arrItem.add(integers.get(i));
            }
            arrList.add(arrItem);
        }
        for (ArrayList<Integer> integers : arrList) {
            int i;
            for (i = 0; i < integers.size() - 1; i++) {
                System.out.print(integers.get(i));
                System.out.print(' ');
            }
            System.out.println(integers.get(i));
        }
    }
}

public class juzhen {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        while (cin.hasNextLine()) {
            ArrayList<Integer> row = new ArrayList<>();
            String line = cin.nextLine();
            if (line.length() > 0) {
                String[] arrLine = line.split(" ");
                for (int i = 0; i < arrLine.length; i++) {
                    row.add(Integer.parseInt(arrLine[i]));
                }
                arr.add(row);
            }
        }
        new Solution().myFunc(arr);
    }
}
