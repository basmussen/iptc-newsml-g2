package iptc.newsml.g2.model;

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

import java.io.Serializable;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;

/**
 * Header Model Object
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/Header.html">Header</a>
 */
public class Header implements Serializable, Cloneable
{
    private static final long serialVersionUID = 1L;

    @NotNull
    private Calendar sent;

    private Set<CatalogRef> catalogRef = new HashSet<CatalogRef>();

    private String sender;

    private String transmitId;

    // TODO @Range(min = 1, max = 9)
    private Integer priority;

    private String origin;

    @NotNull
    private Set<Calendar> timestamp = new HashSet<Calendar>();

    @NotNull
    private Set<String> destination = new HashSet<String>();

    @NotNull
    private Set<String> channel = new HashSet<String>();

    public Header()
    {
    }

    @XmlElement()
    public Calendar getSent()
    {
        return sent;
    }

    public void setSent(Calendar sent)
    {
        this.sent = sent;

    }

    @XmlElement(nillable = true)
    public Set<CatalogRef> getCatalogRef()
    {
        return catalogRef;
    }

    public void setCatalogRef(Set<CatalogRef> catalogRef)
    {
        this.catalogRef = catalogRef;

    }

    @XmlElement(nillable = true)
    public String getSender()
    {
        return sender;
    }

    public void setSender(String sender)
    {
        this.sender = sender;

    }

    @XmlElement(nillable = true)
    public String getTransmitId()
    {
        return transmitId;
    }

    public void setTransmitId(String transmitId)
    {
        this.transmitId = transmitId;

    }

    @XmlElement(nillable = true)
    public Integer getPriority()
    {
        return priority;
    }

    public void setPriority(Integer priority)
    {
        this.priority = priority;

    }

    @XmlElement(nillable = true)
    public String getOrigin()
    {
        return origin;
    }

    public void setOrigin(String origin)
    {
        this.origin = origin;

    }

    @XmlElement()
    public Set<Calendar> getTimestamp()
    {
        return timestamp;
    }

    public void setTimestamp(Set<Calendar> timestamp)
    {
        this.timestamp = timestamp;

    }

    @XmlElement()
    public Set<String> getDestination()
    {
        return destination;
    }

    public void setDestination(Set<String> destination)
    {
        this.destination = destination;

    }

    @XmlElement()
    public Set<String> getChannel()
    {
        return channel;
    }

    public void setChannel(Set<String> channel)
    {
        this.channel = channel;

    }
}
