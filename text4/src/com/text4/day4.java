package com.text4;

import static com.text4.hello.hh;

public class day4 {
    public static void main(String[] args) {
        int[] arr1 = {11,22};
        int[] arr2 = arr1;
        arr2[0] = 33;
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        hh();
    }
}
