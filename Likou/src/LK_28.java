public class LK_28 {
    public int strStr(String haystack, String needle) {
        String s = haystack.replaceAll(needle, "A");
        if (s.equals(haystack))
            return -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A'){
                return i;
            }
        }
        return -1;
    }
}
