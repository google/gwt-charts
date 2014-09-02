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
 * Represents a gradient for use inside a {@link BoxStyle}.
 */
public class Gradient extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object
	 */
	public static Gradient create() {
		return createObject().cast();
	}

	protected Gradient() {
	}

	/**
	 * Sets the start color for gradient.
	 * 
	 * @param color1 an HTML color string
	 */
	public final native void setColor1(String color1) /*-{
		this.color1 = color1;
	}-*/;

	/**
	 * Sets the finish color for gradient.
	 * 
	 * @param color2 an HTML color string
	 */
	public final native void setColor2(String color2) /*-{
		this.color2 = color2;
	}-*/;

	/**
	 * If true, the boundary for x1, y1, x2, and y2 is the box.<br>
	 * If false, it's the entire chart.
	 * 
	 * @param useObjectBoundingBoxUnits
	 */
	public final native void setUseObjectBoundingBoxUnits(boolean useObjectBoundingBoxUnits) /*-{
		this.useObjectBoundingBoxUnits = useObjectBoundingBoxUnits;
	}-*/;

	/**
	 * Where on the boundary to start and end the color1/color2 gradient.<br>
	 * This is upper left corner.
	 * 
	 * @param x1 value in percent
	 */
	public final native void setX1(String x1) /*-{
		this.x1 = x1;
	}-*/;

	/**
	 * Where on the boundary to start and end the color1/color2 gradient.<br>
	 * This is upper right corner.
	 * 
	 * @param x2 value in percent
	 */
	public final native void setX2(String x2) /*-{
		this.x2 = x2;
	}-*/;

	/**
	 * Where on the boundary to start and end the color1/color2 gradient.<br>
	 * This is lower left corner.
	 * 
	 * @param y1 value in percent
	 */
	public final native void setY1(String y1) /*-{
		this.y1 = y1;
	}-*/;

	/**
	 * Where on the boundary to start and end the color1/color2 gradient.<br>
	 * This is lower right corner.
	 * 
	 * @param y2 value in percent
	 */
	public final native void setY2(String y2) /*-{
		this.y2 = y2;
	}-*/;
}
