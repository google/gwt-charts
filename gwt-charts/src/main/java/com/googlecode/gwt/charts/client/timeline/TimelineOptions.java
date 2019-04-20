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
package com.googlecode.gwt.charts.client.timeline;

import com.google.gwt.core.client.JsArrayString;

import com.googlecode.gwt.charts.client.options.BackgroundColor;
import com.googlecode.gwt.charts.client.options.Options;
import com.googlecode.gwt.charts.client.options.TextStyle;
import com.googlecode.gwt.charts.client.util.ArrayHelper;

/**
 * Configuration options for {@link Timeline}.
 * 
 * @see <a href="https://developers.google.com/chart/interactive/docs/gallery/timeline#Configuration_Options">Timeline
 *      Configuration Options</a>
 */
public class TimelineOptions extends Options {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static TimelineOptions create() {
		TimelineOptions timelineOptions = createObject().cast();
		timelineOptions.initialize();
		return timelineOptions;
	}

	protected TimelineOptions() {
	}

	/**
	 * Whether display elements (e.g., the bars in a timeline) should obscure grid lines. If false, grid lines may be
	 * covered completely by display elements. If true, display elements may be altered to keep grid lines visible.
	 * 
	 * @param avoidOverlappingGridLines default is true
	 */
	public final native void setAvoidOverlappingGridLinesl(boolean avoidOverlappingGridLines) /*-{
		this.avoidOverlappingGridLines = avoidOverlappingGridLines;
	}-*/;

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
	 * Specifies the bar label text style.
	 * 
	 * @param barLabelStyle
	 */
	public final native void setBarLabelStyle(TextStyle barLabelStyle) /*-{
		this.timeline.barLabelStyle = barLabelStyle;
	}-*/;

	/**
	 * If set to true, colors every bar on the row the same. The default is to use one color per bar label.
	 * 
	 * @param colorByRowLabel default is false
	 */
	public final native void setColorByRowLabel(boolean colorByRowLabel) /*-{
		this.timeline.colorByRowLabel = colorByRowLabel;
	}-*/;

	/**
	 * The colors to use for the chart lines and labels.
	 * 
	 * @param colors an array where each element is a string in a valid HTML color format.
	 */
	public final void setColors(String... colors) {
		setColors(ArrayHelper.createArray(colors));
	}

	/**
	 * Whether the chart throws user-based events or reacts to user interaction. If false, the chart will not throw
	 * 'select' or other interaction-based events (but will throw ready or error events), and will not display hovertext
	 * or otherwise change depending on user input.
	 * 
	 * @param enableInteractivity
	 */
	public final native void setEnableInteractivity(boolean enableInteractivity) /*-{
		this.enableInteractivity = enableInteractivity;
	}-*/;

	/**
	 * Draws the chart inside an inline frame. (Note that on IE8, this option is ignored; all IE8 charts are drawn in
	 * i-frames.)
	 * 
	 * @param forceIFrame true for drawing inside an inline frame
	 */
	public final native void setForceIFrame(boolean forceIFrame) /*-{
		this.forceIFrame = forceIFrame;
	}-*/;

	/**
	 * If set to false, creates one row for every dataTable entry. The default is to collect bars with the same row
	 * label into one row.
	 * 
	 * @param groupByRowLabel default is true
	 */
	public final native void setGroupByRowLabel(boolean groupByRowLabel) /*-{
		this.timeline.groupByRowLabel = groupByRowLabel;
	}-*/;

	/**
	 * Specifies the row label text style.
	 * 
	 * @param rowLabelStyle
	 */
	public final native void setRowLabelStyle(TextStyle rowLabelStyle) /*-{
		this.timeline.rowLabelStyle = rowLabelStyle;
	}-*/;

	/**
	 * If set to false, omits bar labels. The default is to show them.
	 * 
	 * @param showBarLabels default is true
	 */
	public final native void setShowBarLabels(boolean showBarLabels) /*-{
		this.timeline.showBarLabels = showBarLabels;
	}-*/;

	/**
	 * If set to false, omits row labels. The default is to show them.
	 * 
	 * @param showRowLabels default is true
	 */
	public final native void setShowRowLabels(boolean showRowLabels) /*-{
		this.timeline.showRowLabels = showRowLabels;
	}-*/;

	/**
	 * Colors all bars the same.
	 * 
	 * @param singleColor
	 */
	public final native void setSingleColor(String singleColor) /*-{
		this.timeline.singleColor = singleColor;
	}-*/;

	private final native void initialize() /*-{
		this.timeline = {};
	}-*/;

	private final native void setColors(JsArrayString colors) /*-{
		this.colors = colors;
	}-*/;
}
