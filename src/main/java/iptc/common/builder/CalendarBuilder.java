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

        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-DD-MM HH:mm:ss", locale);
        sdf.setTimeZone(tz);

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
