package iptc.newsml.g2.builder;

import iptc.newsml.g2.model.Label1;

/**
 * Label1 Model Builder
 * 
 * @see <a href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/Label1.html">Label1</a>
 * @see Label1
 */
public class Label1Builder {

	private String role;
	private String roleUri;
	private String media;

	/**
	 * Static factory method for Label1
	 */
	public static Label1Builder label1() {
		return new Label1Builder();
	}

	public Label1Builder() {
	}

	public Label1Builder role(String val) {
		this.role = val;
		return this;
	}

	public Label1Builder roleUri(String val) {
		this.roleUri = val;
		return this;
	}

	public Label1Builder media(String val) {
		this.media = val;
		return this;
	}

	public String getRole() {
		return role;
	}

	public String getRoleUri() {
		return roleUri;
	}

	public String getMedia() {
		return media;
	}

	/**
	 * @return new Label1 instance
	 */
	public Label1 build() {
		Label1 obj = new Label1();

		obj.setRole(role);
		obj.setRoleUri(roleUri);
		obj.setMedia(media);

		return obj;
	}
}
