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
public enum TitlePosition {
	/**
	 * Draw the title inside the the chart area. 
	 */
	IN("in"),
	/**
	 * Draw the title outside the chart area. 
	 */
	OUT("out"),
	/**
	 * Omit the title.
	 */
	NONE("none");

	/**
	 * Get a TitlePosition by providing its name.
	 * 
	 * @param name the TitlePosition name.
	 * @return a TitlePosition corresponding to the provided name.
	 */
	public static TitlePosition findByName(String name) {
		for (TitlePosition titlePosition : TitlePosition.values()) {
			if (titlePosition.getName().equals(name)) {
				return titlePosition;
			}
		}
		return null;
	}

	private final String name;

	private TitlePosition(String name) {
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
