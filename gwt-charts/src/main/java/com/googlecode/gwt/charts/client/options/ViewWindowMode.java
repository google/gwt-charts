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
 * Specifies how to scale the horizontal axis to render the values within the chart area.
 */
public enum ViewWindowMode {
	/**
	 * Scale the horizontal values so that the maximum and minimum data values are rendered a bit inside the left and right of the chart area.
	 */
	PRETTY("pretty"),
	/**
	 * Scale the horizontal values so that the maximum and minimum data values touch the left and right of the chart area.
	 */
	MAXIMIZED("value"),
	/**
	 * Specify the left and right scale values of the chart area. Data values outside these values will be cropped. You must specify an hAxis.viewWindow object describing the maximum and minimum values to show.
	 */
	EXPLICIT("explicit");
	
	/**
	 * Get a ViewWindowMode by providing its name.
	 * 
	 * @param name the ViewWindowMode name.
	 * @return a TooltipText corresponding to the provided name.
	 */
	public static ViewWindowMode findByName(String name) {
		for (ViewWindowMode viewWindowMode : ViewWindowMode.values()) {
			if (viewWindowMode.getName().equals(name)) {
				return viewWindowMode;
			}
		}
		return null;
	}

	private final String name;

	private ViewWindowMode(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the ViewWindowMode.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
