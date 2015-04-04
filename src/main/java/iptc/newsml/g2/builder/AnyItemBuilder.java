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

import iptc.newsml.g2.model.AnyItem;

import java.util.HashSet;
import java.util.Set;

/**
 * AnyItem Model Builder
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/AnyItem.html">AnyItem</a>
 * @see AnyItem
 */
public abstract class AnyItemBuilder
{

    private Set<CatalogRefBuilder> catalogRef = new HashSet<CatalogRefBuilder>();
    // TODO add support hopHistory
    // TODO add support rightsInfo
    private ItemMetaBuilder itemMeta;
    private String standard;
    private String standardversion;
    private String conformance;
    private String guid;
    private Integer version;
    private String lang;
    private String dir;

    /**
     * Static factory method for AnyItem
     */
    // TODO check refactoring
    // public static AnyItemBuilder anyItem()
    // {
    // return new AnyItemBuilder();
    // }

    public AnyItemBuilder()
    {
    }

    public AnyItemBuilder catalogRef(Set<CatalogRefBuilder> val)
    {
        this.catalogRef = val;
        return this;
    }

    public AnyItemBuilder itemMeta(ItemMetaBuilder val)
    {
        this.itemMeta = val;
        return this;
    }

    public AnyItemBuilder standard(String val)
    {
        this.standard = val;
        return this;
    }

    public AnyItemBuilder standardversion(String val)
    {
        this.standardversion = val;
        return this;
    }

    public AnyItemBuilder conformance(String val)
    {
        this.conformance = val;
        return this;
    }

    public AnyItemBuilder guid(String val)
    {
        this.guid = val;
        return this;
    }

    public AnyItemBuilder version(Integer val)
    {
        this.version = val;
        return this;
    }

    public AnyItemBuilder lang(String val)
    {
        this.lang = val;
        return this;
    }

    public AnyItemBuilder dir(String val)
    {
        this.dir = val;
        return this;
    }

    public AnyItemBuilder addCatalogRef(CatalogRefBuilder val)
    {
        this.getCatalogRef().add(val);
        return this;
    }

    public Set<CatalogRefBuilder> getCatalogRef()
    {
        return catalogRef;
    }

    public ItemMetaBuilder getItemMeta()
    {
        return itemMeta;
    }

    public String getStandard()
    {
        return standard;
    }

    public String getStandardversion()
    {
        return standardversion;
    }

    public String getConformance()
    {
        return conformance;
    }

    public String getGuid()
    {
        return guid;
    }

    public Integer getVersion()
    {
        return version;
    }

    public String getLang()
    {
        return lang;
    }

    public String getDir()
    {
        return dir;
    }

    /**
     * @return new AnyItem instance
     * @throws Exception
     */
    public AnyItem build() throws Exception
    {
        return build(new AnyItem());
    }

    /**
     * @return map by given AnyItem instance
     * @throws Exception
     */
    public AnyItem build(AnyItem obj) throws Exception
    {
        if (catalogRef != null)
        {
            for (CatalogRefBuilder item : catalogRef)
            {
                obj.getCatalogRef().add(item.build());
            }
        }
        if (itemMeta != null)
        {
            obj.setItemMeta(itemMeta.build());
        }
        obj.setStandard(standard);
        obj.setStandardversion(standardversion);
        obj.setConformance(conformance);
        obj.setGuid(guid);
        obj.setVersion(version);
        obj.setLang(lang);
        obj.setDir(dir);

        return obj;
    }
}
