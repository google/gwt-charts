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
 * An object with members to configure the placement and size of the chart area (where the chart itself is drawn,
 * excluding axis and legends). Two formats are supported: a number, or a number followed by %. A simple number is a
 * value in pixels; a number followed by % is a percentage.
 */
public class ChartArea extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static ChartArea create() {
		return createObject().cast();
	}

	protected ChartArea() {
	}

	/**
	 * The background color for the main area of the chart.
	 * 
	 * @param backgroundColor
	 */
	public final native void setBackgroundColor(BackgroundColor backgroundColor) /*-{
		this.backgroundColor = backgroundColor;
	}-*/;

	/**
	 * The background color for the main area of the chart.
	 * 
	 * @param backgroundColor an HTML color string
	 */
	public final native void setBackgroundColor(String backgroundColor) /*-{
		this.backgroundColor = backgroundColor;
	}-*/;

	/**
	 * Sets chart area height.
	 * 
	 * @param height a value in pixels
	 */
	public final native void setHeight(int height) /*-{
		this.height = height;
	}-*/;

	/**
	 * Sets chart area height.
	 * 
	 * @param height a value in percentage
	 */
	public final native void setHeight(String height) /*-{
		this.height = height;
	}-*/;

	/**
	 * How far to draw the chart from the left border.
	 * 
	 * @param left a value in pixels
	 */
	public final native void setLeft(int left) /*-{
		this.left = left;
	}-*/;

	/**
	 * How far to draw the chart from the left border.
	 * 
	 * @param left a value in percentage
	 */
	public final native void setLeft(String left) /*-{
		this.left = left;
	}-*/;

	/**
	 * How far to draw the chart from the top border.
	 * 
	 * @param top a value in pixels
	 */
	public final native void setTop(int top) /*-{
		this.top = top;
	}-*/;

	/**
	 * How far to draw the chart from the top border.
	 * 
	 * @param top a value in percentage
	 */
	public final native void setTop(String top) /*-{
		this.top = top;
	}-*/;

	/**
	 * Sets chart area width.
	 * 
	 * @param width a value in pixels
	 */
	public final native void setWidth(int width) /*-{
		this.width = width;
	}-*/;

	/**
	 * Sets chart area width.
	 * 
	 * @param width a value in percentage
	 */
	public final native void setWidth(String width) /*-{
		this.width = width;
	}-*/;
}
