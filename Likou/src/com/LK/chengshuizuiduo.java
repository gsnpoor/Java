package com.LK;

public class chengshuizuiduo {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = 0;
        while (start < end){
            max = height[start] < height[end]?
                    Math.max((end - start) * height[start++], max):
                    Math.max((end - start) * height[end--], max);
        }
        return max;
    }
}
