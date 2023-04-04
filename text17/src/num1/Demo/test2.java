package num1.Demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test2 {
    public static void main(String[] args) {
        String str = "123asd123asd123asd132asd132aasf132zx56z4v65z879da";

        //method1(str);
        Pattern p = Pattern.compile("\\d{2}");
        Matcher m = p.matcher(str);
        while (m.find()) {
            String s1 = m.group();
            System.out.println(s1);
        }
    }

    private static void method1(String str) {
        Pattern p = Pattern.compile("\\d{0,2}");

        Matcher m = p.matcher(str);
        boolean b = m.find();
        String s1 = m.group();
        System.out.println(s1);
    }
}
