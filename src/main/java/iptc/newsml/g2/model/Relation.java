package iptc.newsml.g2.model;

import java.io.Serializable;
import java.lang.Cloneable;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;

/**
 * Relation Model Object
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/Relation.html">Relation</a>
 */
public abstract class Relation implements Serializable, Cloneable
{
    private static final long serialVersionUID = 1L;

    @NotNull
    private Qcode qcode;

    public Relation()
    {
    }

    @XmlElement()
    public Qcode getQcode()
    {
        return qcode;
    }

    public void setQcode(Qcode qcode)
    {
        this.qcode = qcode;

    }
}
