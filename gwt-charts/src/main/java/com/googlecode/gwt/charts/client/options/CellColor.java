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
 * A set of border color options.
 */
public class CellColor extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static CellColor create() {
		return createObject().cast();
	}

	protected CellColor() {
	}

	/**
	 * Sets the border color.
	 * 
	 * @param stroke an HTML color string
	 */
	public final native void setStroke(String stroke) /*-{
		this.stroke = stroke;
	}-*/;

	/**
	 * Sets the border transparency.
	 * 
	 * @param strokeOpacity from 0.0 (transparent) to 1.0 (opaque)
	 */
	public final native void setStrokeOpacity(double strokeOpacity) /*-{
		this.strokeOpacity = strokeOpacity;
	}-*/;

	/**
	 * Sets the border thickness.
	 * 
	 * @param strokeWidth thickness in pixels
	 */
	public final native void setStrokeWidth(int strokeWidth) /*-{
		this.strokeWidth = strokeWidth;
	}-*/;

}
