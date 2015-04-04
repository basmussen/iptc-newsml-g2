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

import iptc.common.validation.QcodeValidation;
import java.io.Serializable;
import java.lang.Cloneable;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Qcode Model Object
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/Qcode.html">Qcode</a>
 */
public class Qcode implements Serializable, Cloneable
{
    private static final long serialVersionUID = 1L;

    @QcodeValidation
    @NotNull
    private String qcode;

    public Qcode()
    {
    }

    @XmlAttribute()
    public String getQcode()
    {
        return qcode;
    }

    public void setQcode(String qcode)
    {
        this.qcode = qcode;

    }
}
