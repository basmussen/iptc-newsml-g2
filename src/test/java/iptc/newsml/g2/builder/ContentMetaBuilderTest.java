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


import static iptc.common.builder.CalendarBuilder.*;
import static iptc.newsml.g2.builder.ContentMetaBuilder.*;
import static iptc.newsml.g2.builder.KeywordBuilder.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.*;
import static org.junit.Assert.*;
import iptc.common.builder.CalendarBuilder;
import iptc.newsml.g2.model.ContentMeta;

import org.junit.Test;

public class ContentMetaBuilderTest
{

    @Test
    public void testBuild() throws Exception
    {
        ContentMeta contentMeta = contentMetadata().build();
        assertNotNull(contentMeta);
    }

    @Test
    public void testUrgency() throws Exception
    {
        ContentMeta contentMeta = contentMetadata().urgency(4).build();
        assertThat(contentMeta.getUrgency(), is(equalTo(4)));
    }

    @Test
    public void testContentCreated() throws Exception
    {
        CalendarBuilder cal = calendar().date("2015-03-15").time("06:00:00");

        ContentMeta contentMeta = contentMetadata().contentCreated(cal).build();
        assertEquals(cal.build(), contentMeta.getContentCreated());
    }

    @Test
    public void testContentModified() throws Exception
    {
        CalendarBuilder cal = calendar().date("2015-03-15").time("06:00:00");

        ContentMeta contentMeta = contentMetadata().contentModified(cal).build();
        assertEquals(cal.build(), contentMeta.getContentModified());
    }

    @Test
    public void testKeywords() throws Exception
    {
        KeywordBuilder keyword1 = keyword().keyword("Sport").rank(1);
        KeywordBuilder keyword2 = keyword().keyword("Sail").rank(2);

        ContentMeta contentMeta = contentMetadata().addKeyword(keyword1).addKeyword(keyword2).build();

        assertNotNull(contentMeta.getKeyword());
        assertThat(contentMeta.getKeyword(), hasSize(2));
        assertThat(contentMeta.getKeyword(), hasItems(keyword1.build(), keyword2.build()));
    }
}
