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
import java.util.LinkedHashSet;
import java.util.Set;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * AnyItem Model Object
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/AnyItem.html">AnyItem</a>
 */
public class AnyItem implements Serializable, Cloneable
{
    private static final long serialVersionUID = 1L;

    private Set<CatalogRef> catalogRef = new LinkedHashSet<CatalogRef>();

    private ItemMeta itemMeta;

    @NotNull
    private String standard;

    @NotNull
    private String standardversion;

    private String conformance;

    @NotNull
    private String guid;

    private Integer version;

    private String lang;

    private String dir;

    public AnyItem()
    {
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

    public void setItemMeta(ItemMeta itemMeta)
    {
        this.itemMeta = itemMeta;
    }

    @XmlElement()
    public ItemMeta getItemMeta()
    {
        return itemMeta;
    }

    @XmlAttribute()
    public String getStandard()
    {
        return standard;
    }

    public void setStandard(String standard)
    {
        this.standard = standard;

    }

    @XmlAttribute()
    public String getStandardversion()
    {
        return standardversion;
    }

    public void setStandardversion(String standardversion)
    {
        this.standardversion = standardversion;

    }

    @XmlAttribute()
    public String getConformance()
    {
        return conformance;
    }

    public void setConformance(String conformance)
    {
        this.conformance = conformance;

    }

    @XmlAttribute()
    public String getGuid()
    {
        return guid;
    }

    public void setGuid(String guid)
    {
        this.guid = guid;

    }

    @XmlAttribute()
    public Integer getVersion()
    {
        return version;
    }

    public void setVersion(Integer version)
    {
        this.version = version;

    }

    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
    public String getLang()
    {
        return lang;
    }

    public void setLang(String lang)
    {
        this.lang = lang;

    }

    @XmlAttribute()
    public String getDir()
    {
        return dir;
    }

    public void setDir(String dir)
    {
        this.dir = dir;

    }

}
