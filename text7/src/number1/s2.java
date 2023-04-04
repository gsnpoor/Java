package number1;

import java.util.Random;

public class s2 {
    public static void main(String[] args){
        int[][] arr = new int[][]{{1,2,3},{4,5,6,7,8}};
        int[][] arr2 = new int[][]{
                {1, 2, 3},
                {4, 5, 6, 7, 8, 9, 0}
        };
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }
    }
}
