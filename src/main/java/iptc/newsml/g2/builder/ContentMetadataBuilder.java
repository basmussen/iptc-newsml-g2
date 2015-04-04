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
import iptc.newsml.g2.model.ContentMetadata;

import java.util.HashSet;
import java.util.Set;

/**
 * ContentMetadata Model Builder
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/ContentMetadata.html">ContentMetadata</a>
 * @see ContentMetadata
 */
public class ContentMetadataBuilder
{

    private Integer urgency;
    private CalendarBuilder contentCreated;
    private CalendarBuilder contentModified;
    private Set<KeywordBuilder> keyword = new HashSet<KeywordBuilder>();

    /**
     * Static factory method for ContentMetadata
     */
    public static ContentMetadataBuilder contentMetadata()
    {
        return new ContentMetadataBuilder();
    }

    public ContentMetadataBuilder()
    {
    }

    public ContentMetadataBuilder urgency(Integer val)
    {
        this.urgency = val;
        return this;
    }

    public ContentMetadataBuilder contentCreated(CalendarBuilder val)
    {
        this.contentCreated = val;
        return this;
    }

    public ContentMetadataBuilder contentModified(CalendarBuilder val)
    {
        this.contentModified = val;
        return this;
    }

    public ContentMetadataBuilder keyword(Set<KeywordBuilder> val)
    {
        this.keyword = val;
        return this;
    }

    public ContentMetadataBuilder addKeyword(KeywordBuilder val)
    {
        this.getKeyword().add(val);
        return this;
    }

    public Integer getUrgency()
    {
        return urgency;
    }

    public CalendarBuilder getContentCreated()
    {
        return contentCreated;
    }

    public CalendarBuilder getContentModified()
    {
        return contentModified;
    }

    public Set<KeywordBuilder> getKeyword()
    {
        return keyword;
    }

    /**
     * @return new ContentMetadata instance
     * @throws Exception
     */
    public ContentMetadata build() throws Exception
    {
        ContentMetadata obj = new ContentMetadata();

        obj.setUrgency(urgency);

        if (contentCreated != null)
        {
            obj.setContentCreated(contentCreated.build());
        }

        if (contentModified != null)
        {
            obj.setContentModified(contentModified.build());
        }

        if (keyword != null)
        {
            for (KeywordBuilder item : keyword)
            {
                obj.getKeyword().add(item.build());
            }
        }

        return obj;
    }
}
