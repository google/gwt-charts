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
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayMixed;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.core.client.JsDate;

import com.googlecode.gwt.charts.client.event.ErrorEvent;
import com.googlecode.gwt.charts.client.event.ErrorHandler;
import com.googlecode.gwt.charts.client.event.EventHandler;
import com.googlecode.gwt.charts.client.event.HandlerRef;
import com.googlecode.gwt.charts.client.event.ReadyEvent;
import com.googlecode.gwt.charts.client.event.ReadyHandler;
import com.googlecode.gwt.charts.client.event.SelectEvent;
import com.googlecode.gwt.charts.client.event.SelectHandler;
import com.googlecode.gwt.charts.client.options.Options;
import com.googlecode.gwt.charts.client.util.ChartHelper;
import com.googlecode.gwt.charts.client.util.DateHelper;

import java.util.Date;

/**
 * A ChartWrapper class is used to wrap your chart and handle all loading, drawing, and Datasource querying for
 * your
 * chart. The class exposes convenience methods for setting values on the chart and drawing it. This class simplifies
 * reading from a data source, because you do not have to create a query callback handler. You can also use it to save a
 * chart easily for reuse.
 * 
 * Another bonus of using ChartWrapper is that you can reduce the number of library loads by using dynamic
 * loading.
 * Additionally, you don't need to load the JSAPI library explicitly, and ChartWrapper will handle looking up the
 * chart
 * libraries for you, so you do not need to specify any chart libraries in your loading statement. See the examples
 * below for details.
 * 
 * However, ChartWrapper currently only propagates a subset of events thrown by charts: select, ready, and error.
 * Other
 * events are not transmitted through the ChartWrapper instance; to get other events, you must call getChart() and
 * subscribe to events directly on the chart handle.
 * 
 * @param <T> the options this chart implements
 */
public class ChartWrapper<T extends Options> extends HasListeners {
	/**
	 * Creates a empty ChartWrapper instance.
	 * You must set all the appropriate properties using the set... methods exposed by this object.
	 * 
	 * @param <T> the chart options type
	 * 
	 * @return a new ChartWrapper instance
	 */
	public static native <T extends Options> ChartWrapper<T> create() /*-{
		return new $wnd.google.visualization.ChartWrapper();
	}-*/;

	/**
	 * Creates a ChartWrapper instance with the provided properties.
	 * 
	 * @param <T> the chart options type
	 * 
	 * @param chartWrapperSpec chart properties specification
	 * @return a new ChartWrapper instance
	 */
	public static native <T extends Options> ChartWrapper<T> create(ChartWrapperSpec<T> chartWrapperSpec) /*-{
		return new $wnd.google.visualization.ChartWrapper(chartWrapperSpec);
	}-*/;

	protected ChartWrapper() {
		// Default constructor
	}

	/**
	 * Fired when an error occurs when attempting to render the chart.
	 * 
	 * @param handler the error handler
	 * @return a reference for removing this handler
	 */
	public final HandlerRef addErrorHandler(ErrorHandler handler) {
		return addListener(ErrorEvent.NAME, handler);
	}

	/**
	 * Adds an event directly to the chart
	 * 
	 * @param handler the chart handler
	 * @return a reference for removing this handler
	 */
	public final HandlerRef addHandler(final EventHandler handler) {
		return addListener(ReadyEvent.NAME, new ReadyHandler() {
			
			@Override
			public void onReady(ReadyEvent event) {
				addListener(getChart(), handler.getEventName(), handler);
			}
		});
	}
	
	/**
	 * The chart is ready for external method calls. If you want to interact with the chart, and call methods after you
	 * draw it, you should set up a listener for this event before you call the draw method, and call them only after
	 * the event was fired
	 * 
	 * @param handler the ready handler
	 * @return a reference for removing this handler
	 */
	public final HandlerRef addReadyHandler(ReadyHandler handler) {
		return addListener(ReadyEvent.NAME, handler);
	}

	/**
	 * Fired when the user clicks a bar or legend. When a chart element is selected, the corresponding cell in the data
	 * table is selected; when a legend is selected, the corresponding column in the data table is selected. To learn
	 * what has been selected, call ChartWrapper.getChart().getSelection(). Note that this will only be thrown when the
	 * underlying chart type throws a selection event.
	 * 
	 * @param handler the select handler
	 * @return a reference for removing this handler
	 */
	// TODO expose getSelection()
	public final HandlerRef addSelectHandler(SelectHandler handler) {
		return addListener(SelectEvent.NAME, handler);
	}

	/**
	 * Returns a deep copy of the chart wrapper.
	 * 
	 * @return a deep copy of the ChartWrapper
	 */
	public final native ChartWrapper<?> cloneObject() /*-{
		this.clone();
	}-*/;

	/**
	 * Draws the chart. You must call this method after any changes that you make to the chart or data to show the
	 * changes.
	 */
	public final native void draw() /*-{
		this.draw();
	}-*/;

	/**
	 * Returns a reference to the chart created by this ChartWrapper, for example a google.visualization.BarChart or a
	 * google.visualization.ColumnChart. This will return null until after you have called draw() on the ChartWrapper
	 * object, and it throws a ready event. Methods called on the returned object will be reflected on the page.
	 * 
	 * @return a reference to the chart object
	 */
	public final native ChartObject getChart() /*-{
		return this.getChart();
	}-*/;

	/**
	 * Returns the chart name assigned by {@link #setChartName(String)}.
	 * 
	 * @return chart name
	 */
	public final native String getChartName() /*-{
		return this.getChartName();
	}-*/;

	/**
	 * The class name of the wrapped chart. If this is a Google chart, the name will not be qualified with
	 * google.visualization. So, for example, if this were a Treemap chart, it would return "Treemap" rather than
	 * "google.visualization.treemap".
	 * 
	 * @return class name of the wrapped chart
	 */
	public final native String getChartType() /*-{
		return this.getChartType();
	}-*/;

	/**
	 * The ID of the chart's DOM container element.
	 * 
	 * @return DOM container ID
	 */
	public final native String getContainerId() /*-{
		return this.getContainerId();
	}-*/;

	/**
	 * If this chart gets its data from a data source, returns the URL for this data source. Otherwise, returns null.
	 * 
	 * @return URL for this data source
	 */
	public final native String getDataSourceUrl() /*-{
		return this.getDataSourceUrl();
	}-*/;

	/**
	 * If this chart gets its data from a locally-defined DataTable, will return a reference to the chart's DataTable.
	 * If this chart gets its data from a data source, it will return null.
	 * Any changes that you make to the returned object will be reflected by the chart the next time you call
	 * {@link #draw()}.
	 * 
	 * @return a reference to the chart's DataTable
	 */

	public final native DataTable getDataTable() /*-{
		return this.getDataTable();
	}-*/;

	/**
	 * Returns the specified chart option value.
	 * 
	 * @param key The name of the option to retrieve. May be a qualified name, such as 'vAxis.title'
	 * @return the value specified by key
	 */
	public final native boolean getOptionBoolean(String key) /*-{
		return this.getOption(key);
	}-*/;

	/**
	 * Returns the specified chart option value.
	 * 
	 * @param key The name of the option to retrieve. May be a qualified name, such as 'vAxis.title'
	 * @return the value specified by key
	 */
	public final Date getOptionDate(String key) {
		JsDate jsDate = this.getOptionObject(key).cast();
		return DateHelper.getDate(jsDate);
	}

	/**
	 * Returns the specified chart option value.
	 * 
	 * @param key The name of the option to retrieve. May be a qualified name, such as 'vAxis.title'
	 * @return the value specified by key
	 */
	public final native double getOptionNumber(String key) /*-{
		return this.getOption(key);
	}-*/;

	/**
	 * Returns the specified chart option value.
	 * 
	 * @param key The name of the option to retrieve. May be a qualified name, such as 'vAxis.title'
	 * @return the value specified by key
	 */
	public final native JavaScriptObject getOptionObject(String key) /*-{
		return this.getOption(key);
	}-*/;

	/**
	 * Returns the specified chart option value.
	 * 
	 * @param key The name of the option to retrieve. May be a qualified name, such as 'vAxis.title'
	 * @return the value specified by key
	 */
	public final native String getOptionString(String key) /*-{
		return this.getOption(key);
	}-*/;

	/**
	 * Returns the specified chart option value.
	 * 
	 * @param key The name of the option to retrieve. May be a qualified name, such as 'vAxis.title'
	 * @param defaultValue If the specified value is undefined or null, this value will be returned.
	 * @return the value specified by key
	 */
	public final native boolean getOptionBoolean(String key, boolean defaultValue) /*-{
		return this.getOption(key, defaultValue);
	}-*/;

	/**
	 * Returns the specified chart option value.
	 * 
	 * @param key The name of the option to retrieve. May be a qualified name, such as 'vAxis.title'
	 * @param defaultValue If the specified value is undefined or null, this value will be returned.
	 * @return the value specified by key
	 */
	public final Date getOptionDate(String key, Date defaultValue) {
		JsDate jsDate = this.getOptionObject(key, DateHelper.getJsDate(defaultValue)).cast();
		return DateHelper.getDate(jsDate);
	}

	/**
	 * Returns the specified chart option value.
	 * 
	 * @param key The name of the option to retrieve. May be a qualified name, such as 'vAxis.title'
	 * @param defaultValue If the specified value is undefined or null, this value will be returned.
	 * @return the value specified by key
	 */
	public final native double getOptionNumber(String key, double defaultValue) /*-{
		return this.getOption(key, defaultValue);
	}-*/;

	/**
	 * Returns the specified chart option value.
	 * 
	 * @param key The name of the option to retrieve. May be a qualified name, such as 'vAxis.title'
	 * @param defaultValue If the specified value is undefined or null, this value will be returned.
	 * @return the value specified by key
	 */
	public final native JavaScriptObject getOptionObject(String key, JavaScriptObject defaultValue) /*-{
		return this.getOption(key, defaultValue);
	}-*/;

	/**
	 * Returns the specified chart option value.
	 * 
	 * @param key The name of the option to retrieve. May be a qualified name, such as 'vAxis.title'
	 * @param defaultValue If the specified value is undefined or null, this value will be returned.
	 * @return the value specified by key
	 */
	public final native String getOptionString(String key, String defaultValue) /*-{
		return this.getOption(key, defaultValue);
	}-*/;

	/**
	 * Returns the options object for this chart.
	 * 
	 * @return the options object for this chart
	 */
	public final native T getOptions() /*-{
		return this.getOptions();
	}-*/;

	/**
	 * The query string for this chart, if it has one and queries, a data source.
	 * 
	 * @return query string for this chart
	 */
	public final native String getQuery() /*-{
		return this.getQuery();
	}-*/;

	/**
	 * Any refresh interval for this chart, if it queries a data source. Zero indicates no refresh.
	 * 
	 * @return refresh interval in seconds
	 */
	public final native int getRefreshInterval() /*-{
		return this.getRefreshInterval();
	}-*/;

	/**
	 * Returns an array of DataView initializer objects.
	 * 
	 * @return an array of DataView initializer objects
	 */
	public final native JsArray<DataView> getViewArray() /*-{
		return this.getViewArray();
	}-*/;

	/**
	 * Returns the DataView initializer object.
	 * 
	 * @return the DataView initializer object
	 */
	public final native DataView getView() /*-{
		return this.getView();
	}-*/;

	/**
	 * Sets an arbitrary name for the chart. This is not shown anywhere on the chart, unless a custom chart is
	 * explicitly designed to use it.
	 * 
	 * @param chartName an arbitrary name for the chart
	 */
	public final native void setChartName(String chartName) /*-{
		this.setChartName(chartName);
	}-*/;

	/**
	 * Sets the chart type.
	 * 
	 * @param chartType the chart type to display
	 */
	public final void setChartType(ChartType chartType) {
		setChartType(chartType.getName());
	}

	/**
	 * Sets the ID of the containing DOM element for the chart.
	 * 
	 * @param containerId the DOM element ID
	 */
	public final native void setContainerId(String containerId) /*-{
		this.setContainerId(containerId);
	}-*/;

	/**
	 * Sets the URL of a data source to use for this chart. If you also set a data table for this object, the data
	 * source URL will be ignored.
	 * 
	 * @param url the URL of a data source to use for this chart
	 */
	public final native void setDataSourceUrl(String url) /*-{
		this.setDataSourceUrl(url);
	}-*/;

	/**
	 * Sets the DataTable for the chart.
	 * 
	 * @param dataTable the DataTable object for the chart
	 */
	public final native void setDataTable(DataTable dataTable) /*-{
		this.setDataTable(dataTable);
	}-*/;

	/**
	 * Sets the DataTable for the chart.
	 * 
	 * @param dataTable an array following the syntax of {@link ChartHelper#arrayToDataTable(JsArrayMixed)}
	 */
	public final native void setDataTable(JsArrayMixed dataTable) /*-{
		this.setDataTable(dataTable);
	}-*/;

	/**
	 * Sets the DataTable for the chart.
	 * 
	 * @param json a JSON representation of a DataTable
	 */
	public final native void setDataTable(String json) /*-{
		this.setDataTable(json);
	}-*/;

	/**
	 * Sets a single chart option value, where key is the option name and value is the value.
	 * To unset an option, call {@link #setOptionNull(String)}.
	 * 
	 * @param key may be a qualified name, such as 'vAxis.title'.
	 * @param value the value to set
	 */
	public final native void setOption(String key, boolean value) /*-{
		this.setOption(key, value);
	}-*/;

	/**
	 * Sets a single chart option value, where key is the option name and value is the value.
	 * To unset an option, call {@link #setOptionNull(String)}.
	 * 
	 * @param key may be a qualified name, such as 'vAxis.title'.
	 * @param value the value to set
	 */
	public final void setOption(String key, Date value) {
		this.setOption(key, DateHelper.getJsDate(value));
	}

	/**
	 * Sets a single chart option value, where key is the option name and value is the value.
	 * To unset an option, call {@link #setOptionNull(String)}.
	 * 
	 * @param key may be a qualified name, such as 'vAxis.title'.
	 * @param value the value to set
	 */
	public final native void setOption(String key, double value) /*-{
		this.setOption(key, value);
	}-*/;

	/**
	 * Sets a single chart option value, where key is the option name and value is the value.
	 * To unset an option, call {@link #setOptionNull(String)}.
	 * 
	 * @param key may be a qualified name, such as 'vAxis.title'.
	 * @param value the value to set
	 */
	public final native void setOption(String key, JavaScriptObject value) /*-{
		this.setOption(key, value);
	}-*/;

	/**
	 * Sets a single chart option value, where key is the option name and value is the value.
	 * To unset an option, call {@link #setOptionNull(String)}.
	 * 
	 * @param key may be a qualified name, such as 'vAxis.title'.
	 * @param value the value to set
	 */
	public final native void setOption(String key, String value) /*-{
		this.setOption(key, value);
	}-*/;

	/**
	 * Unsets an option
	 * 
	 * @param key the option key
	 */
	public final native void setOptionNull(String key) /*-{
		this.setOption(key);
	}-*/;

	/**
	 * Sets a complete options object for a chart.
	 * 
	 * @param options a complete options object
	 */
	public final native void setOptions(T options) /*-{
		this.setOptions(options);
	}-*/;

	/**
	 * Sets a query string, if this chart queries a data source. You must also set the data source URL if specifying
	 * this value.
	 * 
	 * @param query a data source query string
	 */
	public final native void setQuery(String query) /*-{
		this.setQuery(query);
	}-*/;

	/**
	 * Sets the refresh interval for this chart, if it queries a data source. You must also set a data source URL if
	 * specifying this value. Zero indicates no refresh.
	 * 
	 * @param refreshInterval refresh interval for this chart in seconds
	 */
	public final native void setRefreshInterval(int refreshInterval) /*-{
		this.setRefreshInterval(refreshInterval);
	}-*/;

	/**
	 * Sets a DataView initializer object, which acts as a filter over the underlying data. The chart wrapper must have
	 * underlying data from a DataTable or a data source to apply this view to. The first DataView in the array is
	 * applied to the underlying data to create a
	 * new data table, and the second DataView is applied to the data table resulting from application of the first
	 * DataView, and so on.
	 * 
	 * @param view an array of DataView initializer objects, like that returned by dataview.toJSON()
	 */
	public final native void setView(JsArrayString view) /*-{
		this.setView(view);
	}-*/;

	/**
	 * Sets a DataView initializer object, which acts as a filter over the underlying data. The chart wrapper must have
	 * underlying data from a DataTable or a data source to apply this view to.
	 * 
	 * @param view a DataView initializer object, like that returned by dataview.toJSON()
	 */
	public final native void setView(String view) /*-{
		this.setView(view);
	}-*/;

	/**
	 * Returns a string version of the JSON representation of the chart.
	 * 
	 * @return a JSON representation of the chart
	 */
	public final native String toJSON() /*-{
		this.toJSON();
	}-*/;

	private final native void setChartType(String chartType) /*-{
		this.setChartType(chartType);
	}-*/;
}
