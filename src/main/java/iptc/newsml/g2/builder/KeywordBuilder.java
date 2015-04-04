package iptc.newsml.g2.builder;

/*
 * #%L
 * IPTC NewsML G2 Model
 * %%
 * Copyright (C) 2015 Ben Asmussen <opensource@ben-asmussen.com>
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import iptc.newsml.g2.model.Keyword;

/**
 * Keyword Model Builder
 * 
 * @see <a href="http://www.iptc.org/std/NewsML-G2/2.19/specification/XML-Schema-Doc-Power/Keyword.html">Keyword</a>
 * @see Keyword
 */
public class KeywordBuilder {

	private String keyword;
	private Integer rank;

	/**
	 * Static factory method for Keyword
	 */
	public static KeywordBuilder keyword() {
		return new KeywordBuilder();
	}

	public KeywordBuilder() {
	}

	public KeywordBuilder keyword(String val) {
		this.keyword = val;
		return this;
	}

	public KeywordBuilder rank(Integer val) {
		this.rank = val;
		return this;
	}

	public String getKeyword() {
		return keyword;
	}

	public Integer getRank() {
		return rank;
	}

	/**
	 * @return new Keyword instance
	 */
	public Keyword build() {
		Keyword obj = new Keyword();

		obj.setKeyword(keyword);
		obj.setRank(rank);

		return obj;
	}
}
