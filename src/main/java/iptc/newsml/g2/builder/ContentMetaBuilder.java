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
import iptc.newsml.g2.model.ContentMeta;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * ContentMetadata Model Builder
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/ContentMetadata.html">ContentMetadata</a>
 * @see ContentMeta
 */
public class ContentMetaBuilder
{
    private Integer urgency;
    private CalendarBuilder contentCreated;
    private CalendarBuilder contentModified;
    private AuthorBuilder creator;
    private AuthorBuilder contributor;
    private Set<SubjectBuilder> subject = new LinkedHashSet<>();
    private SluglineBuilder slugline;
    private HeadlineBuilder headline;
    private Set<KeywordBuilder> keyword = new LinkedHashSet<KeywordBuilder>();

    /**
     * Static factory method for ContentMetadata
     */
    public static ContentMetaBuilder contentMetadata()
    {
        return new ContentMetaBuilder();
    }

    public ContentMetaBuilder()
    {
    }

    public ContentMetaBuilder urgency(Integer val)
    {
        this.urgency = val;
        return this;
    }

    public ContentMetaBuilder contentCreated(CalendarBuilder val)
    {
        this.contentCreated = val;
        return this;
    }

    public ContentMetaBuilder contentModified(CalendarBuilder val)
    {
        this.contentModified = val;
        return this;
    }

    public ContentMetaBuilder creator(AuthorBuilder val)
    {
        this.creator = val;
        return this;
    }

    public ContentMetaBuilder contributor(AuthorBuilder val)
    {
        this.contributor = val;
        return this;
    }

    public ContentMetaBuilder subject(Set<SubjectBuilder> val)
    {
        this.subject = val;
        return this;
    }

    public ContentMetaBuilder addSubject(SubjectBuilder val)
    {
        this.getSubject().add(val);
        return this;
    }

    public ContentMetaBuilder slugline(SluglineBuilder val)
    {
        this.slugline = val;
        return this;
    }

    public ContentMetaBuilder headline(HeadlineBuilder val)
    {
        this.headline = val;
        return this;
    }

    public ContentMetaBuilder keyword(Set<KeywordBuilder> val)
    {
        this.keyword = val;
        return this;
    }

    public ContentMetaBuilder addKeyword(KeywordBuilder val)
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

    public Set<SubjectBuilder> getSubject()
    {
        return subject;
    }

    public SluglineBuilder getSlugline()
    {
        return slugline;
    }

    public HeadlineBuilder getHeadline()
    {
        return headline;
    }

    public Set<KeywordBuilder> getKeyword()
    {
        return keyword;
    }

    /**
     * @return new ContentMetadata instance
     * @throws Exception
     */
    public ContentMeta build() throws Exception
    {
        ContentMeta obj = new ContentMeta();

        obj.setUrgency(urgency);

        if (contentCreated != null)
        {
            obj.setContentCreated(contentCreated.build());
        }
        if (contentModified != null)
        {
            obj.setContentModified(contentModified.build());
        }
        if (creator != null)
        {
            obj.setCreator(creator.build());
        }
        if (contributor != null)
        {
            obj.setContributor(contributor.build());
        }
        if (subject != null)
        {
            for (SubjectBuilder item : subject)
            {
                obj.getSubject().add(item.build());
            }
        }
        if (slugline != null)
        {
            obj.setSlugline(slugline.build());
        }
        if (headline != null)
        {
            obj.setHeadline(headline.build());
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
