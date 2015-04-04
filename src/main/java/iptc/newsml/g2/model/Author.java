package iptc.newsml.g2.model;

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
