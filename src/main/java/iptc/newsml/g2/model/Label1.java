package iptc.newsml.g2.model;

import java.io.Serializable;
import java.lang.Cloneable;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Label1 Model Object
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/Label1.html">Label1</a>
 */
public class Label1 implements Serializable, Cloneable
{
    private static final long serialVersionUID = 1L;

    @NotNull
    private String role;

    @NotNull
    private String roleUri;

    @NotNull
    private String media;

    public Label1()
    {
    }

    @XmlAttribute()
    public String getRole()
    {
        return role;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

    @XmlAttribute()
    public String getRoleUri()
    {
        return roleUri;
    }

    public void setRoleUri(String roleUri)
    {
        this.roleUri = roleUri;
    }

    @XmlAttribute()
    public String getMedia()
    {
        return media;
    }

    public void setMedia(String media)
    {
        this.media = media;
    }
}
