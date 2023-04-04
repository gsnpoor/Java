package num1.Demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test4 {
    public static void main(String[] args) {
        String str = "";
        String regex = "";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        while (m.find()){
            String s = m.group();
            System.out.println(s);
        }
        Pattern.compile(regex).matcher(str).find();
    }
}
