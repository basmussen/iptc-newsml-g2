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

import iptc.newsml.g2.model.Qcode;

/**
 * Qcode Model Builder
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/Qcode.html">Qcode</a>
 * @see Qcode
 */
public class QcodeBuilder
{
    // TODO uri
    // TODO schemeUri
    private String qcode;

    /**
     * Static factory method for Qcode
     */
    public static QcodeBuilder qcode()
    {
        return new QcodeBuilder();
    }

    public QcodeBuilder()
    {
    }

    public QcodeBuilder pubStatusUsable()
    {
        this.qcode = "stat:usable";
        return this;
    }

    public QcodeBuilder qcode(String val)
    {
        this.qcode = val;
        return this;
    }

    public String getQcode()
    {
        return qcode;
    }

    /**
     * @return new Qcode instance
     */
    public Qcode build()
    {
        Qcode obj = new Qcode();

        obj.setQcode(qcode);

        return obj;
    }
}
