package tet;

public class test1 {
    public static void main(String[] args){
        int[] arr = {0,1,2,3,4,5,6,7};
        int[] arr1 = copy(arr, 3, 7);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
    public static int[] copy(int[] arr, int from, int to){
        int[] arr2 = new int[to - from + 1];
        int j = 0;
        for (int i = from; i <= to; ++i){
            arr2[j++] = arr[i];
        }
        return arr2;
    }
}
