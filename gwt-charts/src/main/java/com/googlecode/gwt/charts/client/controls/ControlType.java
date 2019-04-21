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
package com.googlecode.gwt.charts.client.controls;

/**
 * A definition of currently available control types.
 */
public enum ControlType {
	/**
	 * A picker to choose one or more between a set of defined values.
	 */
	CATEGORY_FILTER("CategoryFilter"),
	/**
	 * A slider with two thumbs superimposed onto a chart, to select a range of values from the continuous axis of the
	 * chart.
	 */
	CHART_RANGE_FILTER("ChartRangeFilter"),
	/**
	 * A dual-valued slider for selecting ranges of dates.
	 */
	DATE_RANGE_FILTER("DateRangeFilter"),
	/**
	 * A slider with two thumbs to select ranges of numeric values.
	 */
	NUMBER_RANGE_FILTER("NumberRangeFilter"),
	/**
	 * A simple text input field that lets you filter data via string matching.
	 */
	STRING_FILTER("StringFilter");

	/**
	 * Get a ChartType by providing its name.
	 * 
	 * @param name the ChartType name.
	 * @return a ChartType corresponding to the provided name.
	 */
	public static ControlType findByName(String name) {
		for (ControlType controlType : ControlType.values()) {
			if (controlType.getName().equals(name)) {
				return controlType;
			}
		}
		return null;
	}

	private final String name;

	private ControlType(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the ChartType.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
