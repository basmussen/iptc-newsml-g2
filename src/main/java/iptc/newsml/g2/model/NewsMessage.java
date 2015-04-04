package iptc.newsml.g2.model;

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

import iptc.newsml.g2.model.Header;
import java.io.Serializable;
import java.lang.Cloneable;
import java.util.HashSet;
import java.util.Set;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * NewsMessage Model Object
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/NewsMessage.html">NewsMessage</a>
 */
@XmlRootElement(name = "NewsMessage")
public class NewsMessage implements Serializable, Cloneable
{
    private static final long serialVersionUID = 1L;

    @NotNull
    private Set<AnyItem> itemSet = new HashSet<AnyItem>();
    @NotNull
    private Header header;

    public NewsMessage()
    {
    }

    @XmlElement()
    public Set<AnyItem> getItemSet()
    {
        return itemSet;
    }

    public void setItemSet(Set<AnyItem> itemSet)
    {
        this.itemSet = itemSet;

    }

    @XmlElement()
    public Header getHeader()
    {
        return header;
    }

    public void setHeader(Header header)
    {
        this.header = header;
    }

}
