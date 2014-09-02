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
 * An object describing the format of a slice in a pie.
 */
public class Slice extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static Slice create() {
		return createObject().cast();
	}

	protected Slice() {
	}

	/**
	 * The color to use for this slice.
	 * 
	 * @param color a valid HTML color string.
	 */
	public final native void setColor(String color) /*-{
		this.color = color;
	}-*/;

	/**
	 * How far to separate the slice from the rest of the pie.
	 * 
	 * @param offset from 0.0 (not at all) to 1.0 (the pie's radius)
	 */
	public final native void setOffset(double offset) /*-{
		this.offset = offset;
	}-*/;

	/**
	 * An object that specifies the slice text style.
	 * 
	 * @param textStyle
	 */
	public final native void setTextStyle(TextStyle textStyle) /*-{
		this.textStyle = textStyle;
	}-*/;
}
