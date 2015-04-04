package iptc.helper;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

/**
 * 
 * @author Ben Asmussen
 *
 */
public class TestHelper
{

    public static final String STORY_PACKAGEITEM = "packageitem";
    public static final String STORY_NEWSITEM = "newsitem";

    public static String loadFunctionalResource(String story, String useCase) throws IOException
    {
        DefaultResourceLoader loader = new DefaultResourceLoader();
        String location = String.format("classpath:/integration/%s/%s-%s.xml", story, story, useCase);
        Resource resource = loader.getResource(location);

        try (InputStream is = resource.getInputStream())
        {
            return IOUtils.toString(is, Charset.forName("UTF-8"));
        }
        catch (Exception e)
        {
            String message = String.format("Unable to load story '%s' use case '%s'", story, useCase);
            throw new IOException(message, e);
        }

    }
}
