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
package com.googlecode.gwt.charts.client.gauge;

import com.google.gwt.core.client.JsArrayString;

import com.googlecode.gwt.charts.client.options.Animation;
import com.googlecode.gwt.charts.client.options.Options;
import com.googlecode.gwt.charts.client.util.ArrayHelper;

/**
 * Configuration options for {@link Gauge}.
 * 
 * @see <a href="https://developers.google.com/chart/interactive/docs/gallery/gauge#Configuration_Options">Gauge Chart
 *      Configuration Options</a>
 */
public class GaugeOptions extends Options {
	public static GaugeOptions create() {
		return createObject().cast();
	}

	protected GaugeOptions() {
	}

	/**
	 * Sets animation attributes such as duration and easing
	 * 
	 * @param animation
	 */
	public final native void setAnimation(Animation animation) /*-{
		this.animation = animation;
	}-*/;

	/**
	 * The color to use for the green section, in HTML color notation.
	 * 
	 * @param greenColor
	 */
	public final native void setGreenColor(String greenColor) /*-{
		this.greenColor = greenColor;
	}-*/;

	/**
	 * The lowest value for a range marked by a green color.
	 * 
	 * @param greenFrom
	 */
	public final native void setGreenFrom(double greenFrom) /*-{
		this.greenFrom = greenFrom;
	}-*/;

	/**
	 * The highest value for a range marked by a green color.
	 * 
	 * @param greenTo
	 */
	public final native void setGreenTo(double greenTo) /*-{
		this.greenTo = greenTo;
	}-*/;

	/**
	 * Labels for major tick marks. The number of labels define the number of major ticks in all gauges.<br>
	 * The default is five major ticks, with the labels of the minimal and maximal gauge value.
	 * 
	 * @param majorTicks
	 */
	public final void setMajorTicks(String... majorTicks) {
		setMajorTicks(ArrayHelper.createArray(majorTicks));
	}

	private final native void setMajorTicks(JsArrayString majorTicks) /*-{
		this.majorTicks = majorTicks;
	}-*/;

	/**
	 * Sets the maximal value of a gauge.
	 * 
	 * @param max
	 */
	public final native void setMax(double max) /*-{
		this.max = max;
	}-*/;

	/**
	 * Sets the minimal value of a gauge.
	 * 
	 * @param min
	 */
	public final native void setMin(double min) /*-{
		this.min = min;
	}-*/;

	/**
	 * Sets the number of minor tick section in each major tick section.
	 * 
	 * @param minorTicks
	 */
	public final native void setMinorTicks(int minorTicks) /*-{
		this.minorTicks = minorTicks;
	}-*/;

	/**
	 * Sets the color to use for the red section, in HTML color notation.
	 * 
	 * @param redColor
	 */
	public final native void setRedColor(String redColor) /*-{
		this.redColor = redColor;
	}-*/;

	/**
	 * Sets the lowest value for a range marked by a red color.
	 * 
	 * @param redFrom
	 */
	public final native void setRedFrom(double redFrom) /*-{
		this.redFrom = redFrom;
	}-*/;

	/**
	 * Sets the highest value for a range marked by a red color.
	 * 
	 * @param redTo
	 */
	public final native void setRedTo(double redTo) /*-{
		this.redTo = redTo;
	}-*/;

	/**
	 * Sets the color to use for the yellow section, in HTML color notation.
	 * 
	 * @param yellowColor
	 */
	public final native void setYellowColor(String yellowColor) /*-{
		this.yellowColor = yellowColor;
	}-*/;

	/**
	 * Sets the lowest value for a range marked by a yellow color.
	 * 
	 * @param yellowFrom
	 */
	public final native void setYellowFrom(double yellowFrom) /*-{
		this.yellowFrom = yellowFrom;
	}-*/;

	/**
	 * Sets the highest value for a range marked by a yellow color.
	 * 
	 * @param yellowTo
	 */
	public final native void setYellowTo(double yellowTo) /*-{
		this.yellowTo = yellowTo;
	}-*/;

}
