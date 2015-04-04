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

import iptc.newsml.g2.model.NewsMessage;

import java.util.HashSet;
import java.util.Set;

/**
 * NewsMessage Model Builder
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/NewsMessage.html">NewsMessage</a>
 * @see NewsMessage
 */
public class NewsMessageBuilder
{

    private Set<AnyItemBuilder> itemSet = new HashSet<AnyItemBuilder>();

    private HeaderBuilder header;

    /**
     * Static factory method for NewsMessage
     */
    public static NewsMessageBuilder newsMessage()
    {
        return new NewsMessageBuilder();
    }

    public NewsMessageBuilder()
    {
    }

    public NewsMessageBuilder itemSet(Set<AnyItemBuilder> val)
    {
        this.itemSet = val;
        return this;
    }

    public NewsMessageBuilder addItemSet(AnyItemBuilder val)
    {
        this.getItemSet().add(val);
        return this;
    }

    public NewsMessageBuilder header(HeaderBuilder header)
    {
        this.header = header;
        return this;
    }

    public Set<AnyItemBuilder> getItemSet()
    {
        return itemSet;
    }

    public HeaderBuilder getHeader()
    {
        return header;
    }

    /**
     * @return new NewsMessage instance
     * @throws Exception
     */
    public NewsMessage build() throws Exception
    {
        NewsMessage obj = new NewsMessage();
        if (header != null)
        {
            obj.setHeader(header.build());
        }

        if (itemSet != null)
        {
            for (AnyItemBuilder item : itemSet)
            {
                obj.getItemSet().add(item.build());
            }
        }

        return obj;
    }
}
