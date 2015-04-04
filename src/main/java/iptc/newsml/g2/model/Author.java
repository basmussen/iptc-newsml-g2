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
import java.lang.Cloneable;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Author Model Object
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/Author.html">Author</a>
 */
public class Author implements Serializable, Cloneable
{
    private static final long serialVersionUID = 1L;

    private String uri;

    private String role;

    private String roleUri;

    private String jobTitle;

    private String jobTitleUri;

    public Author()
    {
    }

    @XmlAttribute()
    public String getUri()
    {
        return uri;
    }

    public void setUri(String uri)
    {
        this.uri = uri;
    }

    @XmlAttribute()
    private String getRole()
    {
        return role;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

    @XmlAttribute()
    private String getRoleUri()
    {
        return roleUri;
    }

    public void setRoleUri(String roleUri)
    {
        this.roleUri = roleUri;
    }

    @XmlAttribute()
    private String getJobTitle()
    {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle)
    {
        this.jobTitle = jobTitle;
    }

    @XmlAttribute()
    private String getJobTitleUri()
    {
        return jobTitleUri;
    }

    public void setJobTitleUri(String jobTitleUri)
    {
        this.jobTitleUri = jobTitleUri;
    }
}
