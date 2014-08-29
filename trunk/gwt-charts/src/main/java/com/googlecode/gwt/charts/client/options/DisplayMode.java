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
 * Defines types of maps for GeoChart. The DataTable format must match the value specified.
 */
public enum DisplayMode {
	/**
	 * Choose based on the format of the DataTable.
	 */
	AUTO("auto"),
	/**
	 * This is a region map.
	 */
	REGIONS("regions"),
	/**
	 * This is a marker map.
	 */
	MARKERS("markers");

	/**
	 * Get a DisplayMode by providing its name.
	 * 
	 * @param name the DisplayMode name.
	 * @return a DisplayMode corresponding to the provided name.
	 */
	public static DisplayMode findByName(String name) {
		for (DisplayMode displayMode : DisplayMode.values()) {
			if (displayMode.getName().equals(name)) {
				return displayMode;
			}
		}
		return null;
	}

	private final String name;

	private DisplayMode(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the DisplayMode.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
