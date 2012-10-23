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

public abstract class Axis extends JavaScriptObject {
	public static Axis create() {
		return createObject().cast();
	}

	protected Axis() {
	}

	public final native void setBaseline(double baseline) /*-{
		this.baseline = baseline;
	}-*/;

	public final native void setBaselineColor(String color) /*-{
		this.baselineColor = color;
	}-*/;

	public final void setDirection(Direction direction) {
		setDirection(direction.getValue());
	}

	public final native void setFormat(String format) /*-{
		this.format = format;
	}-*/;

	public final native void setGridlines(Gridlines gridlines) /*-{
		this.gridlines = gridlines;
	}-*/;

	public final native void setLogScale(boolean logScale) /*-{
		this.logScale = logScale;
	}-*/;

	public final native void setMaxValue(double maxValue) /*-{
		this.maxValue = maxValue;
	}-*/;

	public final native void setMinorGridlines(Gridlines minorGridlines) /*-{
		this.minorGridlines = minorGridlines;
	}-*/;

	public final native void setMinValue(double minValue) /*-{
		this.minValue = minValue;
	}-*/;

	public final void setTextPosition(TextPosition position) {
		setTextPosition(position.getName());
	}

	public final native void setTextStyle(TextStyle textStyle) /*-{
		this.textStyle = textStyle;
	}-*/;

	public final native void setTitle(String title) /*-{
		this.title = title;
	}-*/;

	public final native void setTitleTextStyle(TextStyle style) /*-{
		this.titleTextStyle = style;
	}-*/;

	public final native void setViewWindow(ViewWindow viewWindow) /*-{
		this.viewWindow = viewWindow;
	}-*/;

	public final native void setViewWindowMode(String mode) /*-{
		this.viewWindowMode = mode;
	}-*/;

	private final native void setDirection(int direction) /*-{
		this.direction = direction;
	}-*/;

	private final native void setTextPosition(String position) /*-{
		this.textPosition = position;
	}-*/;

}
