package iptc.newsml.g2.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Headline Model Object
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/Headline.html">Headline</a>
 */

public class Headline extends Label1
{
    private static final long serialVersionUID = 1L;

    @NotNull
    private Integer rank;

    private String value;

    public Headline()
    {
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

    // FIXME blocked by: @XmlValue is not allowed on a class that derives
    // another class.
    // @XmlValue()
    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

}
