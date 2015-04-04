package iptc.newsml.g2.builder;

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

import iptc.common.builder.CalendarBuilder;
import iptc.newsml.g2.model.Header;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

/**
 * Header Model Builder
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/Header.html">Header</a>
 * @see Header
 */
public class HeaderBuilder
{

    private Calendar sent;
    private Set<CatalogRefBuilder> catalogRef = new HashSet<CatalogRefBuilder>();
    private String sender;
    private String transmitId;
    private Integer priority;
    private String origin;
    private Set<CalendarBuilder> timestamp = new HashSet<CalendarBuilder>();
    private Set<String> destination = new HashSet<String>();
    private Set<String> channel = new HashSet<String>();

    /**
     * Static factory method for Header
     */
    public static HeaderBuilder header()
    {
        return new HeaderBuilder();
    }

    public HeaderBuilder()
    {
    }

    public HeaderBuilder sent(Calendar val)
    {
        this.sent = val;
        return this;
    }

    public HeaderBuilder catalogRef(Set<CatalogRefBuilder> val)
    {
        this.catalogRef = val;
        return this;
    }

    public HeaderBuilder sender(String val)
    {
        this.sender = val;
        return this;
    }

    public HeaderBuilder transmitId(String val)
    {
        this.transmitId = val;
        return this;
    }

    public HeaderBuilder priority(Integer val)
    {
        this.priority = val;
        return this;
    }

    public HeaderBuilder origin(String val)
    {
        this.origin = val;
        return this;
    }

    public HeaderBuilder timestamp(Set<CalendarBuilder> val)
    {
        this.timestamp = val;
        return this;
    }

    public HeaderBuilder destination(Set<String> val)
    {
        this.destination = val;
        return this;
    }

    public HeaderBuilder channel(Set<String> val)
    {
        this.channel = val;
        return this;
    }

    public HeaderBuilder addCatalogRef(CatalogRefBuilder val)
    {
        this.getCatalogRef().add(val);
        return this;
    }

    public HeaderBuilder addTimestamp(CalendarBuilder val)
    {
        this.getTimestamp().add(val);
        return this;
    }

    public HeaderBuilder addDestination(String val)
    {
        this.getDestination().add(val);
        return this;
    }

    public HeaderBuilder addChannel(String val)
    {
        this.getChannel().add(val);
        return this;
    }

    public Calendar getSent()
    {
        return sent;
    }

    public Set<CatalogRefBuilder> getCatalogRef()
    {
        return catalogRef;
    }

    public String getSender()
    {
        return sender;
    }

    public String getTransmitId()
    {
        return transmitId;
    }

    public Integer getPriority()
    {
        return priority;
    }

    public String getOrigin()
    {
        return origin;
    }

    public Set<CalendarBuilder> getTimestamp()
    {
        return timestamp;
    }

    public Set<String> getDestination()
    {
        return destination;
    }

    public Set<String> getChannel()
    {
        return channel;
    }

    /**
     * @return new Header instance
     * @throws Exception
     */
    public Header build() throws Exception
    {
        Header obj = new Header();

        obj.setSent(sent);
        if (catalogRef != null)
        {
            for (CatalogRefBuilder item : catalogRef)
            {
                obj.getCatalogRef().add(item.build());
            }
        }
        obj.setSender(sender);
        obj.setTransmitId(transmitId);
        obj.setPriority(priority);
        obj.setOrigin(origin);
        if (timestamp != null)
        {
            for (CalendarBuilder item : timestamp)
            {
                obj.getTimestamp().add(item.build());
            }
        }
        if (destination != null)
        {
            for (String item : destination)
            {
                obj.getDestination().add(item);
            }
        }
        if (channel != null)
        {
            for (String item : channel)
            {
                obj.getChannel().add(item);
            }
        }

        return obj;
    }
}
