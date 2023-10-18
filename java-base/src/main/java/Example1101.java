import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

/**
 * Joda-Time Java 时间类库实例、用法
 * <a href="https://www.joda.org/joda-time">官网</a>
 */
public class Example1101 {

    public static void main(String[] args) {
        // 从文本解析日期
        DateTime dateTime1 = DateTime.parse("2011-02-03");
        // 2011-02-03T00:00:00.000+08:00
        System.out.println(dateTime1);

        // 从文本解析日期、时间
        DateTime dateTime2 = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")
                .parseDateTime("2011-02-03 04:05:06");
        // 2011-02-03T04:05:06.000+08:00
        System.out.println(dateTime2);

        // 获取当前时间
        // 2023-10-18T17:02:40.259+08:00
        System.out.println(DateTime.now());

        // DateTime 格式化
        // 231018
        System.out.println(DateTime.now().toString("yyMMdd"));

        // DateTime 转换为类型 java.util.Date
        // Wed Oct 18 17:09:46 CST 2023
        System.out.println(DateTime.now().toDate());

        // DateTime 转换为当日开始时间
        // 2023-04-05T00:00:00.000+08:00
        System.out.println(
            new DateTime("2023-04-05").withTimeAtStartOfDay()
        );

        // DateTime 指定时分秒毫秒
        // 2023-04-05T23:59:59.000+08:00
        System.out.println(
            new DateTime("2023-04-05").withTime(23, 59, 59, 0)
        );
    }
}
