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
package com.googlecode.gwt.charts.client.geochart;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayString;

import com.googlecode.gwt.charts.client.util.ArrayHelper;

/**
 * An object that specifies a mapping between color column values and colors or a gradient scale.
 */
public class GeoChartColorAxis extends JavaScriptObject {
	/**
	 * Default constructor
	 * 
	 * @return a new object
	 */
	public static GeoChartColorAxis create() {
		return createObject().cast();
	}

	protected GeoChartColorAxis() {
	}

	/**
	 * Colors to assign to values in the visualization.<br>
	 * You must have at least two values; the gradient will include all your values, plus calculated intermediary
	 * values, with the first color as the smallest value, and the last color as the highest.
	 * 
	 * @param colors
	 */
	public final void setColors(String... colors) {
		setColors(ArrayHelper.createArray(colors));
	}

	/**
	 * If present, specifies a maximum value for chart color data. Color data values of this value and higher will be
	 * rendered as the last color in the colorAxis.colors range.
	 * 
	 * @param maxValue
	 */
	public final native void setMaxValue(double maxValue) /*-{
		this.maxValue = maxValue;
	}-*/;

	/**
	 * If present, specifies a minimum value for chart color data. Color data values of this value and lower will be
	 * rendered as the first color in the colorAxis.colors range.
	 * 
	 * @param minValue
	 */
	public final native void setMinValue(double minValue) /*-{
		this.minValue = minValue;
	}-*/;

	/**
	 * If present, controls how values are associated with colors. Each value is associated with the corresponding color
	 * in the colorAxis.colors array. These values apply to the chart color data. Coloring is done according to a
	 * gradient of the values specified here. Not specifying a value for this option is equivalent to specifying
	 * [minValue, maxValue].
	 * 
	 * @param values
	 */
	public final void setValues(double... values) {
		setValues(ArrayHelper.createArray(values));
	}

	private final native void setColors(JsArrayString colors) /*-{
		this.colors = colors;
	}-*/;

	private final native void setValues(JsArrayNumber values) /*-{
		this.values = values;
	}-*/;

}
