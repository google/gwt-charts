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
package com.googlecode.gwt.charts.client.orgchart;

/**
 * Determines the size of an orgchart.
 */
public enum OrgChartSize {
	/**
	 * Small size.
	 */
	SMALL("small"),
	/**
	 * Medium size.
	 */
	MEDIUM("medium"),
	/**
	 * Large size.
	 */
	LARGE("large");

	/**
	 * Get a OrgChartSize by providing its name.
	 * 
	 * @param name the OrgChartSize name.
	 * @return a OrgChartSize corresponding to the provided name.
	 */
	public static OrgChartSize findByName(String name) {
		for (OrgChartSize orgChartSize : OrgChartSize.values()) {
			if (orgChartSize.getName().equals(name)) {
				return orgChartSize;
			}
		}
		return null;
	}

	private final String name;

	private OrgChartSize(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the OrgChartSize.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
