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
 * Where to place the chart title, compared to the chart area.
 */
public enum LegendPosition {
	/**
	 * To the right of the chart. Incompatible with the vAxes option.
	 */
	RIGHT("right"),
	/**
	 * Above the chart.
	 */
	TOP("top"),
	/**
	 * Below the chart.
	 */
	BOTTOM("bottom"),
	/**
	 * Inside the chart, by the top left corner.
	 */
	IN("in"),
	/**
	 * No legend is displayed.
	 */
	NONE("none");

	/**
	 * Get a TitlePosition by providing its name.
	 * 
	 * @param name the TitlePosition name.
	 * @return a TitlePosition corresponding to the provided name.
	 */
	public static LegendPosition findByName(String name) {
		for (LegendPosition titlePosition : LegendPosition.values()) {
			if (titlePosition.getName().equals(name)) {
				return titlePosition;
			}
		}
		return null;
	}

	private final String name;

	private LegendPosition(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the TitlePosition.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
