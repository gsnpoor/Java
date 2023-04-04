package num2.Demo;

import java.util.Calendar;
import java.util.Date;

public class test4 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        Date d = new Date(0L);
        c.setTime(d);

        System.out.println(c);


        c.set(Calendar.YEAR, 2000);
        c.set(Calendar.MONTH, 10);

        c.add(Calendar.MONTH, -1);


        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        int week = c.get(Calendar.DAY_OF_WEEK);





        System.out.println(year + "," + month + "," + date + "," + week);


    }
}
