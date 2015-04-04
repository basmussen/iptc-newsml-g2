package iptc.common.builder;

/*
 * #%L
 * IPTC NewsML G2 Model
 * %%
 * Copyright (C) 2015 Ben Asmussen <opensource@ben-asmussen.com>
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


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
