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
 * A set of background color options.
 */
public class BackgroundColor extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static BackgroundColor create() {
		return createObject().cast();
	}

	/**
	 * Default constructor.
	 * 
	 * @param fill chart fill color, as an HTML color string
	 * @param stroke color of the chart border, as an HTML color string.
	 * @param strokeWidth border width, in pixels (default is 2).
	 * @return a new object instance
	 */
	public static BackgroundColor create(String fill, String stroke, int strokeWidth) {
		BackgroundColor backgroundColor = createObject().cast();
		backgroundColor.setStroke(stroke);
		return backgroundColor;
	}

	protected BackgroundColor() {
	}

	/**
	 * Sets the chart fill color.
	 * 
	 * @param fill an HTML color string
	 */
	public final native void setFill(String fill) /*-{
		this.fill = fill;
	}-*/;

	/**
	 * Sets the color of the chart border.
	 * 
	 * @param stroke an HTML color string.
	 */
	public final native void setStroke(String stroke) /*-{
		this.stroke = stroke;
	}-*/;

	/**
	 * Sets the border width.
	 * 
	 * @param strokeWidth value in pixels (default is 2)
	 */
	public final native void setStrokeWidth(int strokeWidth) /*-{
		this.strokeWidth = strokeWidth;
	}-*/;

}
