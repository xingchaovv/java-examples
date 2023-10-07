package date_time;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class JodaTimeExample {

    public static void main(String[] args) {
        // 解析日期
        DateTime dateTime1 = DateTime.parse("2011-02-03");
        // 2011-02-03T00:00:00.000+08:00
        System.out.println(dateTime1);

        // 解析日期、时间
        DateTime dateTime2 = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")
                .parseDateTime("2011-02-03 04:05:06");
        // 2011-02-03T04:05:06.000+08:00
        System.out.println(dateTime2);

    }
}
