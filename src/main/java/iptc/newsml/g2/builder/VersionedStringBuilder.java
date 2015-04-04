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

import iptc.newsml.g2.model.VersionedString;

/**
 * VersionedString Model Builder
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/VersionedString.html">VersionedString</a>
 * @see VersionedString
 */
public class VersionedStringBuilder
{

    private String versioninfo;

    /**
     * Static factory method for VersionedString
     */
    public static VersionedStringBuilder versionedString()
    {
        return new VersionedStringBuilder();
    }

    public VersionedStringBuilder()
    {
    }

    public VersionedStringBuilder versioninfo(String val)
    {
        this.versioninfo = val;
        return this;
    }

    public String getVersioninfo()
    {
        return versioninfo;
    }

    /**
     * @return new VersionedString instance
     */
    public VersionedString build()
    {
        VersionedString obj = new VersionedString();

        obj.setVersioninfo(versioninfo);

        return obj;
    }
}
