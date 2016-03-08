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

import com.google.gwt.core.client.JsArrayString;

import com.googlecode.gwt.charts.client.util.ArrayHelper;

/**
 * Common options for core charts.
 */
public abstract class CoreOptions extends Options {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static CoreOptions create() {
		return createObject().cast();
	}

	protected CoreOptions() {
	}

	/**
	 * Sets animation attributes such as duration and easing.
	 * 
	 * @param animation
	 */
	public final native void setAnimation(Animation animation) /*-{
		this.animation = animation;
	}-*/;

	/**
	 * Sets where to place the axis titles, compared to the chart area.
	 * 
	 * @param axisTitlesPosition
	 */
	public final void setAxisTitlesPosition(AxisTitlesPosition axisTitlesPosition) {
		setAxisTitlesPosition(axisTitlesPosition.getName());
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
	 * Configure the placement and size of the chart area (where the chart itself is drawn, excluding axis and legends).
	 * 
	 * @param chartArea
	 */
	public final native void setChartArea(ChartArea chartArea) /*-{
		this.chartArea = chartArea;
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
	 * The default font face for all text in the chart. You can override this using properties for specific chart
	 * elements.
	 * 
	 * @param fontName
	 */
	public final native void setFontName(String fontName) /*-{
		this.fontName = fontName;
	}-*/;

	/**
	 * The default font size, in pixels, of all text in the chart. You can override this using properties for specific
	 * chart elements.
	 * 
	 * @param fontSize
	 */
	public final native void setFontSize(double fontSize) /*-{
		this.fontSize = fontSize;
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
	 * Configure various horizontal axis elements.
	 * 
	 * @param hAxis
	 */
	public final native void setHAxis(HAxis hAxis) /*-{
		this.hAxis = hAxis;
	}-*/;

	/**
	 * Configure various aspects of the legend.
	 * 
	 * @param legend
	 */
	public final native void setLegend(Legend legend) /*-{
		this.legend = legend;
	}-*/;

	/**
	 * When selectionMode is 'multiple', users may select multiple data points.
	 * 
	 * @param selectionMode default is 'single'
	 */
	public final void setSelectionMode(SelectionMode selectionMode) {
		setSelectionMode(selectionMode.getName());
	}

	/**
	 * A theme is a set of predefined option values that work together to achieve a specific chart behavior or visual
	 * effect.
	 * 
	 * @param theme
	 */
	public final native void setTheme(String theme) /*-{
		this.theme = theme;
	}-*/;

	/**
	 * Text to display above the chart.
	 * 
	 * @param title
	 */
	public final native void setTitle(String title) /*-{
		this.title = title;
	}-*/;

	/**
	 * Where to place the chart title, compared to the chart area.
	 * 
	 * @param titlePosition
	 */
	public final void setTitlePosition(TitlePosition titlePosition) {
		setTitlePosition(titlePosition.getName());
	}

	/**
	 * An object that specifies the title text style.
	 * 
	 * @param titleTextStyle
	 */
	public final native void setTitleTextStyle(TextStyle titleTextStyle) /*-{
		this.titleTextStyle = titleTextStyle;
	}-*/;

	/**
	 * An object with members to configure various tooltip elements.
	 * 
	 * @param tooltip
	 */
	public final native void setTooltip(Tooltip tooltip) /*-{
		this.tooltip = tooltip;
	}-*/;

	/**
	 * Configure various vertical axis elements.
	 * 
	 * @param vAxis
	 */
	public final native void setVAxis(VAxis vAxis) /*-{
		this.vAxis = vAxis;
	}-*/;

	private final native void setAxisTitlesPosition(String axisTitlesPosition) /*-{
		this.axisTitlesPosition = axisTitlesPosition;
	}-*/;

	private final native void setColors(JsArrayString colors) /*-{
		this.colors = colors;
	}-*/;

	private final native void setSelectionMode(String selectionMode) /*-{
		this.selectionMode = selectionMode;
	}-*/;

	private final native void setTitlePosition(String titlePosition) /*-{
		this.titlePosition = titlePosition;
	}-*/;

}
