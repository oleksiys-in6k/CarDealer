import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by employee on 5/25/15.
 */
public class Period {
    private static final int HOUR_OF_BEGINING_WORKIN_DAY = 8;
    private static final int HOUR_OF_ENDING_WORKIN_DAY = 18;

    private Calendar start;
    private Calendar end;

    public Period() {
        System.out.println("Enter first date: ");
        this.start = getTheCalendar();

        System.out.println("Enter second date: ");
        this.end = getTheCalendar();

        setTimeAndHours(start, HOUR_OF_BEGINING_WORKIN_DAY);
        setTimeAndHours(end, HOUR_OF_ENDING_WORKIN_DAY);
    }

    public Calendar getStart() {
        return start;
    }

    public Calendar getEnd() {
        return end;
    }

    public boolean includes(Date time) {
        return start.getTime().before(time) && end.getTime().after(time);
    }

    private void setTimeAndHours(Calendar date, int hours) {
        date.set(Calendar.HOUR_OF_DAY, hours);
        date.set(Calendar.MINUTE, 0);
    }


    private Calendar getTheCalendar() {
        int year = Integer.valueOf(keyboard("year: "));
        int month = Integer.valueOf(keyboard("month: "));
        int day = Integer.valueOf(keyboard("day: "));
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        return calendar;
    }

    private String keyboard(String message) {
        System.out.print(message + " ");
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

}
