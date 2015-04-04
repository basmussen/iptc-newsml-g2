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


import iptc.newsml.g2.model.Author;

/**
 * Author Model Builder
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/Author.html">Author</a>
 * @see Author
 */
public class AuthorBuilder
{

    private String uri;
    private String role;
    private String roleUri;
    private String jobTitle;
    private String jobTitleUri;

    /**
     * Static factory method for Author
     */
    public static AuthorBuilder author()
    {
        return new AuthorBuilder();
    }

    /**
     * Delegating factory method
     * 
     * @return
     */
    public static AuthorBuilder creator()
    {
        return author();
    }

    /**
     * Delegating factory method
     * 
     * @return
     */
    public static AuthorBuilder contributor()
    {
        return author();
    }

    public AuthorBuilder()
    {
    }

    public AuthorBuilder uri(String val)
    {
        this.uri = val;
        return this;
    }

    public AuthorBuilder role(String val)
    {
        this.role = val;
        return this;
    }

    public AuthorBuilder roleUri(String val)
    {
        this.roleUri = val;
        return this;
    }

    public AuthorBuilder jobTitle(String val)
    {
        this.jobTitle = val;
        return this;
    }

    public AuthorBuilder jobTitleUri(String val)
    {
        this.jobTitleUri = val;
        return this;
    }

    private String getRole()
    {
        return role;
    }

    private String getRoleUri()
    {
        return roleUri;
    }

    private String getJobTitle()
    {
        return jobTitle;
    }

    private String getJobTitleUri()
    {
        return jobTitleUri;
    }

    /**
     * @return new Author instance
     */
    public Author build()
    {
        Author obj = new Author();
        obj.setUri(uri);
        obj.setRole(role);
        obj.setRoleUri(roleUri);
        obj.setJobTitle(jobTitle);
        obj.setJobTitleUri(jobTitleUri);
        return obj;
    }
}
