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
 * Alignment of the legend.
 */
public enum LegendAlignment {
	/**
	 * Aligned to the start of the area allocated for the legend.
	 */
	START("start"),
	/**
	 * Centered in the area allocated for the legend.
	 */
	CENTER("center"),
	/**
	 * Aligned to the end of the area allocated for the legend.
	 */
	END("end");

	/**
	 * Get a TitlePosition by providing its name.
	 * 
	 * @param name the TitlePosition name.
	 * @return a TitlePosition corresponding to the provided name.
	 */
	public static LegendAlignment findByName(String name) {
		for (LegendAlignment legendAlignment : LegendAlignment.values()) {
			if (legendAlignment.getName().equals(name)) {
				return legendAlignment;
			}
		}
		return null;
	}

	private final String name;

	private LegendAlignment(String name) {
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
