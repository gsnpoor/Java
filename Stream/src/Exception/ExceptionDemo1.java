package Exception;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        try {
            //可能出现异常的代码;
            System.out.println(arr[10]);
            System.out.println(2 / 0);
            String s = null;
            System.out.println(s.equals("aa"));
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
            System.out.println("索引越界了");
        }

        System.out.println("zhixing");
    }
}
