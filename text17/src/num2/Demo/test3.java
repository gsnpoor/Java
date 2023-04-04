package num2.Demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test3 {
    public static void main(String[] args) throws ParseException {
        String startStr = "2023年11月11日 0:0:0";
        String endStr = "2023年11月11日 0:10:0";
        String orderStr = "2023年11月11日 0:01:0";
        //解析
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startData = sdf.parse(startStr);
        Date endData = sdf.parse(endStr);
        Date orderData = sdf.parse(orderStr);

        long startTime = startData.getTime();
        long endTime = endData.getTime();
        long orderTime = orderData.getTime();

        if(orderTime >= startTime && orderTime <= endTime)
            System.out.println("成功");
        else
            System.out.println("失败");
    }
}
