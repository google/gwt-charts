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
 * The type of trendline.
 */
public enum TrendlineType {
	/**
	 * A linear trendline.
	 */
	LINEAR("linear"),
	/**
	 * An exponential trendline.
	 */
	EXPONENTIAL("exponential"),
	/**
	 * A polynomial trendline.
	 */
	POLYNOMIAL("polynomial");

	/**
	 * Get a TrendlineType by providing its name.
	 * 
	 * @param name the TrendlineType name.
	 * @return a TrendlineType corresponding to the provided name.
	 */
	public static TrendlineType findByName(String name) {
		for (TrendlineType trendlineType : TrendlineType.values()) {
			if (trendlineType.getName().equals(name)) {
				return trendlineType;
			}
		}
		return null;
	}

	private final String name;

	private TrendlineType(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the TrendlineType.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
