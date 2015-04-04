package iptc.newsml.g2.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlValue;

/**
 * Slugline Model Object
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/Slugline.html">Slugline</a>
 */
public class Slugline implements Serializable, Cloneable
{
    private static final long serialVersionUID = 1L;

    
    @NotNull
    private String value;

    @NotNull
    private String separator;

    @NotNull
    private String role;

    @NotNull
    private String roleUri;

    @NotNull
    private Integer rank;

    public Slugline()
    {
    }

    @XmlValue()
    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;

    }

    @XmlAttribute()
    public String getSeparator()
    {
        return separator;
    }

    public void setSeparator(String separator)
    {
        this.separator = separator;

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
    public Integer getRank()
    {
        return rank;
    }

    public void setRank(Integer rank)
    {
        this.rank = rank;

    }
}
