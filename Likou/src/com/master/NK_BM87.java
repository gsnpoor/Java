package com.master;

import java.util.Arrays;

class SolutionBM87 {
    public void merge(int[] A, int m, int[] B, int n) {
        System.arraycopy(B, 0, A, m, n);
        Arrays.sort(A);
        //quickSort(A, 0, A.length - 1);
        System.out.println(Arrays.toString(A));
    }

    public void quickSort(int[] arr, int i, int j) {
        int start = i + 1;
        int end = j;
        int baseNumber = arr[i];
        if (start > end) {
            return;
        }
        while (start != end) {
            while (end > start && arr[end] >= baseNumber) {
                end--;
            }
            while (end > start && arr[start] <= baseNumber) {
                start++;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        int temp = arr[start];
        arr[start] = arr[i];
        arr[i] = temp;
        quickSort(arr, i, start - 1);
        quickSort(arr, start + 1, j);
    }
}

public class NK_BM87 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 0, 0, 0};
        int[] B = {4, 5, 6};
        new SolutionBM87().merge(A, 3, B, 3);
    }
}
