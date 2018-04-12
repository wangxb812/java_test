package wxb829;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.GregorianCalendar;

public class myDate {
    private int year,month,day;
    public myDate()
    {
        this(System.currentTimeMillis());
    }
    public myDate(long elapsedTime)
    {
        setDate(elapsedTime);
    }
    public myDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
    public boolean setDate(long elapsedTime)
    {
        GregorianCalendar calendar=new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        year=calendar.get(GregorianCalendar.YEAR);
        month=calendar.get(GregorianCalendar.MONTH)+1;
        day=calendar.get(GregorianCalendar.DAY_OF_MONTH);
        return true;
    }
    @Override
    public String toString() {
        return String.format("%4d年%2d月%2d日",year,month,day);
    }
}
