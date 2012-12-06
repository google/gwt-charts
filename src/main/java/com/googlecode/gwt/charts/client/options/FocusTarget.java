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
 * The type of the entity that receives focus on mouse hover. Also affects which entity is selected by mouse click, and
 * which data table element is associated with events.
 */
public enum FocusTarget {
	/**
	 * Focus on a single data point. Correlates to a cell in the data table. 
	 */
	DATUM("datum"),
	/**
	 * Focus on a grouping of all data points along the major axis. Correlates to a row in the data table.
	 * The tooltip displays all the category values. This may be useful for comparing values of different series.
	 */
	CATEGORY("category");

	/**
	 * Get a FocusTarget by providing its name.
	 * 
	 * @param name the FocusTarget name.
	 * @return a FocusTarget corresponding to the provided name.
	 */
	public static FocusTarget findByName(String name) {
		for (FocusTarget focusTarget : FocusTarget.values()) {
			if (focusTarget.getName().equals(name)) {
				return focusTarget;
			}
		}
		return null;
	}

	private final String name;

	private FocusTarget(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the FocusTarget.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
