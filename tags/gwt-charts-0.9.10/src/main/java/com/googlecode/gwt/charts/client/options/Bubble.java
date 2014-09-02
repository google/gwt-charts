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
 * An object with members to configure the visual properties of the bubbles.
 */
public class Bubble extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object
	 */
	public static Bubble create() {
		return createObject().cast();
	}

	protected Bubble() {
	}

	/**
	 * Sets the opacity of the bubbles, where 0 is fully transparent and 1 is fully opaque.
	 * 
	 * @param opacity 0 is fully transparent and 1 is fully opaque
	 */
	public final native void setOpacity(double opacity) /*-{
		this.opacity = opacity;
	}-*/;

	/**
	 * Sets the color of the bubbles' stroke.
	 * 
	 * @param stroke an HTML color string
	 */
	public final native void setStroke(String stroke) /*-{
		this.stroke = stroke;
	}-*/;

	/**
	 * Sets the bubble text style.
	 * 
	 * @param textStyle an object that specifies the bubble text style.
	 */
	public final native void setTextStyle(TextStyle textStyle) /*-{
		this.textStyle = textStyle;
	}-*/;

}
