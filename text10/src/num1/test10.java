package num1;

public class test10 {
    public static void main(String[] args){
        String num1 = "123456789";
        String num2 = "123456789";
        System.out.println(zf(num1, num2));
    }
    public static int cj(String s){
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            num = num * 10 + s.charAt(i) - 48;
        }
        return num;
    }
    public static String zf(String a, String b){
        int c = cj(a) * cj(b);
        if (c > Math.pow(2, 31)) {
            StringBuilder sb = new StringBuilder();
            while (c > 0) {
                sb.append(c % 10);
                c = c / 10;
            }
            return sb.reverse().toString();
        }
        else
            return "0";
    }
}
