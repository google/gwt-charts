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
public enum ColoredLegendPosition {
	/**
	 * Put the colored legend on the same row with the zoom buttons and the date.
	 */
	SAMEROW("sameRow"),
	/**
	 * Put the colored legend on a new row with the zoom buttons and the date.
	 */
	NEWROW("newRow");

	/**
	 * Get a ColoredLegendPosition by providing its name.
	 * 
	 * @param name the ColoredLegendPosition name.
	 * @return a ColoredLegendPosition corresponding to the provided name.
	 */
	public static ColoredLegendPosition findByName(String name) {
		for (ColoredLegendPosition coloredLegendPosition : ColoredLegendPosition.values()) {
			if (coloredLegendPosition.getName().equals(name)) {
				return coloredLegendPosition;
			}
		}
		return null;
	}

	private final String name;

	private ColoredLegendPosition(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the ColoredLegendPosition.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
