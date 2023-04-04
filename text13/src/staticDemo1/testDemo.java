package staticDemo1;

import java.lang.reflect.Array;

public class testDemo {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        String str = studentTest.printArr(arr1);
        System.out.println(str);

        double[] arr2 = {1,3,2,4,5,6,7,685};
        double avg = studentTest.getAverage(arr2);
        System.out.println(avg);
    }
}
