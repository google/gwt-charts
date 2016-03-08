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
 * An object with members to configure various aspects of the legend.
 */
public class ColorAxisLegend extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object
	 */
	public static ColorAxisLegend create() {
		return createObject().cast();
	}

	protected ColorAxisLegend() {
	}

	/**
	 * A format string for numeric labels. This is a subset of the ICU pattern set. For instance, {numberFormat:'.##'}
	 * will display values "10.66", "10.6", and "10.0" for values 10.666, 10.6, and 10.
	 * 
	 * @param numberFormat
	 */
	public final native void setNumberFormat(String numberFormat) /*-{
		this.numberFormat = numberFormat;
	}-*/;

	/**
	 * Sets the position of the legend.
	 * 
	 * @param position default is RIGHT
	 */
	public final void setPosition(LegendPosition position) {
		setPosition(position.getName());
	}

	/**
	 * Specifies the legend text style.
	 * 
	 * @param textStyle
	 */
	public final native void setTextStyle(TextStyle textStyle) /*-{
		this.textStyle = textStyle;
	}-*/;

	private final native void setPosition(String position) /*-{
		this.position = position;
	}-*/;
}
