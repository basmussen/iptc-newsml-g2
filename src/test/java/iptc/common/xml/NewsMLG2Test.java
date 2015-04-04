package iptc.common.xml;

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
