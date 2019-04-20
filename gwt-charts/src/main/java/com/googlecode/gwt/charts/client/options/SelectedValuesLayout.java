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
 * How to display selected values, when multiple selection is allowed.
 */
public enum SelectedValuesLayout {
	/**
	 * Selected values will display in a single text line next to the value picker widget.
	 */
	ASIDE("aside"),
	/**
	 * Selected values will display in a single text line below the widget.
	 */
	BELOW("below"),
	/**
	 * Similar to below, but entries that cannot fit in the picker will wrap to a new line.
	 */
	BELOW_WRAPPING("belowWrapping"),
	/**
	 * Selected values will be displayed in a column below the widget.
	 */
	BELOW_STACKED("belowStacked");

	/**
	 * Get a SelectedValuesLayout by providing its name.
	 * 
	 * @param name the SelectedValuesLayout name.
	 * @return a SelectedValuesLayout corresponding to the provided name.
	 */
	public static SelectedValuesLayout findByName(String name) {
		for (SelectedValuesLayout selectedValuesLayout : SelectedValuesLayout.values()) {
			if (selectedValuesLayout.getName().equals(name)) {
				return selectedValuesLayout;
			}
		}
		return null;
	}

	private final String name;

	private SelectedValuesLayout(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the SelectedValuesLayout.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
