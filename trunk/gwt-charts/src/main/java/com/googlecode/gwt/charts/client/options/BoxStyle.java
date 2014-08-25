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
 * Controls the appearance of the boxes surrounding annotations
 */
public class BoxStyle extends JavaScriptObject {
	/**
	 * Default constructor
	 * 
	 * @return a new object
	 */
	public static BoxStyle create() {
		return createObject().cast();
	}

	protected BoxStyle() {
	}

	/**
	 * Sets attributes for linear gradient fill.
	 * @param gradient
	 */
	public final native void setGradient(Gradient gradient) /*-{
		this.gradient = gradient;
	}-*/;

	/**
	 * Sets the x-radius of the corner curvature.
	 * 
	 * @param rx
	 */
	public final native void setRx(int rx) /*-{
		this.rx = rx;
	}-*/;

	/**
	 * Sets the y-radius of the corner curvature.
	 * 
	 * @param ry
	 */
	public final native void setRy(int ry) /*-{
		this.ry = ry;
	}-*/;

	/**
	 * Sets the color of the box outline.
	 * 
	 * @param stroke an HTML color string.
	 */
	public final native void setStroke(String stroke) /*-{
		this.stroke = stroke;
	}-*/;

	/**
	 * Sets the thickness of the box outline.
	 * 
	 * @param strokeWidth a value in pixels
	 */
	public final native void setStrokeWidth(int strokeWidth) /*-{
		this.strokeWidth = strokeWidth;
	}-*/;
}
