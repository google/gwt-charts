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
 * Controls the curve of the lines when the line width is not zero.
 */
public enum CurveType {
	/**
	 * Straight lines without curve.
	 */
	NONE("none"),
	/**
	 * The angles of the line will be smoothed.
	 */
	FUNCTION("function");

	/**
	 * Get a ChartType by providing its name.
	 * 
	 * @param name the ChartType name.
	 * @return a ChartType corresponding to the provided name.
	 */
	public static CurveType findByName(String name) {
		for (CurveType curveType : CurveType.values()) {
			if (curveType.getName().equals(name)) {
				return curveType;
			}
		}
		return null;
	}

	private final String name;

	private CurveType(String name) {
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
