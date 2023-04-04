package num2.Demo;

import java.util.ArrayList;
import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入整数");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);
            if(num < 1 || num > 100){
                System.out.println("异常");
                continue;
            }
            arr.add(num);
            int sum = getSum(arr);
            if (sum >= 200){
                System.out.println("结束");
                break;
            }
        }
    }

    private static int getSum(ArrayList<Integer> arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
