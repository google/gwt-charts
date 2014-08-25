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

import com.googlecode.gwt.charts.client.annotationchart.AnnotationChartOptions;

/**
 * The type of scale (maximum and minimum values shown on the Y axis).
 */
public enum ScaleType {
	/**
	 * The Y axis will span the minimum to the maximum values of the series.<br>
	 * If you have more than one series, use ALLMAXIMIZED.
	 */
	MAXIMIZED("maximized"),
	/**
	 * The Y axis varies, depending on the data values values:
	 * <ul>
	 * <li>If all values are >=0, the Y axis will span from zero to the maximum data value.</li>
	 * <li>If all values are <=0, the Y axis will span from zero to the minimum data value.</li>
	 * <li>If values are both positive and negative, the Y axis will range from the series maximum to the series
	 * minimum.</li>
	 * </ul>
	 * For multiple series, use ALLFIXED.
	 */
	FIXED("fixed"),
	/**
	 * Same as MAXIMIZED, but used when multiple scales are displayed. Both charts will be maximized within the same
	 * scale, which means that one will be misrepresented against the Y axis, but hovering over each series will display
	 * its true value.
	 */
	ALLMAXIMIZED("allmaximized"),
	/**
	 * Same as FIXED, but used when multiple scales are displayed. This setting adjusts each scale to the series to
	 * which it applies (use this in conjunction with {@link SankeyOptions#setScaleColumns(int...) }).
	 */
	ALLFIXED("allfixed");

	/**
	 * Get a ScaleType by providing its name.
	 * 
	 * @param name the ScaleType name.
	 * @return a ScaleType corresponding to the provided name.
	 */
	public static ScaleType findByName(String name) {
		for (ScaleType scaleType : ScaleType.values()) {
			if (scaleType.getName().equals(name)) {
				return scaleType;
			}
		}
		return null;
	}

	private final String name;

	private ScaleType(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the ScaleType.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
