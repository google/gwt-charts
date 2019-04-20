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
 * Where to place the axis titles, compared to the chart area.
 */
public enum AxisTitlesPosition {
	/**
	 * Draw the axis titles inside the the chart area. 
	 */
	IN("in"),
	/**
	 * Draw the axis titles outside the chart area. 
	 */
	OUT("out"),
	/**
	 * Omit the axis titles.
	 */
	NONE("none");

	/**
	 * Get an AxisTitlesPosition by providing its name.
	 * 
	 * @param name the AxisTitlesPosition name.
	 * @return an AxisTitlesPosition corresponding to the provided name.
	 */
	public static AxisTitlesPosition findByName(String name) {
		for (AxisTitlesPosition axisTitlesPosition : AxisTitlesPosition.values()) {
			if (axisTitlesPosition.getName().equals(name)) {
				return axisTitlesPosition;
			}
		}
		return null;
	}

	private final String name;

	private AxisTitlesPosition(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the AxisTitlesPosition.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
