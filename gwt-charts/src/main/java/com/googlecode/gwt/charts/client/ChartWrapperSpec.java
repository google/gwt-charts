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
package com.googlecode.gwt.charts.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayMixed;
import com.google.gwt.core.client.JsArrayString;

import com.googlecode.gwt.charts.client.options.Options;

/**
 * A ChartWrapperObject initializer specification as described in <a
 * href="https://developers.google.com/chart/interactive/docs/reference#google.visualization.drawchart"
 * >google.visualization.drawChart()</a>.
 * 
 * @param <T> the chart options type
 */
public class ChartWrapperSpec<T extends Options> extends JavaScriptObject {
	/**
	 * Creates a new instance.
	 * @param chartType the class name of the visualization
	 * @param containerId containerId ID of the DOM element
	 * @return the new instance
	 */
	public static ChartWrapperSpec<?> create(ChartType chartType, String containerId) {
		ChartWrapperSpec<?> chartWrapperSpec = createObject().cast();
		chartWrapperSpec.setChartType(chartType);
		chartWrapperSpec.setContainerId(containerId);
		return chartWrapperSpec;
	}

	protected ChartWrapperSpec() {
	}

	/**
	 * Sets the class name of the visualization. The google.visualization package name can be omitted for Google charts.
	 * If the appropriate visualization library has not already been loaded, this method will load the library for you if
	 * this is a Google visualization; you must load third party visualizations explicitly
	 * 
	 * @param chartType the class name of the visualization
	 */
	public final void setChartType(ChartType chartType) {
		setChartType(chartType.getName());
	}

	/**
	 * Sets the ID of the DOM element on your page that will host the visualization.
	 * 
	 * @param containerId ID of the DOM element
	 */
	public final native void setContainerId(String containerId) /*-{
		this.containerId = containerId;
	}-*/;

	/**
	 * Sets a data source query to populate the chart data (for example, a Google Spreadsheet). You must specify either
	 * this
	 * property or the dataTable property.
	 * 
	 * @param dataSourceUrl data source query to populate the chart data
	 */
	public final native void setDataSourceUrl(String dataSourceUrl) /*-{
		this.dataSourceUrl = dataSourceUrl;
	}-*/;

	/**
	 * Sets the data table used to populate the visualization.
	 * You must specify either this property or the dataSourceUrl property.
	 * 
	 * @param dataTable a DataLiteral object
	 */
	public final native void setDataTable(DataLiteral dataTable) /*-{
		this.dataTable = dataTable;
	}-*/;

	/**
	 * Sets the data table used to populate the visualization.
	 * You must specify either this property or the dataSourceUrl property.
	 * 
	 * @param dataTable a DataTable reference
	 */
	public final native void setDataTable(DataTable dataTable) /*-{
		this.dataTable = dataTable;
	}-*/;

	/**
	 * Sets the data table used to populate the visualization.
	 * You must specify either this property or the dataSourceUrl property.
	 * 
	 * @param dataTable a two-dimensional array like that accepted by {@link com.googlecode.gwt.charts.client.util.ChartHelper#arrayToDataTable(JsArrayMixed)}
	 */
	public final native void setDataTable(JsArrayMixed dataTable) /*-{
		this.dataTable = dataTable;
	}-*/;

	/**
	 * Sets the options for the visualization.
	 * 
	 * @param options
	 */
	public final native void setOptions(T options) /*-{
		this.options = options;
	}-*/;

	/**
	 * If specifying dataSourceUrl, you can optionally specify a SQL-like query string using the Visualization query
	 * language to filter or manipulate the data.
	 * 
	 * @param query a SQL-like query string
	 */
	public final native void setQuery(String query) /*-{
		this.query = query;
	}-*/;

	/**
	 * Sets how often, in seconds, the visualization should refresh its query source. Use this only when specifying
	 * dataSourceUrl.
	 * 
	 * @param refreshInterval the refresh interval in seconds
	 */
	public final native void setRefreshInterval(int refreshInterval) /*-{
		this.refreshInterval = refreshInterval;
	}-*/;

	/**
	 * Sets a DataView initializer object, which acts as a filter over the underlying data, as defined by either the
	 * dataTable or dataSourceUrl parameter. You can pass in either a string or DataView initializer object, like that
	 * returned by dataview.toJSON().
	 * 
	 * @param view
	 */
	// TODO review this
	public final native void setView(JsArrayString view) /*-{
		this.view = view;
	}-*/;

	/**
	 * Sets a DataView initializer object, which acts as a filter over the underlying data, as defined by either the
	 * dataTable or dataSourceUrl parameter.
	 * 
	 * @param view DataView initializer object, like that returned by {@link DataView#toJSON()}
	 */
	public final native void setView(String view) /*-{
		this.view = view;
	}-*/;

	private final native void setChartType(String chartType) /*-{
		this.chartType = chartType;
	}-*/;
}
