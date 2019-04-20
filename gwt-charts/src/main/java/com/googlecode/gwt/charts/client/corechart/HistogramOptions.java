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

import com.googlecode.gwt.charts.client.options.Bar;
import com.googlecode.gwt.charts.client.options.CoreOptions;
import com.googlecode.gwt.charts.client.options.FocusTarget;
import com.googlecode.gwt.charts.client.options.Orientation;
import com.googlecode.gwt.charts.client.options.Trendline;
import com.googlecode.gwt.charts.client.options.VAxis;
import com.googlecode.gwt.charts.client.util.ArrayHelper;

/**
 * Configuration options for {@link ColumnChart}.
 */
public class HistogramOptions extends CoreOptions {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static HistogramOptions create() {
		return createObject().cast();
	}

	protected HistogramOptions() {
	}

	/**
	 * Sets the bar options, currently only width.
	 * 
	 * @param bar an object defining bar options
	 */
	public final native void setBar(Bar bar) /*-{
		this.bar = bar;
	}-*/;

	/**
	 * Hardcode the size of each histogram bar, rather than letting it be determined algorithmically.
	 * 
	 * @param bucketSize
	 */
	public final native void setBucketSize(int bucketSize) /*-{
		if (!this.histogram) {
			this.histogram = {};
		}
		this.histogram.bucketSize = bucketSize;
	}-*/;

	/**
	 * Sets the transparency of data points, with 1.0 being completely opaque and 0.0 fully transparent. In scatter,
	 * histogram, bar, and column charts, this refers to the visible data: dots in the scatter chart and rectangles in
	 * the others. In charts where selecting data creates a dot, such as the line and area charts, this refers to the
	 * circles that appear upon hover or selection. The combo chart exhibits both behaviors.
	 * 
	 * @param dataOpacity a value from 0.0 (fully transparent) to 1.0 (fully opaque)
	 */
	public final native void setDataOpacity(double dataOpacity) /*-{
		this.dataOpacity = dataOpacity;
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
	 * Omit the thin divisions between the blocks of the histogram, making it into a series of solid bars.
	 * 
	 * @param hideBucketItems
	 */
	public final native void setHideBucketItems(boolean hideBucketItems) /*-{
		if (!this.histogram) {
			this.histogram = {};
		}
		this.histogram.hideBucketItems = hideBucketItems;
	}-*/;

	/**
	 * Whether to guess the value of missing points. If true, it will guess the value of any missing data based on
	 * neighboring points. If false, it will leave a break in the line at the unknown point.
	 * 
	 * @param interpolateNulls true to guess the value of missing points
	 */
	public final native void setInterpolateNulls(boolean interpolateNulls) /*-{
		this.interpolateNulls = interpolateNulls;
	}-*/;

	/**
	 * Stacks or unstacks series elements.
	 * 
	 * @param isStacked If set to true, series elements are stacked (default: false)
	 */
	public final native void setIsStacked(boolean isStacked) /*-{
		this.isStacked = isStacked;
	}-*/;

	/**
	 * When calculating the histogram's bucket size, ignore the top and bottom lastBucketPercentile percent.
	 * 
	 * @param lastBucketPercentile
	 */
	public final native void setLastBucketPercentile(int lastBucketPercentile) /*-{
		if (!this.histogram) {
			this.histogram = {};
		}
		this.histogram.lastBucketPercentile = lastBucketPercentile;
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
	 * Sets series options with an array of objects, each describing the format of the corresponding series in the
	 * chart.
	 * 
	 * @param series an array of the corresponding series objects
	 */
	public final void setSeries(HistogramSeries... series) {
		setSeries(ArrayHelper.createArray(series));
	}

	/**
	 * Sets series options by index for describing the format of the corresponding series in the chart.
	 * 
	 * @param index the series index
	 * @param series an object definining the series format
	 */
	public final native void setSeries(int index, HistogramSeries series) /*-{
		if (!this.series) {
			this.series = {};
		}
		this.series[index] = series;
	}-*/;

	/**
	 * Sets a trendline by index.
	 * 
	 * @param index the data index
	 * @param trendline an object definining the trendline format
	 */
	public final native void setTrendline(int index, Trendline trendline) /*-{
		if (!this.trendlines) {
			this.trendlines = {};
		}
		this.trendlines[index] = trendline;
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

	private final native void setFocusTarget(String focusTarget) /*-{
		this.focusTarget = focusTarget;
	}-*/;

	private final native void setSeries(JsArray<HistogramSeries> series) /*-{
		this.series = series;
	}-*/;

	private final native void setVAxes(JsArray<VAxis> vAxes) /*-{
		this.vAxes = vAxes;
	}-*/;
}
