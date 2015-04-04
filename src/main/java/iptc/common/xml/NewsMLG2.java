package iptc.common.xml;

import iptc.newsml.g2.model.AnyItem;

import java.io.Reader;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * NewsMLG2 Processor
 * 
 * @author Ben Asmussen
 *
 */
public class NewsMLG2
{

    public static NewsMLG2 aProcessor()
    {
        return new NewsMLG2();
    }

    public void toXml(AnyItem anyItem, Writer writer) throws Exception
    {
        JAXBContext jaxbContext = JAXBContext.newInstance(anyItem.getClass());
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(anyItem, writer);
    }

    public AnyItem toModel(Class<?> clazz, Reader reader) throws Exception
    {
        JAXBContext jaxbContext = JAXBContext.newInstance(clazz);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        AnyItem anyItem = (AnyItem) jaxbUnmarshaller.unmarshal(reader);

        return anyItem;
    }

}
