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
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayString;

import com.googlecode.gwt.charts.client.util.ArrayHelper;

/**
 * An object that specifies a mapping between color column values and colors or a gradient scale.
 */
public class ColorAxis extends JavaScriptObject {
	public static ColorAxis create() {
		return createObject().cast();
	}

	protected ColorAxis() {
	}

	public final void setColors(String... colors) {
		setColors(ArrayHelper.createArray(colors));
	}

	public final native void setLegend(ColorAxisLegend legend) /*-{
		this.legend = legend;
	}-*/;

	public final native void setMaxValue(double maxValue) /*-{
		this.maxValue = maxValue;
	}-*/;

	public final native void setMinValue(double minValue) /*-{
		this.minValue = minValue;
	}-*/;

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
