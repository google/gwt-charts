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

public class GeoChartColorAxis extends JavaScriptObject {
	public static GeoChartColorAxis create() {
		return createObject().cast();
	}

	protected GeoChartColorAxis() {
	}

	public final native void setColors(JsArrayString colors) /*-{
		this.colors = colors;
	}-*/;

	public final native void setMaxValue(double maxValue) /*-{
		this.maxValue = maxValue;
	}-*/;

	public final native void setMinValue(double minValue) /*-{
		this.minValue = minValue;
	}-*/;

	public final native void setValues(JsArrayNumber values) /*-{
		this.values = values;
	}-*/;

}
