public class LK_58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("      "));
    }
    public static int lengthOfLastWord(String s) {
        int count = 0;
        int i = s.length() - 1;
        while (s.charAt(i) == ' ') {
            if (i == 0) {
                return 0;
            }
            i--;
        }

        while (s.charAt(i) != ' '){
            count++;
            if (i == 0){
                return count;
            }
            i--;
        }
        return count;
    }
}
