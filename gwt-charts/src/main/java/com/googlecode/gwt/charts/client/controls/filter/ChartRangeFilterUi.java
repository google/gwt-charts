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
package com.googlecode.gwt.charts.client.controls.filter;

import com.google.gwt.core.client.JsArrayString;

import com.googlecode.gwt.charts.client.ChartType;
import com.googlecode.gwt.charts.client.controls.ControlOptionsUi;
import com.googlecode.gwt.charts.client.options.Options;

/**
 * UI configuration options for {@link ChartRangeFilter}.
 */
public class ChartRangeFilterUi extends ControlOptionsUi {
	/**
	 * Default constructor.
	 * 
	 * @return a new object instance
	 */
	public static ChartRangeFilterUi create() {
		return createObject().cast();
	}

	protected ChartRangeFilterUi() {
		// Default constructor.
	}

	/**
	 * Sets a complete options object for a chart.
	 * 
	 * @param chartOptions a complete options object
	 */
	public final native <O extends Options> void setChartOptions(O chartOptions) /*-{
		this.chartOptions = chartOptions;
	}-*/;

	/**
	 * Sets the chart type.<br>
	 * Can be one of: {@link ChartType#AREA}, {@link ChartType#LINE}, {@link ChartType#COMBO} or
	 * {@link ChartType#SCATTER}.
	 * 
	 * @param chartType the chart type to display
	 */
	public final void setChartType(ChartType chartType) {
		setChartType(chartType.getName());
	}

	/**
	 * Sets a DataView initializer object, which acts as a filter over the underlying data. The chart wrapper must have
	 * underlying data from a DataTable or a data source to apply this view to. The first DataView in the array is
	 * applied to the underlying data to create a
	 * new data table, and the second DataView is applied to the data table resulting from application of the first
	 * DataView, and so on.
	 * 
	 * @param chartView an array of DataView initializer objects, like that returned by dataview.toJSON()
	 */
	public final native void setChartView(JsArrayString chartView) /*-{
		this.chartView = chartView;
	}-*/;

	/**
	 * Sets a DataView initializer object, which acts as a filter over the underlying data. The chart wrapper must have
	 * underlying data from a DataTable or a data source to apply this view to.
	 * 
	 * @param chartView a DataView initializer object, like that returned by dataview.toJSON()
	 */
	public final native void setChartView(String chartView) /*-{
		this.chartView = chartView;
	}-*/;

	/**
	 * The minimum selectable range size (range.end - range.start), specified in data value units. For a numeric axis,
	 * it is a number (not necessarily an integer). For a date, datetime or timeofday axis, it is an integer that
	 * specifies the difference in milliseconds.
	 * 
	 * @param minRangeSize
	 */
	public final native void setMinRangeSize(double minRangeSize) /*-{
		this.minRangeSize = minRangeSize;
	}-*/;

	/**
	 * The minimum selectable range size (range.end - range.start), specified in data value units. For a numeric axis,
	 * it is a number (not necessarily an integer). For a date, datetime or timeofday axis, it is an integer that
	 * specifies the difference in milliseconds.
	 * 
	 * @param minRangeSize
	 */
	public final native void setMinRangeSize(int minRangeSize) /*-{
		this.minRangeSize = minRangeSize;
	}-*/;

	/**
	 * If true, range thumbs are snapped to the nearest data points. In this case, the end points of the range returned
	 * by getState() are necessarily values in the data table.
	 * 
	 * @param snapToData
	 */
	public final native void setSnapToData(boolean snapToData) /*-{
		this.snapToData = snapToData;
	}-*/;

	private final native void setChartType(String chartType) /*-{
		this.chartType = chartType;
	}-*/;
}
