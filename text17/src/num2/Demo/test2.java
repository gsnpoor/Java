package num2.Demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test2 {
    public static void main(String[] args) throws ParseException {
        String str = "2023-11-11 11:11:11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        System.out.println(date);
    }

    private static void method1() {
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d1 = new Date();
        System.out.println(sdf1.format(d1));

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        String str2 = sdf2.format(d1);
        System.out.println(str2);
    }
}
