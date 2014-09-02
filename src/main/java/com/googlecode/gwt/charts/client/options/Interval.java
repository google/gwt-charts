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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Intervals might be used to portray confidence, minimum and maximum values
 * around a value, percentile sampling, or anything else that requires a varying margin around a series.
 */
public class Interval extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object
	 */
	public static Interval create() {
		return createObject().cast();
	}

	/**
	 * Constructor with a defined style.
	 * 
	 * @param style
	 * 
	 * @return a new object
	 */
	public static Interval create(IntervalStyle style) {
		Interval interval = createObject().cast();
		interval.setStyle(style);
		return interval;
	}

	protected Interval() {
	}

	/**
	 * Sets the interval bar width.
	 * 
	 * @param barWidth
	 */
	public final native void setBarWidth(double barWidth) /*-{
		this.barWidth = barWidth;
	}-*/;

	/**
	 * Sets the color.
	 * 
	 * @param color an HTML color string
	 */
	public final native void setColor(String color) /*-{
		this.color = color;
	}-*/;

	/**
	 * Controls the curve of the lines when the line width is not zero.
	 * 
	 * @param curveType the line curve type
	 */
	public final void setCurveType(CurveType curveType) {
		setCurveType(curveType.getName());
	}

	/**
	 * Sets the interval style.
	 * 
	 * @param style
	 */
	public final void setStyle(IntervalStyle style) {
		setStyle(style.getName());
	}

	/**
	 * Sets the fill opacity.
	 * 
	 * @param fillOpacity a value from 0.0 (fully transparent) to 1.0 (fully opaque)
	 */
	public final native void setFillOpacity(double fillOpacity) /*-{
		this.fillOpacity = fillOpacity;
	}-*/;

	/**
	 * Defines data line width in pixels. Use zero to hide all lines and show only the points.
	 * 
	 * @param lineWidth data line width in pixels
	 */
	public final native void setLineWidth(double lineWidth) /*-{
		this.lineWidth = lineWidth;
	}-*/;

	/**
	 * Sets diameter of displayed points in pixels. Use zero to hide all points.
	 * 
	 * @param size diameter of displayed points in pixels
	 */
	public final native void setPointSize(int size) /*-{
		this.pointSize = size;
	}-*/;

	private final native void setStyle(String style) /*-{
		this.style = style;
	}-*/;

	private final native void setCurveType(String curveType) /*-{
		this.curveType = curveType;
	}-*/;
}
