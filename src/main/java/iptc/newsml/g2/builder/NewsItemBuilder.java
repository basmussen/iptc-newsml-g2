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

import iptc.newsml.g2.model.NewsItem;

import java.util.HashSet;
import java.util.Set;

/**
 * NewsItem Model Builder
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/NewsItem.html">NewsItem</a>
 * @see NewsItem
 */
public class NewsItemBuilder extends AnyItemBuilder
{

    private Set<CatalogRefBuilder> catalogRef = new HashSet<CatalogRefBuilder>();
    private String standard;
    private String standardversion;
    private String conformance;
    private String guid;
    private String lang;
    private String dir;

    private ContentMetaBuilder contentMeta;

    /**
     * Static factory method for NewsItem
     */
    public static NewsItemBuilder newsItem()
    {
        return new NewsItemBuilder();
    }

    public NewsItemBuilder()
    {
    }

    public NewsItemBuilder catalogRef(Set<CatalogRefBuilder> val)
    {
        this.catalogRef = val;
        return this;
    }

    public NewsItemBuilder standard(String val)
    {
        this.standard = val;
        return this;
    }

    public NewsItemBuilder standardversion(String val)
    {
        this.standardversion = val;
        return this;
    }

    public NewsItemBuilder conformance(String val)
    {
        this.conformance = val;
        return this;
    }

    public NewsItemBuilder guid(String val)
    {
        this.guid = val;
        return this;
    }

    public NewsItemBuilder lang(String val)
    {
        this.lang = val;
        return this;
    }

    public NewsItemBuilder dir(String val)
    {
        this.dir = val;
        return this;
    }

    public NewsItemBuilder addCatalogRef(CatalogRefBuilder val)
    {
        this.getCatalogRef().add(val);
        return this;
    }

    public NewsItemBuilder contentMeta(ContentMetaBuilder contentMeta)
    {
        this.contentMeta = contentMeta;
        return this;
    }

    public Set<CatalogRefBuilder> getCatalogRef()
    {
        return catalogRef;
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

    public String getLang()
    {
        return lang;
    }

    public String getDir()
    {
        return dir;
    }

    public ContentMetaBuilder getContentMeta()
    {
        return contentMeta;
    }

    /**
     * @return new NewsItem instance
     * @throws Exception
     */
    public NewsItem build() throws Exception
    {
        NewsItem obj = new NewsItem();
        super.build(obj);

        if (contentMeta != null)
        {
            obj.setContentMeta(contentMeta.build());
        }

        if (catalogRef != null)
        {
            for (CatalogRefBuilder item : catalogRef)
            {
                obj.getCatalogRef().add(item.build());
            }
        }
        obj.setStandard(standard);
        obj.setStandardversion(standardversion);
        obj.setConformance(conformance);
        obj.setGuid(guid);
        obj.setLang(lang);
        obj.setDir(dir);

        return obj;
    }
}
