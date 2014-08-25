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

import com.google.gwt.core.client.JsDate;

import com.googlecode.gwt.charts.client.util.DateHelper;

import java.util.Date;

/**
 * An object with members to configure various horizontal axis elements.
 */
public class HAxis extends Axis {
	/**
	 * Default constructor
	 * 
	 * @return a new object instance
	 */
	public static HAxis create() {
		return createObject().cast();
	}

	/**
	 * Constructor with title
	 * 
	 * @param title axis title
	 * 
	 * @return a new object instance
	 */
	public static HAxis create(String title) {
		HAxis hAxis = createObject().cast();
		hAxis.setTitle(title);
		return hAxis;
	}

	protected HAxis() {
	}

	/**
	 * If false, will hide outermost labels rather than allow them to be cropped by the chart container. If true, will
	 * allow label cropping.<br>
	 * This option is only supported for a discrete axis.
	 * 
	 * @param allowContainerBoundaryTextCufoff
	 */
	public final native void setAllowContainerBoundaryTextCufoff(boolean allowContainerBoundaryTextCufoff) /*-{
		this.allowContainerBoundaryTextCufoff = allowContainerBoundaryTextCufoff;
	}-*/;

	/**
	 * Maximum number of levels of horizontal axis text. If axis text labels become too crowded, the server might shift
	 * neighboring labels up or down in order to fit labels closer together. This value specifies the most number of
	 * levels to use; the server can use fewer levels, if labels can fit without overlapping.<br>
	 * This option is only supported for a discrete axis.
	 * 
	 * @param levels
	 */
	public final native void setMaxAlternation(int levels) /*-{
		this.maxAlternation = levels;
	}-*/;

	/**
	 * Maximum number of lines allowed for the text labels. Labels can span multiple lines if they are too long, and the
	 * nuber of lines is, by default, limited by the height of the available space.<br>
	 * This option is only supported for a discrete axis.
	 * 
	 * @param maxTextLines
	 */
	public final native void setMaxTextLines(int maxTextLines) /*-{
		this.maxTextLines = maxTextLines;
	}-*/;

	/**
	 * Moves the max value of the horizontal axis to the specified value; this will be rightward in most charts. Ignored
	 * if this is set to a value smaller than the maximum x-value of the data. hAxis.viewWindow.max overrides this
	 * property.<br>
	 * This option is only supported for a continuous axis.
	 * 
	 * @param maxValue
	 */
	public final void setMaxValue(Date maxValue) {
		setMaxValueDate(DateHelper.getJsDate(maxValue));
	}

	/**
	 * Minimum horizontal spacing, in pixels, allowed between two adjacent text labels. If the labels are spaced too
	 * densely, or they are too long, the spacing can drop below this threshold, and in this case one of the
	 * label-unclutter measures will be applied (e.g, truncating the lables or dropping some of them).<br>
	 * This option is only supported for a discrete axis.
	 * 
	 * @param minTextSpacing
	 */
	public final native void setMinTextSpacing(int minTextSpacing) /*-{
		this.minTextSpacing = minTextSpacing;
	}-*/;

	/**
	 * Moves the min value of the horizontal axis to the specified value; this will be leftward in most charts. Ignored
	 * if this is set to a value greater than the minimum x-value of the data. hAxis.viewWindow.min overrides this
	 * property.<br>
	 * This option is only supported for a continuous axis.
	 * 
	 * @param minValue
	 */
	public final void setMinValue(Date minValue) {
		setMinValueDate(DateHelper.getJsDate(minValue));
	}

	/**
	 * How many horizontal axis labels to show, where 1 means show every label, 2 means show every other label, and so
	 * on. Default is to try to show as many labels as possible without overlapping.<br>
	 * This option is only supported for a discrete axis.
	 * 
	 * @param interval
	 */
	public final native void setShowTextEvery(int interval) /*-{
		this.showTextEvery = interval;
	}-*/;

	/**
	 * If true, draw the horizontal axis text at an angle, to help fit more text along the axis; if false, draw
	 * horizontal axis text upright. Default behavior is to slant text if it cannot all fit when drawn upright. Notice
	 * that this option is available only when the hAxis.textPosition is set to 'out' (which is the default).<br>
	 * This option is only supported for a discrete axis.
	 * 
	 * @param enabled
	 */
	public final native void setSlantedText(boolean enabled) /*-{
		this.slantedText = enabled;
	}-*/;

	/**
	 * The angle of the horizontal axis text, if it's drawn slanted. Ignored if hAxis.slantedText is false, or is in
	 * auto mode, and the chart decided to draw the text horizontally.<br>
	 * This option is only supported for a discrete axis.
	 * 
	 * @param angle
	 */
	public final native void setSlantedTextAngle(int angle) /*-{
		this.slantedTextAngle = angle;
	}-*/;

	private final native void setMaxValueDate(JsDate maxValue) /*-{
		this.maxValue = maxValue;
	}-*/;

	private final native void setMinValueDate(JsDate minValue) /*-{
		this.minValue = minValue;
	}-*/;

}
