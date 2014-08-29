/*
 * Copyright 2012 Rui Afonso
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.googlecode.gwt.charts.client.options;

/**
 * Whether the control should match exact values only, prefixes starting from the beginning of the value or any substring.
 */
public enum MatchType {
	/**
	 * Match exact values only.
	 */
	EXACT("exact"),
	/**
	 * Match prefixes starting from the beginning of the value.
	 */
	PREFIX("prefix"),
	/**
	 * Match any substring.
	 */
	ANY("any");

	/**
	 * Get a MatchType by providing its name.
	 * 
	 * @param name the MatchType name.
	 * @return a MatchType corresponding to the provided name.
	 */
	public static MatchType findByName(String name) {
		for (MatchType matchType : MatchType.values()) {
			if (matchType.getName().equals(name)) {
				return matchType;
			}
		}
		return null;
	}

	private final String name;

	private MatchType(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the MatchType.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
