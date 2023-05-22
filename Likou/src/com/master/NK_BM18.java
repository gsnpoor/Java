package com.master;

class SolutionBM18 {
    public boolean Find(int target, int[][] array) {
        if (array.length == 0 || array[0].length == 0) {
            return false;
        }
        int len1 = array.length;
        int len2 = array[0].length;
        int i = 0;
        while (i < len1 && target > array[i][len2 - 1]) {
            i++;
        }
        if (i >= len1) {
            return false;
        }
        while (i < len2) {
            for (int j = 0; j < len2; j++) {
                if (array[i][j] == target) {
                    return true;
                }
                if (array[i][j] < target && array[i][j + 1] > target) {
                    break;
                }
            }
            i++;
        }
        return false;
    }
}

public class NK_BM18 {
    public static void main(String[] args) {
        int[][] array = {{}};
        boolean find = new SolutionBM18().Find(16, array);
        System.out.println(find);
    }
}
