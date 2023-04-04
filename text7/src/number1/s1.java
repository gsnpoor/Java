package number1;

import java.util.Random;

public class s1 {
    public static void main(String[] args){
        char[] arr1 = new char[52];
        for (int i = 0; i < arr1.length; i++) {
            if (i <= 25)
                arr1[i] = (char)(97 + i);
            else
                arr1[i] = (char)(65 + i - 26);
        }
        Random r = new Random();
        int[] arr2 = new int[5];
        for (int i = 0; i < 5; i++) {
            if (i < 4)
                arr2[i] = r.nextInt(arr1.length);
            else
                arr2[i] = r.nextInt(10);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (i == 4)
                System.out.println(arr2[i]);
            else
                System.out.print(arr1[arr2[i]]);
        }
    }
}
