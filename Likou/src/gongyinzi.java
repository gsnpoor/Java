public class gongyinzi {
    public static void main(String[] args) {
        System.out.println(commonFactors(12,6));
    }

    public static int commonFactors(int a, int b) {
        int count = 1;
        for (int i = 2; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        return count;
    }
}
