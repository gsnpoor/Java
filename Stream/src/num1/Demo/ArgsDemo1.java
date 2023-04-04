package num1.Demo;

public class ArgsDemo1 {
    public static void main(String[] args) {
        System.out.println(getSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    public static int getSum(int... args) {
        //树大hi大海水滴阿什顿
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        return sum;
    }
}
