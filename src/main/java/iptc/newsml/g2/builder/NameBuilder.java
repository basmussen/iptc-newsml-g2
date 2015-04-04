package iptc.newsml.g2.builder;

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
