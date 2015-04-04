package iptc.newsml.g2.model;

import iptc.common.validation.QcodeValidation;

import java.io.Serializable;
import java.lang.Cloneable;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Subject Model Object
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/Subject.html">Subject</a>
 */
@XmlType(propOrder =
{ "name", "broader", "narrower", "sameAs", "related" })
public class Subject implements Serializable, Cloneable
{
    private static final long serialVersionUID = 1L;

    @QcodeValidation
    @NotNull
    private String type;

    @QcodeValidation
    @NotNull
    private String qcode;

    @NotNull
    private Set<Name> name = new HashSet<Name>();

    @NotNull
    private Set<Relation> broader = new HashSet<Relation>();

    @NotNull
    private Set<Relation> narrower = new HashSet<Relation>();

    @NotNull
    private Set<Relation> sameAs = new HashSet<Relation>();

    @NotNull
    private Set<Relation> related = new HashSet<Relation>();

    public Subject()
    {
    }

    @XmlAttribute()
    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;

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

    @XmlElement()
    public Set<Name> getName()
    {
        return name;
    }

    public void setName(Set<Name> name)
    {
        this.name = name;

    }

    @XmlElement()
    public Set<Relation> getBroader()
    {
        return broader;
    }

    public void setBroader(Set<Relation> broader)
    {
        this.broader = broader;

    }

    @XmlElement()
    public Set<Relation> getNarrower()
    {
        return narrower;
    }

    public void setNarrower(Set<Relation> narrower)
    {
        this.narrower = narrower;

    }

    @XmlElement()
    public Set<Relation> getSameAs()
    {
        return sameAs;
    }

    public void setSameAs(Set<Relation> sameAs)
    {
        this.sameAs = sameAs;

    }

    @XmlElement()
    public Set<Relation> getRelated()
    {
        return related;
    }

    public void setRelated(Set<Relation> related)
    {
        this.related = related;

    }
}
