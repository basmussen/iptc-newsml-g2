package iptc.newsml.g2.builder;

import iptc.newsml.g2.model.Slugline;

/**
 * Slugline Model Builder
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/Slugline.html">Slugline</a>
 * @see Slugline
 */
public class SluglineBuilder
{

    private String value;
    private String separator;
    private String role;
    private String roleUri;
    private Integer rank;

    /**
     * Static factory method for Slugline
     */
    public static SluglineBuilder slugline()
    {
        return new SluglineBuilder();
    }

    public SluglineBuilder()
    {
    }

    public SluglineBuilder value(String val)
    {
        this.value = val;
        return this;
    }

    public SluglineBuilder separator(String val)
    {
        this.separator = val;
        return this;
    }

    public SluglineBuilder role(String val)
    {
        this.role = val;
        return this;
    }

    public SluglineBuilder roleUri(String val)
    {
        this.roleUri = val;
        return this;
    }

    public SluglineBuilder rank(Integer val)
    {
        this.rank = val;
        return this;
    }

    public String getValue()
    {
        return value;
    }

    public String getSeparator()
    {
        return separator;
    }

    public String getRole()
    {
        return role;
    }

    public String getRoleUri()
    {
        return roleUri;
    }

    public Integer getRank()
    {
        return rank;
    }

    /**
     * @return new Slugline instance
     */
    public Slugline build()
    {
        Slugline obj = new Slugline();

        obj.setValue(value);
        obj.setSeparator(separator);
        obj.setRole(role);
        obj.setRoleUri(roleUri);
        obj.setRank(rank);

        return obj;
    }
}
