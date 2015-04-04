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

import iptc.newsml.g2.model.Qcode;
import iptc.newsml.g2.model.VersionedString;

import java.io.Serializable;
import java.lang.Cloneable;
import java.util.Calendar;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * ItemMetadata Model Object
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/ItemMetadata.html">ItemMetadata</a>
 */
@XmlType(propOrder =
{ "itemClass", "versionCreated", "contentModified", "firstCreated", "embargoed", "pubStatus", "role", "generator", "profile", "service" })
// TODO add support
// "provider", "fileName","title", "edNote", "memberOf", "instanceOf", "signal",
// "altRep", "deliverableOf", "hash", "expires"
public class ItemMeta implements Serializable, Cloneable
{
    private static final long serialVersionUID = 1L;

    @NotNull
    private Calendar versionCreated;

    private Calendar contentModified;

    @NotNull
    private Calendar firstCreated;

    @NotNull
    private Calendar embargoed;
    @NotNull
    private Qcode itemClass;
    @NotNull
    private Qcode pubStatus;
    @NotNull
    private Qcode role;
    @NotNull
    private VersionedString generator;
    @NotNull
    private VersionedString profile;
    @NotNull
    private Qcode service;

    public ItemMeta()
    {
    }

    @XmlElement()
    public Calendar getVersionCreated()
    {
        return versionCreated;
    }

    public void setVersionCreated(Calendar versionCreated)
    {
        this.versionCreated = versionCreated;

    }

    @XmlElement()
    public Calendar getContentModified()
    {
        return contentModified;
    }

    public void setContentModified(Calendar contentModified)
    {
        this.contentModified = contentModified;
    }

    @XmlElement()
    public Calendar getFirstCreated()
    {
        return firstCreated;
    }

    public void setFirstCreated(Calendar firstCreated)
    {
        this.firstCreated = firstCreated;

    }

    @XmlElement()
    public Calendar getEmbargoed()
    {
        return embargoed;
    }

    public void setEmbargoed(Calendar embargoed)
    {
        this.embargoed = embargoed;

    }

    @XmlElement()
    public Qcode getItemClass()
    {
        return itemClass;
    }

    public void setItemClass(Qcode itemClass)
    {
        this.itemClass = itemClass;
    }

    @XmlElement()
    public Qcode getPubStatus()
    {
        return pubStatus;
    }

    public void setPubStatus(Qcode pubStatus)
    {
        this.pubStatus = pubStatus;
    }

    @XmlElement()
    public Qcode getRole()
    {
        return role;
    }

    public void setRole(Qcode role)
    {
        this.role = role;
    }

    @XmlElement()
    public VersionedString getGenerator()
    {
        return generator;
    }

    public void setGenerator(VersionedString generator)
    {
        this.generator = generator;
    }

    @XmlElement()
    public VersionedString getProfile()
    {
        return profile;
    }

    public void setProfile(VersionedString profile)
    {
        this.profile = profile;
    }

    @XmlElement()
    public Qcode getService()
    {
        return service;
    }

    public void setService(Qcode service)
    {
        this.service = service;
    }

}
