package iptc.newsml.g2.builder;

import iptc.newsml.g2.model.Broader;
import iptc.newsml.g2.model.Narrower;
import iptc.newsml.g2.model.Related;
import iptc.newsml.g2.model.Relation;
import iptc.newsml.g2.model.SameAs;

/**
 * Relation Model Builder
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/Relation.html">Relation</a>
 * @see Relation
 */
public class RelationBuilder
{

    private QcodeBuilder qcode;

    private Relation obj;

    /**
     * Static factory method for Broader
     */
    public static RelationBuilder broader()
    {
        return new RelationBuilder(new Broader());
    }

    /**
     * Static factory method for Broader
     */
    public static RelationBuilder narrower()
    {
        return new RelationBuilder(new Narrower());
    }

    /**
     * Static factory method for SameAs
     */
    public static RelationBuilder sameAs()
    {
        return new RelationBuilder(new SameAs());
    }

    /**
     * Static factory method for SameAs
     */
    public static RelationBuilder related()
    {
        return new RelationBuilder(new Related());
    }

    public RelationBuilder(Relation obj)
    {
        this.obj = obj;
    }

    public RelationBuilder qcode(String val)
    {
        this.qcode = QcodeBuilder.qcode().qcode(val);
        return this;
    }

    public RelationBuilder qcode(QcodeBuilder val)
    {
        this.qcode = val;
        return this;
    }

    public QcodeBuilder getQcode()
    {
        return qcode;
    }

    /**
     * @return new Relation instance
     */
    public Relation build()
    {
        if (qcode != null)
        {
            obj.setQcode(qcode.build());
        }

        return obj;
    }
}
