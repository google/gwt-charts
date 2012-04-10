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
 * A quick formatting option for the date.
 */
public enum FormatType {
	/**
	 * Short format: e.g., "2/28/08"
	 */
	SHORT("short"),
	/**
	 * Medium format: e.g., "Feb 28, 2008"
	 */
	MEDIUM("medium"),
	/**
	 * Long format: e.g., "February 28, 2008"
	 */
	LONG("long");

	/**
	 * Get a ChartPackage by providing its name.
	 * 
	 * @param name the ChartPackage name.
	 * @return a ChartPackage corresponding to the provided name.
	 */
	public static FormatType findByName(String name) {
		for (FormatType formatType : FormatType.values()) {
			if (formatType.getName().equals(name)) {
				return formatType;
			}
		}
		return null;
	}

	private final String name;

	private FormatType(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the ChartPackage.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
