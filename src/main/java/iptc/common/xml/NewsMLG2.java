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
