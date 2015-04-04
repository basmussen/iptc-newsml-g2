package iptc.common.builder;

import static iptc.common.builder.CalendarBuilder.calendar;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import org.junit.Test;

public class CalendarBuilderTest
{

    @Test
    public void testCalendarBuilder() throws Exception
    {
        Calendar cal = calendar().build();
        assertNotNull(cal);
    }

    @Test
    public void testCalendarTimeZoneAndLocale() throws Exception
    {
        Calendar cal = calendar().timzone("Europe/Berlin").locale(Locale.GERMAN).build();
        assertNotNull(cal);
        assertEquals("Europe/Berlin", cal.getTimeZone().getID());
    }

    @Test
    public void testDate() throws Exception
    {
        Calendar cal = calendar().timzone("Europe/Berlin").locale(Locale.GERMAN).date("2015-01-01").build();

        SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        sdf.setCalendar(cal);
        String format = sdf.format(cal.getTime());

        assertEquals("Mo, 29 Dez 2014 00:00:00 +0100", format);
    }

    @Test
    public void testDateAndTime() throws Exception
    {
        Calendar cal = calendar().timzone("Europe/Berlin").locale(Locale.GERMAN).date("2015-01-01").time("06:00:00").build();

        SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        sdf.setCalendar(cal);
        String format = sdf.format(cal.getTime());

        assertEquals("Mo, 29 Dez 2014 00:00:00 +0100", format);
    }

}
