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


import iptc.newsml.g2.model.Name;

/**
 * Name Model Builder
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/Name.html">Name</a>
 * @see Name
 */
public class NameBuilder
{

    private String role;
    private String lang;
    private String value;

    /**
     * Static factory method for Name
     */
    public static NameBuilder name()
    {
        return new NameBuilder();
    }

    public NameBuilder()
    {
    }

    public NameBuilder role(String val)
    {
        this.role = val;
        return this;
    }

    public NameBuilder lang(String val)
    {
        this.lang = val;
        return this;
    }

    public NameBuilder value(String val)
    {
        this.value = val;
        return this;
    }

    private String getRole()
    {
        return role;
    }

    private String getLang()
    {
        return lang;
    }

    private String getValue()
    {
        return value;
    }

    /**
     * @return new Name instance
     */
    public Name build()
    {
        Name obj = new Name();

        obj.setRole(role);
        obj.setLang(lang);
        obj.setValue(value);

        return obj;
    }
}
