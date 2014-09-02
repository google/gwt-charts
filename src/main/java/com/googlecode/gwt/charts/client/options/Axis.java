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
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayString;

import com.googlecode.gwt.charts.client.TimeOfDay;
import com.googlecode.gwt.charts.client.util.ArrayHelper;

import java.util.Date;

/**
 * An object with members to configure various axis elements.
 */
public abstract class Axis extends JavaScriptObject {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static Axis create() {
		return createObject().cast();
	}

	protected Axis() {
	}

	/**
	 * Sets the baseline for the axis.
	 * 
	 * @param baseline
	 */
	public final native void setBaseline(double baseline) /*-{
		this.baseline = baseline;
	}-*/;

	/**
	 * Sets the color of the baseline for the axis.
	 * 
	 * @param color a valid HTML color format.
	 */
	public final native void setBaselineColor(String color) /*-{
		this.baselineColor = color;
	}-*/;

	/**
	 * The direction in which the values along the axis grow.
	 * 
	 * @param direction
	 */
	public final void setDirection(Direction direction) {
		setDirection(direction.getValue());
	}

	/**
	 * A format string for numeric or date axis labels.
	 * <p>
	 * For number axis labels, this is a subset of the decimal formatting ICU pattern set. For instance, "#,###%" will
	 * display values "1,000%", "750%", and "50%" for values 10, 7.5, and 0.5.
	 * </p>
	 * <p>
	 * For date axis labels, this is a subset of the date formatting ICU pattern set. For instance, "MMM d, y" will
	 * display the value "Jul 1, 2011" for the date of July first in 2011.
	 * </p>
	 * <p>
	 * The actual formatting applied to the label is derived from the locale the API has been loaded with. For more
	 * details, see loading charts with a specific locale.
	 * </p>
	 * This option is only supported for a continuous axis.
	 * 
	 * @param format
	 */
	public final native void setFormat(String format) /*-{
		this.format = format;
	}-*/;

	/**
	 * Configure the gridlines on the axis.
	 * 
	 * @param gridlines
	 */
	public final native void setGridlines(Gridlines gridlines) /*-{
		this.gridlines = gridlines;
	}-*/;

	/**
	 * Makes the axis a logarithmic scale (requires all values to be positive). Set to true for yes.
	 * 
	 * @param logScale
	 */
	public final native void setLogScale(boolean logScale) /*-{
		this.logScale = logScale;
	}-*/;

	/**
	 * Moves the max value of the axis to the specified value; this will be rightward in most charts.<br>
	 * Ignored if this is set to a value smaller than the maximum x-value of the data.
	 * 
	 * @param maxValue
	 */
	public final native void setMaxValue(double maxValue) /*-{
		this.maxValue = maxValue;
	}-*/;

	/**
	 * Configure the minor gridlines on the axis.
	 * 
	 * @param minorGridlines
	 */
	public final native void setMinorGridlines(Gridlines minorGridlines) /*-{
		this.minorGridlines = minorGridlines;
	}-*/;

	/**
	 * Moves the min value of the axis to the specified value; this will be leftward in most charts.<br>
	 * Ignored if this is set to a value greater than the minimum x-value of the data.
	 * 
	 * @param minValue
	 */
	public final native void setMinValue(double minValue) /*-{
		this.minValue = minValue;
	}-*/;

	/**
	 * Position of the axis text, relative to the chart area.
	 * 
	 * @param position
	 */
	public final void setTextPosition(TextPosition position) {
		setTextPosition(position.getName());
	}

	/**
	 * Specifies the axis text style.
	 * 
	 * @param textStyle
	 */
	public final native void setTextStyle(TextStyle textStyle) /*-{
		this.textStyle = textStyle;
	}-*/;

	/**
	 * Replaces the automatically generated axis ticks with the specified array. Each element of the array should be
	 * either a valid tick value (such as a number, date, datetime, or timeofday), or an object. If it's an object, it
	 * should have a v property for the tick value, and an optional f property containing the literal string to be
	 * displayed as the label.
	 * 
	 * @param ticks
	 */
	public final void setTicks(Date... ticks) {
		setTicks(ArrayHelper.createArray(ticks));
	}

	/**
	 * Replaces the automatically generated axis ticks with the specified array. Each element of the array should be
	 * either a valid tick value (such as a number, date, datetime, or timeofday), or an object. If it's an object, it
	 * should have a v property for the tick value, and an optional f property containing the literal string to be
	 * displayed as the label.
	 * 
	 * @param ticks
	 */
	public final void setTicks(double... ticks) {
		setTicks(ArrayHelper.createArray(ticks));
	}

	/**
	 * Replaces the automatically generated axis ticks with the specified array. Each element of the array should be
	 * either a valid tick value (such as a number, date, datetime, or timeofday), or an object. If it's an object, it
	 * should have a v property for the tick value, and an optional f property containing the literal string to be
	 * displayed as the label.
	 * 
	 * @param ticks
	 */
	public final void setTicks(int... ticks) {
		setTicks(ArrayHelper.createArray(ticks));
	}

	/**
	 * Replaces the automatically generated axis ticks with the specified array. Each element of the array should be
	 * either a valid tick value (such as a number, date, datetime, or timeofday), or an object. If it's an object, it
	 * should have a v property for the tick value, and an optional f property containing the literal string to be
	 * displayed as the label.
	 * 
	 * @param ticks
	 */
	public final void setTicks(Tick... ticks) {
		setTicks(ArrayHelper.createArray(ticks));
	}

	/**
	 * Replaces the automatically generated axis ticks with the specified array. Each element of the array should be
	 * either a valid tick value (such as a number, date, datetime, or timeofday), or an object. If it's an object, it
	 * should have a v property for the tick value, and an optional f property containing the literal string to be
	 * displayed as the label.
	 * 
	 * @param ticks
	 */
	public final void setTicks(TimeOfDay... ticks) {
		setTicks(ArrayHelper.createArray(ticks));
	}

	/**
	 * Sets the title of the axis.
	 * 
	 * @param title
	 */
	public final native void setTitle(String title) /*-{
		this.title = title;
	}-*/;

	/**
	 * Sets the title style of the axis.
	 * 
	 * @param style
	 */
	public final native void setTitleTextStyle(TextStyle style) /*-{
		this.titleTextStyle = style;
	}-*/;

	/**
	 * Specifies the cropping range of the axis.
	 * 
	 * @param viewWindow
	 */
	public final native void setViewWindow(ViewWindow viewWindow) /*-{
		this.viewWindow = viewWindow;
	}-*/;

	/**
	 * Specifies how to scale the horizontal axis to render the values within the chart area.
	 * 
	 * @param mode
	 */
	public final void setViewWindowMode(ViewWindowMode mode) {
		setViewWindowMode(mode.getName());
	}

	private final native void setDirection(int direction) /*-{
		this.direction = direction;
	}-*/;

	private final native void setTextPosition(String position) /*-{
		this.textPosition = position;
	}-*/;

	private final native <E extends JavaScriptObject> void setTicks(JsArray<E> ticks) /*-{
		this.ticks = ticks;
	}-*/;

	private final native void setTicks(JsArrayInteger ticks) /*-{
		this.ticks = ticks;
	}-*/;

	private final native void setTicks(JsArrayNumber ticks) /*-{
		this.ticks = ticks;
	}-*/;

	private final native void setTicks(JsArrayString ticks) /*-{
		this.ticks = ticks;
	}-*/;

	private final native void setViewWindowMode(String mode) /*-{
		this.viewWindowMode = mode;
	}-*/;

}
