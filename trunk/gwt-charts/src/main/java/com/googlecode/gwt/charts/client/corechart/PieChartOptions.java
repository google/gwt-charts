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
package com.googlecode.gwt.charts.client.corechart;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

import com.googlecode.gwt.charts.client.options.BackgroundColor;
import com.googlecode.gwt.charts.client.options.ChartArea;
import com.googlecode.gwt.charts.client.options.Legend;
import com.googlecode.gwt.charts.client.options.Options;
import com.googlecode.gwt.charts.client.options.PieSliceText;
import com.googlecode.gwt.charts.client.options.Slice;
import com.googlecode.gwt.charts.client.options.TextStyle;
import com.googlecode.gwt.charts.client.util.ArrayHelper;

/**
 * Configuration options for {@link PieChart}.
 */
public class PieChartOptions extends Options {
	/**
	 * Default constructor
	 * 
	 * @return a new object instance
	 */
	public static PieChartOptions create() {
		return createObject().cast();
	}

	protected PieChartOptions() {
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
	 * Sets diff chart options
	 * 
	 * @param diff
	 */
	public final native void setDiff(PieChartDiff diff) /*-{
		this.diff = diff;
	}-*/;

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
	 * If true, displays a three-dimensional chart.
	 * 
	 * @param is3D
	 */
	public final native void setIs3D(boolean is3D) /*-{
		this.is3D = is3D;
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
	 * If between 0 and 1, displays a donut chart. The hole with have a radius equal to number times the radius of the
	 * chart.
	 * 
	 * @param pieHole
	 */
	public final native void setPieHole(double pieHole) /*-{
		this.pieHole = pieHole;
	}-*/;

	/**
	 * Color for the combination slice that holds all slices below sliceVisibilityThreshold.
	 * 
	 * @param pieResidueSliceColor
	 */
	public final native void setPieResidueSliceColor(String pieResidueSliceColor) /*-{
		this.pieResidueSliceColor = pieResidueSliceColor;
	}-*/;

	/**
	 * A label for the combination slice that holds all slices below sliceVisibilityThreshold.
	 * 
	 * @param pieResidueSliceLabel
	 */
	public final native void setPieResidueSliceLabel(String pieResidueSliceLabel) /*-{
		this.pieResidueSliceLabel = pieResidueSliceLabel;
	}-*/;

	/**
	 * The color of the slice borders. Only applicable when the chart is two-dimensional.
	 * 
	 * @param pieSliceBorderColor
	 */
	public final native void setPieSliceBorderColor(String pieSliceBorderColor) /*-{
		this.pieSliceBorderColor = pieSliceBorderColor;
	}-*/;

	/**
	 * The content of the text displayed on the slice.
	 * 
	 * @param pieSliceText
	 */
	public final void setPieSliceText(PieSliceText pieSliceText) {
		setPieSliceText(pieSliceText.getName());
	}

	/**
	 * An object that specifies the slice text style.
	 * 
	 * @param pieSliceTextStyle
	 */
	public final native void setPieSliceTextStyle(TextStyle pieSliceTextStyle) /*-{
		this.pieSliceTextStyle = pieSliceTextStyle;
	}-*/;

	/**
	 * The angle, in degrees, to rotate the chart by. The default of 0 will orient the leftmost edge of the first slice
	 * directly up.
	 * 
	 * @param pieStartAngle
	 */
	public final native void setPieStartAngle(int pieStartAngle) /*-{
		this.pieStartAngle = pieStartAngle;
	}-*/;

	/**
	 * If set to true, will draw series from right to left. The default is to draw left-to-right. This option is only
	 * supported for a discrete major axis.
	 * 
	 * @param reverseCategories
	 * @see <a href="http://developers.google.com/chart/interactive/docs/customizing_axes.html#Terminology">Discrete vs
	 *      Continuous</a>
	 */
	public final native void setReverseCategories(boolean reverseCategories) /*-{
		this.reverseCategories = reverseCategories;
	}-*/;

	/**
	 * An array of objects, each describing the format of the corresponding slice in the pie. To use default values for
	 * a slice, specify an empty object (i.e., {}). If a slice or a value is not specified, the global value will be
	 * used.
	 * 
	 * @param slices
	 */
	public final void setSlices(Slice... slices) {
		setSlices(ArrayHelper.createArray(slices));
	}

	/**
	 * The slice relative part, below which a slice will not show individually. All slices that have not passed this
	 * threshold will be combined to a single slice, whose size is the sum of all their sizes. Default is not to show
	 * individually any slice which is smaller than half a degree.
	 * 
	 * @param sliceVisibilityThreshold default is 1/720
	 */
	public final native void setSliceVisibilityThreshold(double sliceVisibilityThreshold) /*-{
		this.sliceVisibilityThreshold = sliceVisibilityThreshold;
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
	public final native void setTooltip(PieChartTooltip tooltip) /*-{
		this.tooltip = tooltip;
	}-*/;

	private final native void setColors(JsArrayString colors) /*-{
		this.colors = colors;
	}-*/;

	private final native void setPieSliceText(String pieSliceText) /*-{
		this.pieSliceText = pieSliceText;
	}-*/;

	private final native void setSlices(JsArray<Slice> slices) /*-{
		this.slices = slices;
	}-*/;

}
