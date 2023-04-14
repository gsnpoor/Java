public class LK_66 {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9,8,9,0,7};
        int[] ints = plusOne(digits);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] plusOne(int[] digits) {
        boolean flag = false;
        int len = digits.length;
        for (int digit : digits) {
            if (digit != 9) {
                flag = true;
                break;
            }
        }
        int[] digits2 = new int[len + 1];
        digits2[len] = (digits[len - 1] + 1) % 10;
        int x = (digits[len - 1] + 1) / 10;
        for (int i = len - 1; i > 0; --i) {
            digits2[i] = (digits[i - 1] + x) % 10;
            x = (digits[i - 1] + x) / 10;
        }

        if (flag) {
            for (int i = 1; i < digits2.length; ++i) {
                digits[i - 1] = digits2[i];
            }
            return digits;
        } else {
            digits2[0] = x;
            return digits2;
        }
    }
}
