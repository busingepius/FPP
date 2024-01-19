import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 18/01/2024
 * Time : 11:59
 * Project Name : PACKAGE_NAME
 */

public class DateExample {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println("d Time: " + d.getTime());

        long tenYear = 10 * 365 * 24 * 60 * 60;
        Date d2 = new Date(tenYear * 1000L);
        System.out.println(d2);
        System.out.println("d2 Time: " + d2.getTime());
        System.out.println(d2.after(d));
        System.out.println(d.after(d2));

        System.out.println("-".repeat(30));

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal);
        System.out.println("Calendar time: " + cal.getTime());
        System.out.println("Calendar time in milliseconds: " + cal.getTimeInMillis());
        cal.setTime(d2);
        System.out.println("Month od d2: " + cal.get(Calendar.MONTH));
        System.out.println("Day of the month d2: " + cal.get(Calendar.DAY_OF_MONTH));
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        System.out.println("Month of d2 after change: " + cal.get(Calendar.MONTH));

        System.out.println("-".repeat(30));

//        LocalDate localDate = LocalDate.now();
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDate beforeYears = LocalDate.of(2014, 1, 18);
        System.out.println(beforeYears);

        String PATTERN = "MM/dd/yyyy";
        String formattedDate = localDate.format(DateTimeFormatter.ofPattern(PATTERN));
        System.out.println("Formatted Date: " + formattedDate);
    }
}
