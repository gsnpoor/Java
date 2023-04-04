package num1;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args){
        String[] arr1 = {"壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "镹"};
        String[] arr2 = {"元","拾", "佰", "仟", "万", "拾", "佰"};

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额");
        int yuan = sc.nextInt();
        int n, i = 0;
        String result = "";
        while(yuan > 0){
            n = yuan % 10;
            yuan = yuan /10;
            result = arr1[n-1] + arr2[i++] + result;
        }
        int count = (14 - result.length()) / 2;
        for (int j = 0; j < count; j++) {
            result = "零" + arr2[6 - count + 1 + j] + result;
        }
        System.out.println(result);
    }
}
