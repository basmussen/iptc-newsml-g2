package iptc.common.xml;

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


import static iptc.newsml.g2.builder.NewsItemBuilder.*;
import static org.junit.Assert.*;
import iptc.newsml.g2.model.AnyItem;
import iptc.newsml.g2.model.NewsItem;
import static org.hamcrest.CoreMatchers.*;

import java.io.StringReader;
import java.io.StringWriter;

import org.custommonkey.xmlunit.XMLAssert;
import org.junit.Test;

public class NewsMLG2Test
{

    @Test
    public void testToXml() throws Exception
    {
        StringWriter writer = new StringWriter();

        NewsItem newsItem = newsItem().guid("urn:web:00001").build();

        NewsMLG2.aProcessor().toXml(newsItem, writer);

        String xml = writer.toString();

        System.out.println(xml);

        XMLAssert.assertXpathEvaluatesTo("urn:web:00001", "/newsItem/@guid", xml);
    }

    @Test
    public void testToModel() throws Exception
    {
        StringReader reader = new StringReader("<newsItem guid='urn:web:00001'/>");

        AnyItem anyItem = NewsMLG2.aProcessor().toModel(NewsItem.class, reader);

        assertThat(anyItem, instanceOf(NewsItem.class));
        assertThat(anyItem.getGuid(), is("urn:web:00001"));
    }

}
