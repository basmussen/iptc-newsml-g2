package iptc.common.builder;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Calendar Builder
 * 
 * @author Ben Asmussen
 *
 */
public class CalendarBuilder
{

    private String date;
    private String time;
    private TimeZone tz;
    private Locale locale;

    public CalendarBuilder()
    {
    }

    public static CalendarBuilder calendar()
    {
        return new CalendarBuilder();
    }

    public CalendarBuilder timzone(String tz)
    {
        this.tz = TimeZone.getTimeZone(tz);
        return this;
    }

    public CalendarBuilder locale(Locale locale)
    {
        this.locale = locale;
        return this;
    }

    public CalendarBuilder date(String date)
    {
        this.date = date;
        return this;
    }

    public CalendarBuilder time(String time)
    {
        this.time = time;
        return this;
    }

    public Calendar build() throws Exception
    {
        if (locale == null)
        {
            locale = Locale.getDefault();
        }

        if (tz == null)
        {
            tz = TimeZone.getDefault();
        }

        Calendar cal = Calendar.getInstance(tz, locale);

        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-DD-MM HH:mm:ss");

        if (time == null)
        {
            time = "00:00:00";
        }

        if (date != null && time != null)
        {
            Date d = sdf.parse(date + " " + time);
            cal.setTime(d);
        }

        return cal;
    }
}
