import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a1 = new int[]{1,2,3,4,5};
        Random r= new Random();
        for (int i = 0; i < a1.length; ++i){
            int in = r.nextInt(a1.length);
            int b = a1[i];
            a1[i] = a1[in];
            a1[in] = b;
        }
        for (int i = 0; i < a1.length; ++i)
            System.out.print(a1[i]+" ");
    }
}