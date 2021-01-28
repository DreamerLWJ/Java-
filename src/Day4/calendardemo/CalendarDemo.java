package Day4.calendardemo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        System.out.println("现在的时间是：" + time);
    }
}
