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

import com.googlecode.gwt.charts.client.options.Candlestick;
import com.googlecode.gwt.charts.client.options.CoreOptions;
import com.googlecode.gwt.charts.client.options.CurveType;
import com.googlecode.gwt.charts.client.options.FocusTarget;
import com.googlecode.gwt.charts.client.options.SeriesType;
import com.googlecode.gwt.charts.client.options.VAxis;
import com.googlecode.gwt.charts.client.util.ArrayHelper;

/**
 * Configuration options for {@link ComboChart}.
 */
public class ComboChartOptions extends CoreOptions {
	/**
	 * Default constructor
	 * 
	 * @return a new object instance
	 */
	public static ComboChartOptions create() {
		return createObject().cast();
	}

	protected ComboChartOptions() {
	}

	/**
	 * Sets the default opacity of the colored area under an area chart series. To specify opacity for an individual
	 * series, set the areaOpacity with {@link #setSeries(int, ComboChartSeries)}.
	 * 
	 * @param opacity a value from 0.0 (fully transparent) to 1.0 (fully opaque)
	 */
	public final native void setAreaOpacity(double opacity) /*-{
		this.areaOpacity = opacity;
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
	 * Controls the curve of the lines when the line width is not zero.
	 * 
	 * @param curveType the line curve type
	 */
	public final void setCurveType(CurveType curveType) {
		setCurveType(curveType.getName());
	}

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
		setFocusTarget(focusTarget);
	}

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
	 * Defines data line width in pixels. Use zero to hide all lines and show only the points. You can override values
	 * for individual series using {@link #setSeries(int, ComboChartSeries)}.
	 * 
	 * @param width data line width in pixels
	 */
	public final native void setLineWidth(int width) /*-{
		this.lineWidth = width;
	}-*/;

	/**
	 * Sets diameter of displayed points in pixels. Use zero to hide all points. You can override values for individual
	 * series using {@link #setSeries(int, ComboChartSeries)}.
	 * 
	 * @param size diameter of displayed points in pixels
	 */
	public final native void setPointSize(int size) /*-{
		this.pointSize = size;
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
	public final void setSeries(ComboChartSeries... series) {
		setSeries(ArrayHelper.createArray(series));
	}

	/**
	 * Sets series options by index for describing the format of the corresponding series in the chart
	 * 
	 * @param index the series index
	 * @param series an object definining the series format
	 */
	public final native void setSeries(int index, ComboChartSeries series) /*-{
		if (!this.series) {
			this.series = {};
		}
		this.series[index] = series;
	}-*/;

	/**
	 * Sets the default line type for any series not specified in the series property.
	 * 
	 * @param seriesType the series type
	 */
	public final void setSeriesType(SeriesType seriesType) {
		setSeriesType(seriesType.getName());
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

	private final native void setCurveType(String curveType) /*-{
		this.curveType = curveType;
	}-*/;

	private final native void setFocusTarget(String focusTarget) /*-{
		this.focusTarget = focusTarget;
	}-*/;

	private final native void setSeriesType(String seriesType) /*-{
		this.seriesType = seriesType;
	}-*/;

	private final native void setSeries(JsArray<ComboChartSeries> series) /*-{
		this.series = series;
	}-*/;

	private final native void setVAxes(JsArray<VAxis> vAxes) /*-{
		this.vAxes = vAxes;
	}-*/;

}
