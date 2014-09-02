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
 * A list of valid colors for BarFormat.
 */
public enum BarFormatColor {
	/**
	 * Red color.
	 */
	RED("red"),
	/**
	 * Green color.
	 */
	GREEN("green"),
	/**
	 * Blue color.
	 */
	BLUE("blue");

	/**
	 * Get a BarFormatColor by providing its name.
	 * 
	 * @param name the BarFormatColor name.
	 * @return a BarFormatColor corresponding to the provided name.
	 */
	public static BarFormatColor findByName(String name) {
		for (BarFormatColor barFormatColor : BarFormatColor.values()) {
			if (barFormatColor.getName().equals(name)) {
				return barFormatColor;
			}
		}
		return null;
	}

	private final String name;

	private BarFormatColor(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the BarFormatColor.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
