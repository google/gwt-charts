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

import com.googlecode.gwt.charts.client.options.AggregationTarget;
import com.googlecode.gwt.charts.client.options.BackgroundColor;
import com.googlecode.gwt.charts.client.options.Bar;
import com.googlecode.gwt.charts.client.options.Candlestick;
import com.googlecode.gwt.charts.client.options.CoreOptions;
import com.googlecode.gwt.charts.client.options.FocusTarget;
import com.googlecode.gwt.charts.client.options.Orientation;
import com.googlecode.gwt.charts.client.options.VAxis;
import com.googlecode.gwt.charts.client.util.ArrayHelper;

/**
 * Configuration options for {@link CandlestickChart}.
 * 
 * @see <a
 *      href="https://developers.google.com/chart/interactive/docs/gallery/candlestickchart#Configuration_Options">Candlestick
 *      Chart Configuration Options</a>
 */
public class CandlestickChartOptions extends CoreOptions {
	/**
	 * Default constructor
	 * 
	 * @return a new object instance
	 */
	public static CandlestickChartOptions create() {
		CandlestickChartOptions candlestickChartOptions = createObject().cast();
		candlestickChartOptions.initialize();
		return candlestickChartOptions;
	}

	protected CandlestickChartOptions() {
	}

	/**
	 * How multiple data selections are rolled up into tooltips:
	 * <ul>
	 * <li>'category': Group selected data by x-value.</li>
	 * <li>'series': Group selected data by series.</li>
	 * <li>'auto': Group selected data by x-value if all selections have the same x-value, and by series otherwise.</li>
	 * <li>'none': Show only one tooltip per selection.</li>
	 * </ul>
	 * aggregationTarget will often be used in tandem with selectionMode and tooltip.trigger, e.g.:
	 * 
	 * <pre>
	 * // Allow multiple simultaneous selections.
	 * options.setSelectionMode(SelectionMode.MULTIPLE);
	 * // Trigger tooltips on selections.
	 * Tooltip tooltip = Tooltip.create();
	 * tooltip.setTrigger(TooltipTrigger.SELECTION);
	 * options.setTooltip(tooltip);
	 * // Group selections by x-value.
	 * options.setAggregationTarget(AggregationTarget.CATEGORY);
	 * 
	 * </pre>
	 * 
	 * @param aggregationTarget
	 */
	public final native void setAggregationTarget(AggregationTarget aggregationTarget) /*-{
		this.aggregationTarget = aggregationTarget;
	}-*/;

	/**
	 * Sets the bar options, currently only width
	 * 
	 * @param bar an object defining bar options
	 */
	public final native void setBar(Bar bar) /*-{
		this.bar = bar;
	}-*/;

	/**
	 * Sets the candlestick options
	 * 
	 * @param candlestick an object with options
	 */
	public final native void setCandlestick(Candlestick candlestick) /*-{
		this.candlestick = candlestick;
	}-*/;

	/**
	 * Sets the colors applied to falling candles
	 * 
	 * @param fallingColor falling candles color settings
	 */
	public final native void setFallingColor(BackgroundColor fallingColor) /*-{
		this.candlestick.fallingColor = fallingColor;
	}-*/;

	/**
	 * Defines the type of the entity that receives focus on mouse hover. Also affects which entity is selected by mouse
	 * click, and which data table element is associated with events. Can be one of the following:
	 * <ul>
	 * <li>'datum' - Focus on a single data point. Correlates to a cell in the data table.</li>
	 * <li>'category' - Focus on a grouping of all data points along the major axis. Correlates to a row in the data
	 * table.</li>
	 * </ul>
	 * In focusTarget 'category' the tooltip displays all the category values.<br>
	 * This may be useful for comparing values of different series.
	 * 
	 * @param focusTarget the type of the entity that receives focus on mouse hover
	 */
	public final void setFocusTarget(FocusTarget focusTarget) {
		setFocusTarget(focusTarget.getName());
	}

	/**
	 * If true, rising candles will appear hollow and falling candles will appear solid, otherwise, the opposite.
	 * 
	 * @param hollowIsRising
	 */
	public final native void setHollowIsRising(boolean hollowIsRising) /*-{
		this.candlestick.hollowIsRising = hollowIsRising;
	}-*/;

	/**
	 * The orientation of the chart. When set to 'vertical', rotates the axes of the chart so that (for instance) a
	 * column chart becomes a bar chart, and an area chart grows rightward instead of up.
	 * 
	 * @param orientation
	 */
	public final native void setOrientation(Orientation orientation) /*-{
		this.orientation = orientation;
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
	 * Sets the colors applied to rising candles
	 * 
	 * @param risingColor rising candles color settings
	 */
	public final native void setRisingColor(BackgroundColor risingColor) /*-{
		this.candlestick.risingColor = risingColor;
	}-*/;

	/**
	 * Sets series options with an array of objects, each describing the format of the corresponding series in the
	 * chart.
	 * 
	 * @param series an array of the corresponding series objects
	 */
	public final void setSeries(CandlestickChartSeries... series) {
		setSeries(ArrayHelper.createArray(series));
	}

	/**
	 * Sets series options by index for describing the format of the corresponding series in the chart
	 * 
	 * @param index the series index
	 * @param series an object definining the series format
	 */
	public final native void setSeries(int index, CandlestickChartSeries series) /*-{
		if (!this.series) {
			this.series = {};
		}
		this.series[index] = series;
	}-*/;

	/**
	 * Specifies properties for individual vertical axes, if the chart has multiple vertical axes. Each child object is
	 * a vAxis object, and can contain all the properties supported by vAxis. These property values override any global
	 * settings for the same property.
	 * 
	 * To specify a chart with multiple vertical axes, first define a new axis using series.targetAxisIndex, then
	 * configure the axis using vAxes.
	 * 
	 * @param vAxes an array of VAxis values
	 */
	public final void setVAxes(VAxis... vAxes) {
		setVAxes(ArrayHelper.createArray(vAxes));
	}

	/**
	 * Specifies properties for individual vertical axes, if the chart has multiple vertical axes. These property values
	 * override any global settings for the same property.
	 * 
	 * To specify a chart with multiple vertical axes, first define a new axis using series.targetAxisIndex, then
	 * configure the axis using vAxes.
	 * 
	 * @param index the axis index
	 * @param vAxis a set of vertical axis properties
	 */
	public final native void setVAxis(int index, VAxis vAxis) /*-{
		if (!this.vAxes) {
			this.vAxes = {};
		}
		this.vAxes[index] = vAxis;
	}-*/;

	private final native void initialize() /*-{
		this.candlestick = {};
	}-*/;

	private final native void setFocusTarget(String focusTarget) /*-{
		this.focusTarget = focusTarget;
	}-*/;

	private final native void setSeries(JsArray<CandlestickChartSeries> series) /*-{
		this.series = series;
	}-*/;

	private final native void setVAxes(JsArray<VAxis> vAxes) /*-{
		this.vAxes = vAxes;
	}-*/;
}
