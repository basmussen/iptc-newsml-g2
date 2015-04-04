package iptc.newsml.g2.builder;

import iptc.newsml.g2.model.Headline;

/**
 * Headline Model Builder
 * 
 * @see <a
 *      href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/Headline.html">Headline</a>
 * @see Headline
 */
public class HeadlineBuilder
{

    private String role;
    private String roleUri;
    private String media;
    private String value;
    private Integer rank;

    /**
     * Static factory method for Headline
     */
    public static HeadlineBuilder headline()
    {
        return new HeadlineBuilder();
    }

    public HeadlineBuilder()
    {
    }

    public HeadlineBuilder role(String val)
    {
        this.role = val;
        return this;
    }

    public HeadlineBuilder roleUri(String val)
    {
        this.roleUri = val;
        return this;
    }

    public HeadlineBuilder media(String val)
    {
        this.media = val;
        return this;
    }

    public HeadlineBuilder value(String val)
    {
        this.value = val;
        return this;
    }

    public HeadlineBuilder rank(Integer val)
    {
        this.rank = val;
        return this;
    }

    public String getRole()
    {
        return role;
    }

    public String getRoleUri()
    {
        return roleUri;
    }

    public String getMedia()
    {
        return media;
    }

    public String getValue()
    {
        return value;
    }

    public Integer getRank()
    {
        return rank;
    }

    /**
     * @return new Headline instance
     */
    public Headline build()
    {
        Headline obj = new Headline();

        obj.setRole(role);
        obj.setRoleUri(roleUri);
        obj.setMedia(media);
        obj.setValue(value);
        obj.setRank(rank);

        return obj;
    }
}
