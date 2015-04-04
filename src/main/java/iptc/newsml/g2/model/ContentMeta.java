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
import java.util.LinkedHashSet;
import java.util.Set;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * ContentMetadata Model Object
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/ContentMetadata.html">ContentMetadata</a>
 */

@XmlType(propOrder =
{ "urgency", "contentCreated", "contentModified", "keyword", "creator", "contributor", "subject", "slugline", "headline" })
// TODO add support
// "language", "subject", "description", "", "", "", ""
public class ContentMeta implements Serializable, Cloneable
{
    private static final long serialVersionUID = 1L;

    private Integer urgency;

    @NotNull
    private Calendar contentCreated;

    private Calendar contentModified;

    private Author creator;

    private Author contributor;

    @NotNull
    private Set<Subject> subject = new LinkedHashSet<Subject>();

    private Slugline slugline;

    private Headline headline;

    @NotNull
    private Set<Keyword> keyword = new LinkedHashSet<Keyword>();

    public ContentMeta()
    {
    }

    @XmlElement(nillable = true)
    public Integer getUrgency()
    {
        return urgency;
    }

    public void setUrgency(Integer urgency)
    {
        this.urgency = urgency;

    }

    @XmlElement()
    public Calendar getContentCreated()
    {
        return contentCreated;
    }

    public void setContentCreated(Calendar contentCreated)
    {
        this.contentCreated = contentCreated;
    }

    @XmlElement(nillable = true)
    public Calendar getContentModified()
    {
        return contentModified;
    }

    public void setContentModified(Calendar contentModified)
    {
        this.contentModified = contentModified;
    }

    public void setCreator(Author creator)
    {
        this.creator = creator;
    }

    @XmlElement()
    public Author getCreator()
    {
        return creator;
    }

    public void setContributor(Author contributor)
    {
        this.contributor = contributor;
    }

    @XmlElement()
    public Author getContributor()
    {
        return contributor;
    }

    public void setSubject(Set<Subject> subject)
    {
        this.subject = subject;
    }

    @XmlElement()
    public Set<Subject> getSubject()
    {
        return subject;
    }

    public void setSlugline(Slugline slugline)
    {
        this.slugline = slugline;
    }

    @XmlElement()
    public Slugline getSlugline()
    {
        return slugline;
    }

    public void setHeadline(Headline headline)
    {
        this.headline = headline;
    }

    @XmlElement()
    public Headline getHeadline()
    {
        return headline;
    }

    @XmlElement()
    public Set<Keyword> getKeyword()
    {
        return keyword;
    }

    public void setKeyword(Set<Keyword> keyword)
    {
        this.keyword = keyword;

    }
}
