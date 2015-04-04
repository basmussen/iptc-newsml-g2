package iptc.newsml.g2.builder;

import static org.junit.Assert.*;
import static iptc.newsml.g2.builder.NewsItemBuilder.*;
import static iptc.newsml.g2.builder.ContentMetadataBuilder.*;
import iptc.newsml.g2.model.NewsItem;

import org.junit.Test;

public class NewsItemBuilderTest
{

    @Test
    public void testBuild() throws Exception
    {
        NewsItem newsItem = newsItem().build();
        assertNotNull(newsItem);
    }

    @Test
    public void testGetContentMeta() throws Exception
    {
        NewsItem newsItem = newsItem().contentMeta(contentMetadata()).build();
        assertNotNull(newsItem.getContentMeta());
    }

}
