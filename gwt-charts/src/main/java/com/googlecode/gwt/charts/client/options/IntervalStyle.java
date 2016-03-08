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
 * Interval style.
 */
public enum IntervalStyle {
	/**
	 * Line intervals are sometimes used to show the raw data from which a trendline was extracted.
	 */
	LINE("line"),
	/**
	 * Bar intervals create error bars around your data. The first and last columns of the interval are drawn as wide
	 * bars parallel to the domain-axis, and inner columns are drawn as shorter "ticks". A "stick" is added to join the
	 * wide bars (if these two bars have the same value then the stick is rendered as a point, unless the pointSize
	 * option is zero).
	 */
	BARS("bars"),
	/**
	 * Box intervals rendered columns in your data table as a set of nested rectangles: the first and last columns form
	 * the outermost rectangle, and inner columns render as darker rectangles within their containing box.
	 */
	BOXES("boxes"),
	/**
	 * Stick intervals display pairs of columns as a set of sticks parallel to the target axis. A stick of zero height
	 * is rendered as a point, which can be suppressed by setting the pointSize option to zero.
	 */
	STICKS("sticks"),
	/**
	 * Point intervals display interval data as small circles.
	 */
	POINTS("points"),
	/**
	 * An area interval renders interval data as a set of nested shaded areas. Nesting of pairs of columns is similar to
	 * that of box intervals, except that an even number of columns is required.
	 */
	AREA("area");

	/**
	 * Get an IntervalStyle by providing its name.
	 * 
	 * @param name the IntervalStyle name.
	 * @return an IntervalStyle corresponding to the provided name.
	 */
	public static IntervalStyle findByName(String name) {
		for (IntervalStyle intervalStyle : IntervalStyle.values()) {
			if (intervalStyle.getName().equals(name)) {
				return intervalStyle;
			}
		}
		return null;
	}

	private final String name;

	private IntervalStyle(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the IntervalStyle.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
