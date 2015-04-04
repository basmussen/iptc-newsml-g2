package iptc.newsml.g2.model;

import java.io.Serializable;
import java.lang.Cloneable;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Name Model Object
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/Name.html">Name</a>
 */
public class Name implements Serializable, Cloneable
{
    private static final long serialVersionUID = 1L;

    private String role;

    private String lang;

    @NotNull
    private String value;

    public Name()
    {
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
    private String getLang()
    {
        return lang;
    }

    public void setLang(String lang)
    {
        this.lang = lang;
    }

    @XmlElement()
    private String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }
}
