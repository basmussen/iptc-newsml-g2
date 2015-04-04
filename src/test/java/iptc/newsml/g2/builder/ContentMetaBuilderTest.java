package iptc.newsml.g2.builder;

import static iptc.common.builder.CalendarBuilder.*;
import static iptc.newsml.g2.builder.ContentMetadataBuilder.*;
import static iptc.newsml.g2.builder.KeywordBuilder.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.*;
import static org.junit.Assert.*;
import iptc.common.builder.CalendarBuilder;
import iptc.newsml.g2.model.ContentMetadata;

import org.junit.Test;

public class ContentMetaBuilderTest
{

    @Test
    public void testBuild() throws Exception
    {
        ContentMetadata contentMeta = contentMetadata().build();
        assertNotNull(contentMeta);
    }

    @Test
    public void testUrgency() throws Exception
    {
        ContentMetadata contentMeta = contentMetadata().urgency(4).build();
        assertThat(contentMeta.getUrgency(), is(equalTo(4)));
    }

    @Test
    public void testContentCreated() throws Exception
    {
        CalendarBuilder cal = calendar().date("2015-03-15").time("06:00:00");

        ContentMetadata contentMeta = contentMetadata().contentCreated(cal).build();
        assertEquals(cal.build(), contentMeta.getContentCreated());
    }

    @Test
    public void testContentModified() throws Exception
    {
        CalendarBuilder cal = calendar().date("2015-03-15").time("06:00:00");

        ContentMetadata contentMeta = contentMetadata().contentModified(cal).build();
        assertEquals(cal.build(), contentMeta.getContentModified());
    }

    @Test
    public void testKeywords() throws Exception
    {
        KeywordBuilder keyword1 = keyword().keyword("Sport").rank(1);
        KeywordBuilder keyword2 = keyword().keyword("Sail").rank(2);

        ContentMetadata contentMeta = contentMetadata().addKeyword(keyword1).addKeyword(keyword2).build();

        assertNotNull(contentMeta.getKeyword());
        assertThat(contentMeta.getKeyword(), hasSize(2));
        assertThat(contentMeta.getKeyword(), hasItems(keyword1.build(), keyword2.build()));
    }
}
