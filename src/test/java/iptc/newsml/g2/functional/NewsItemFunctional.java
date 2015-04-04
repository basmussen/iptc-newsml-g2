package iptc.newsml.g2.functional;

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
import static iptc.newsml.g2.builder.AuthorBuilder.*;
import static iptc.newsml.g2.builder.CatalogRefBuilder.*;
import static iptc.newsml.g2.builder.ContentMetaBuilder.*;
import static iptc.newsml.g2.builder.ItemMetaBuilder.*;
import static iptc.newsml.g2.builder.NameBuilder.*;
import static iptc.newsml.g2.builder.NewsItemBuilder.*;
import static iptc.newsml.g2.builder.QcodeBuilder.*;
import static iptc.newsml.g2.builder.RelationBuilder.*;
import static iptc.newsml.g2.builder.SubjectBuilder.*;
import static iptc.helper.TestHelper.*;
import iptc.common.xml.NewsMLG2;
import iptc.helper.TestHelper;
import iptc.newsml.g2.builder.ContentMetaBuilder;
import iptc.newsml.g2.builder.ItemMetaBuilder;
import iptc.newsml.g2.builder.NewsItemBuilder;

import java.io.StringWriter;

import org.custommonkey.xmlunit.XMLAssert;
import org.junit.Test;

public class NewsItemFunctional
{

    @Test
    public void testNewsItemUseCase001() throws Exception
    {
        NewsItemBuilder newsItem = newsItem();

        newsItem.guid("urn:newsml:acmenews.com:20141121:US-FINANCE-FED").version(1);
        newsItem.standardversion("2.19").standard("NewsML-G2").conformance("Power");

        newsItem.addCatalogRef(catalogRef().href("http://www.iptc.org/std/catalog/catalog.IPTC-G2-Standards_25.xml"));
        newsItem.addCatalogRef(catalogRef().href("http://www.example.com/newsml-g2/catalog.enews_2.xml"));
        newsItem.lang("de");

        ItemMetaBuilder itemMeta = itemMeta();
        itemMeta.itemClass(qcode().qcode("ninat:text"));
        itemMeta.versionCreated(calendar().date("2015-01-14"));
        itemMeta.contentModified(calendar().date("2015-01-15"));

        itemMeta.embargoed(calendar().date("2015-01-15"));
        itemMeta.pubStatus(qcode().pubStatusUsable());
        itemMeta.service(qcode().qcode("srv:finance"));
        // TODO add support edNote
        // TODO add support signal
        // TODO add support link
        newsItem.itemMeta(itemMeta);

        ContentMetaBuilder contentMetadata = contentMetadata();
        contentMetadata.contentCreated(calendar().date("2015-01-15"));
        contentMetadata.contentModified(calendar().date("2015-01-15"));
        contentMetadata.urgency(2);
        contentMetadata.creator(creator().uri("http://www.example.com/staff/mjameson"));
        contentMetadata.contributor(contributor().uri("http://www.example.com/staff/mjameson"));
        // <infoSource uri="http://www.example.com" />
        contentMetadata.addSubject(subject().type("cpnat:abstract").qcode("medtop:04000000")
                .addName(name().lang("de").role("nrol:full").value("Arbeitsmarkt")).addBroader(broader().qcode("medtop:04000000")));

        // TODO add support <genre qcode="genre:interview">
        // TODO add support <slugline>
        // TODO add support <headline>

        newsItem.contentMeta(contentMetadata);

        StringWriter writer = new StringWriter();
        NewsMLG2.aProcessor().toXml(newsItem.build(), writer);

        String xml = writer.toString();

        System.out.println(xml);

        String loadFunctionalResource = loadFunctionalResource(TestHelper.STORY_NEWSITEM, "001");
        XMLAssert.assertXMLEqual(xml, loadFunctionalResource);
    }

}
