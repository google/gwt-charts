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
package com.googlecode.gwt.charts.client.format;

import com.google.gwt.core.client.JavaScriptObject;

import com.googlecode.gwt.charts.client.options.BarFormatColor;

/**
 * Configuration options for {@link BarFormat}.
 */
public class BarFormatOptions extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static BarFormatOptions create() {
		return createObject().cast();
	}

	protected BarFormatOptions() {
	}

	/**
	 * A number that is the base value to compare the cell value against. If the cell value is higher, it will be drawn
	 * to the right of the base; if lower, it will be drawn to the left. Default value is 0.
	 * 
	 * @param base
	 */
	public final native void setBase(double base) /*-{
		this.base = base;
	}-*/;

	/**
	 * A string indicating the negative value section of bars. Possible values are 'red', 'green' and 'blue'; default
	 * value is 'red'.
	 * 
	 * @param colorNegative
	 */
	public final void setColorNegative(BarFormatColor colorNegative) {
		setColorNegative(colorNegative.getName());
	}

	/**
	 * A string indicating the color of the positive value section of bars. Possible values are 'red', 'green' and
	 * 'blue'. Default is 'blue'.
	 * 
	 * @param colorPositive
	 */
	public final void setColorPositive(BarFormatColor colorPositive) {
		setColorPositive(colorPositive.getName());
	}

	/**
	 * A boolean indicating if to draw a 1 pixel dark base line when negative values are present. The dark line is there
	 * to enhance visual scanning of the bars. Default value is 'false'.
	 * 
	 * @param drawZeroLine
	 */
	public final native void setDrawZeroLine(boolean drawZeroLine) /*-{
		this.drawZeroLine = drawZeroLine;
	}-*/;

	/**
	 * The maximum number value for the bar range. Default value is the highest value in the table.
	 * 
	 * @param max
	 */
	public final native void setMax(double max) /*-{
		this.max = max;
	}-*/;

	/**
	 * The minimum number value for the bar range. Default value is the lowest value in the table.
	 * 
	 * @param min
	 */
	public final native void setMin(double min) /*-{
		this.min = min;
	}-*/;

	/**
	 * If true, shows values and bars; if false, shows only bars. Default value is true.
	 * 
	 * @param showValue
	 */
	public final native void setShowValue(boolean showValue) /*-{
		this.showValue = showValue;
	}-*/;

	/**
	 * Thickness of each bar, in pixels. Default value is 100.
	 * 
	 * @param width
	 */
	public final native void setWidth(int width) /*-{
		this.width = width;
	}-*/;

	private final native void setColorNegative(String colorNegative) /*-{
		this.colorNegative = colorNegative;
	}-*/;

	private final native void setColorPositive(String colorPositive) /*-{
		this.colorPositive = colorPositive;
	}-*/;
}
