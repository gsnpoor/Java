package com.meituan;

import java.util.ArrayList;
import java.util.Scanner;

class SolutionMan{
    public void Func(ArrayList<Integer> arr){
        arr.sort(((o1, o2) -> o2 - o1));
        int max= arr.get(0);
        int num = max;
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max - 1, 0);
            if (max > arr.get(i)){
                max = arr.get(i);
            }
            num += max;
        }
        System.out.println(num);
    }
}
public class Manager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        while (k > 0){
            arr.add(sc.nextInt());
            k--;
        }
        new SolutionMan().Func(arr);
    }
}
