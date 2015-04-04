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

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Keyword Model Object
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/Keyword.html">Keyword</a>
 */
public class Keyword implements Serializable, Cloneable
{
    private static final long serialVersionUID = 1L;

    @NotNull
    private String keyword;

    @NotNull
    private Integer rank;

    public Keyword()
    {
    }

    @XmlAttribute()
    public String getKeyword()
    {
        return keyword;
    }

    public void setKeyword(String keyword)
    {
        this.keyword = keyword;

    }

    @XmlAttribute()
    public Integer getRank()
    {
        return rank;
    }

    public void setRank(Integer rank)
    {
        this.rank = rank;

    }

    @Override
    public boolean equals(Object obj)
    {

        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }

        if (obj instanceof Keyword)
        {
            Keyword k = (Keyword) obj;
            if (keyword != null && keyword.equals(k.getKeyword()) && rank != null && rank.equals(k.getRank()))
            {
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        // TODO override
        return super.hashCode();
    }
}
