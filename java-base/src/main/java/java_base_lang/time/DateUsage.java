package java_base_lang.time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUsage {

    public static void main(String[] args) throws ParseException {
        // 实例化
        System.out.printf("%50s %s\n", "new Date:", new Date());

//        System.out.printf("%50s %s\n", "getInstance().parse:",
//                DateFormat.getInstance().parse("1/2/2021, 4:53 PM")
//        );

        System.out.printf("%50s %s\n", "Locale.ROOT).parse:",
                DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM, Locale.ROOT)
                        .parse("2021-01-02 03:04:05")
        );

        System.out.printf("%50s %s\n", "Locale.CHINESE).parse:",
                DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINESE).parse("2021年1月23日")
        );

        System.out.printf("%50s %s\n", "SimpleDateFormat(\"yyyy-MM-dd HH:mm:ss\").parse:",
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2021-02-04 06:08:10")
        );

        // 格式化
        System.out.printf("%50s %s\n", "getInstance().format:",
                DateFormat.getInstance().format(new Date())
        );

        System.out.printf("%50s %s\n", "getDateTimeInstance().format:",
                DateFormat.getDateTimeInstance().format(new Date())
        );

        System.out.printf("%50s %s\n", "format by Locale.ROOT:",
                DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM, Locale.ROOT).format(new Date())
        );

        System.out.printf("%50s %s\n", "format by yyyy-MM-dd HH:mm:ss:",
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
        );
    }
}
