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
import iptc.newsml.g2.model.ItemMeta;

/**
 * ItemMetadata Model Builder
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/ItemMetadata.html">ItemMetadata</a>
 * @see ItemMeta
 */
public class ItemMetaBuilder
{

    private iptc.common.builder.CalendarBuilder versionCreated;
    private iptc.common.builder.CalendarBuilder contentModified;
    private iptc.common.builder.CalendarBuilder firstCreated;
    private iptc.common.builder.CalendarBuilder embargoed;

    private QcodeBuilder itemClass;
    private QcodeBuilder pubStatus;
    private QcodeBuilder role;
    private VersionedStringBuilder generator;
    private VersionedStringBuilder profile;
    private QcodeBuilder service;

    /**
     * Static factory method for ItemMetadata
     */
    public static ItemMetaBuilder itemMeta()
    {
        return new ItemMetaBuilder();
    }

    public ItemMetaBuilder()
    {
    }

    public ItemMetaBuilder versionCreated(CalendarBuilder val)
    {
        this.versionCreated = val;
        return this;
    }

    public ItemMetaBuilder contentModified(CalendarBuilder val)
    {
        this.contentModified = val;
        return this;
    }

    public ItemMetaBuilder firstCreated(CalendarBuilder val)
    {
        this.firstCreated = val;
        return this;
    }

    public ItemMetaBuilder embargoed(CalendarBuilder val)
    {
        this.embargoed = val;
        return this;
    }

    public ItemMetaBuilder itemClass(QcodeBuilder itemClass)
    {
        this.itemClass = itemClass;
        return this;
    }

    public ItemMetaBuilder pubStatus(QcodeBuilder pubStatus)
    {
        this.pubStatus = pubStatus;
        return this;
    }

    public ItemMetaBuilder role(QcodeBuilder role)
    {
        this.role = role;
        return this;
    }

    public ItemMetaBuilder generator(VersionedStringBuilder generator)
    {
        this.generator = generator;
        return this;
    }

    public ItemMetaBuilder profile(VersionedStringBuilder profile)
    {
        this.profile = profile;
        return this;
    }

    public ItemMetaBuilder service(QcodeBuilder service)
    {
        this.service = service;
        return this;
    }

    public CalendarBuilder getVersionCreated()
    {
        return versionCreated;
    }

    public CalendarBuilder getFirstCreated()
    {
        return firstCreated;
    }

    public CalendarBuilder getEmbargoed()
    {
        return embargoed;
    }

    public QcodeBuilder getItemClass()
    {
        return itemClass;
    }

    public QcodeBuilder getPubStatus()
    {
        return pubStatus;
    }

    public QcodeBuilder getRole()
    {
        return role;
    }

    public VersionedStringBuilder getGenerator()
    {
        return generator;
    }

    public VersionedStringBuilder getProfile()
    {
        return profile;
    }

    public QcodeBuilder getService()
    {
        return service;
    }

    /**
     * @return new ItemMetadata instance
     * @throws Exception
     */
    public ItemMeta build() throws Exception
    {
        ItemMeta obj = new ItemMeta();
        if (itemClass != null)
        {
            obj.setItemClass(itemClass.build());
        }
        if (pubStatus != null)
        {
            obj.setPubStatus(pubStatus.build());
        }
        if (role != null)
        {
            obj.setRole(role.build());
        }
        if (generator != null)
        {
            obj.setGenerator(generator.build());
        }
        if (profile != null)
        {
            obj.setProfile(profile.build());
        }
        if (service != null)
        {
            obj.setService(service.build());
        }
        if (versionCreated != null)
        {
            obj.setVersionCreated(versionCreated.build());
        }
        if (contentModified != null)
        {
            obj.setContentModified(contentModified.build());
        }
        if (firstCreated != null)
        {
            obj.setFirstCreated(firstCreated.build());
        }
        if (embargoed != null)
        {
            obj.setEmbargoed(embargoed.build());
        }

        return obj;
    }
}
