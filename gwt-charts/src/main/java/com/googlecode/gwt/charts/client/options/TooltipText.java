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
 * What information to display when the user hovers over a pie slice.
 */
public enum TooltipText {
	/**
	 * Display only the percentage of the whole represented by the slice.
	 */
	PERCENTAGE("percentage"),
	/**
	 * Display only the absolute value of the slice.
	 */
	VALUE("value"),
	/**
	 * Display both the absolute value of the slice and the percentage of the whole.
	 */
	BOTH("both");
	
	/**
	 * Get a TooltipText by providing its name.
	 * 
	 * @param name the TooltipText name.
	 * @return a TooltipText corresponding to the provided name.
	 */
	public static TooltipText findByName(String name) {
		for (TooltipText tooltipText : TooltipText.values()) {
			if (tooltipText.getName().equals(name)) {
				return tooltipText;
			}
		}
		return null;
	}

	private final String name;

	private TooltipText(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the TooltipText.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
