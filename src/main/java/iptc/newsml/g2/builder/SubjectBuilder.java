package iptc.newsml.g2.builder;

import iptc.newsml.g2.model.Subject;
import java.util.HashSet;
import java.util.Set;

/**
 * Subject Model Builder
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/Subject.html">Subject</a>
 * @see Subject
 */
public class SubjectBuilder
{

    private String type;
    private String qcode;
    private Set<NameBuilder> names = new HashSet<NameBuilder>();
    private Set<RelationBuilder> broader = new HashSet<RelationBuilder>();
    private Set<RelationBuilder> narrower = new HashSet<RelationBuilder>();
    private Set<RelationBuilder> sameAs = new HashSet<RelationBuilder>();
    private Set<RelationBuilder> related = new HashSet<RelationBuilder>();

    /**
     * Static factory method for Subject
     */
    public static SubjectBuilder subject()
    {
        return new SubjectBuilder();
    }

    public SubjectBuilder()
    {
    }

    public SubjectBuilder type(String val)
    {
        this.type = val;
        return this;
    }

    public SubjectBuilder qcode(String val)
    {
        this.qcode = val;
        return this;
    }

    public SubjectBuilder names(Set<NameBuilder> val)
    {
        this.names = val;
        return this;
    }

    public SubjectBuilder broader(Set<RelationBuilder> val)
    {
        this.broader = val;
        return this;
    }

    public SubjectBuilder narrower(Set<RelationBuilder> val)
    {
        this.narrower = val;
        return this;
    }

    public SubjectBuilder sameAs(Set<RelationBuilder> val)
    {
        this.sameAs = val;
        return this;
    }

    public SubjectBuilder related(Set<RelationBuilder> val)
    {
        this.related = val;
        return this;
    }

    public SubjectBuilder addName(NameBuilder val)
    {
        this.getNames().add(val);
        return this;
    }

    public SubjectBuilder addBroader(RelationBuilder val)
    {
        this.getBroader().add(val);
        return this;
    }

    public SubjectBuilder addNarrower(RelationBuilder val)
    {
        this.getNarrower().add(val);
        return this;
    }

    public SubjectBuilder addSameAs(RelationBuilder val)
    {
        this.getSameAs().add(val);
        return this;
    }

    public SubjectBuilder addRelated(RelationBuilder val)
    {
        this.getRelated().add(val);
        return this;
    }

    public String getType()
    {
        return type;
    }

    public String getQcode()
    {
        return qcode;
    }

    public Set<NameBuilder> getNames()
    {
        return names;
    }

    public Set<RelationBuilder> getBroader()
    {
        return broader;
    }

    public Set<RelationBuilder> getNarrower()
    {
        return narrower;
    }

    public Set<RelationBuilder> getSameAs()
    {
        return sameAs;
    }

    public Set<RelationBuilder> getRelated()
    {
        return related;
    }

    /**
     * @return new Subject instance
     */
    public Subject build()
    {
        Subject obj = new Subject();

        obj.setType(type);
        obj.setQcode(qcode);
        if (names != null)
        {
            for (NameBuilder item : names)
            {
                obj.getName().add(item.build());
            }
        }
        if (broader != null)
        {
            for (RelationBuilder item : broader)
            {
                obj.getBroader().add(item.build());
            }
        }
        if (narrower != null)
        {
            for (RelationBuilder item : narrower)
            {
                obj.getNarrower().add(item.build());
            }
        }
        if (sameAs != null)
        {
            for (RelationBuilder item : sameAs)
            {
                obj.getSameAs().add(item.build());
            }
        }
        if (related != null)
        {
            for (RelationBuilder item : related)
            {
                obj.getRelated().add(item.build());
            }
        }

        return obj;
    }
}
