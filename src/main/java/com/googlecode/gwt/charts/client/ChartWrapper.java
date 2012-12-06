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
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.RequiresResize;
import com.google.gwt.user.client.ui.Widget;

import com.googlecode.gwt.charts.client.event.ErrorHandler;
import com.googlecode.gwt.charts.client.event.EventHandler;
import com.googlecode.gwt.charts.client.event.HandlerRef;
import com.googlecode.gwt.charts.client.event.ReadyHandler;
import com.googlecode.gwt.charts.client.event.SelectHandler;
import com.googlecode.gwt.charts.client.options.Options;

import java.util.Date;

/**
 * A ChartWrapper class is used to wrap your chart and handle all loading, drawing, and Datasource querying for your
 * chart. The class exposes convenience methods for setting values on the chart and drawing it. This class simplifies
 * reading from a data source, because you do not have to create a query callback handler. You can also use it to save a
 * chart easily for reuse.
 * 
 * Another bonus of using ChartWrapper is that you can reduce the number of library loads by using dynamic loading.
 * Additionally, you don't need to load the JSAPI library explicitly, and ChartWrapperObject will handle looking up the
 * chart
 * libraries for you, so you do not need to specify any chart libraries in your loading statement. See the examples
 * below for details.
 * 
 * However, ChartWrapper currently only propagates a subset of events thrown by charts: select, ready, and error. Other
 * events are not transmitted through the ChartWrapper instance; to get other events, you must call getChart() and
 * subscribe to events directly on the chart handle.
 * 
 * Supports automatically resizing via {@link RequiresResize}, which means that all parents
 * must implement {@link com.google.gwt.user.client.ui.ProvidesResize} for this to work.
 * 
 * @param <T> the options this chart implements
 */
public class ChartWrapper<T extends Options> extends Widget implements RequiresResize {
	private ChartWrapperObject<T> chartWrapperObject;

	/**
	 * Creates a empty ChartWrapperObject instance.
	 * You must set all the appropriate properties using the set... methods exposed by this object.
	 */
	public ChartWrapper() {
		super();
		setElement(DOM.createDiv());
		chartWrapperObject = ChartWrapperObject.create();
		setContainerId(DOM.createUniqueId());
	}

	/**
	 * Creates a ChartWrapperObject instance with the provided properties.
	 * 
	 * @param chartWrapperSpec chart properties specification
	 */
	public ChartWrapper(ChartWrapperSpec<T> chartWrapperSpec) {
		super();
		setElement(DOM.createDiv());
		chartWrapperObject = ChartWrapperObject.create(chartWrapperSpec);
	}

	/**
	 * Fired when an error occurs when attempting to render the chart.
	 * 
	 * @param handler the error handler
	 * @return a reference for removing this handler
	 */
	public HandlerRef addErrorHandler(ErrorHandler handler) {
		return chartWrapperObject.addErrorHandler(handler);
	}

	/**
	 * Adds an event directly to the chart.
	 * Make sure the underlying chart supports the supplied event
	 * 
	 * @param handler the chart handler
	 * @return a reference for removing this handler
	 */
	public HandlerRef addHandler(EventHandler handler) {
		return chartWrapperObject.addHandler(handler);
	}

	/**
	 * The chart is ready for external method calls. If you want to interact with the chart, and call methods after you
	 * draw it, you should set up a listener for this event before you call the draw method, and call them only after
	 * the event was fired
	 * 
	 * @param handler the ready handler
	 * @return a reference for removing this handler
	 */
	public HandlerRef addReadyHandler(ReadyHandler handler) {
		return chartWrapperObject.addReadyHandler(handler);
	}

	/**
	 * Fired when the user clicks a bar or legend. When a chart element is selected, the corresponding cell in the data
	 * table is selected; when a legend is selected, the corresponding column in the data table is selected. To learn
	 * what has been selected, call getSelection(). Note that this will only be thrown
	 * when the
	 * underlying chart type throws a selection event.
	 * 
	 * @param handler the select handler
	 * @return a reference for removing this handler
	 */
	public HandlerRef addSelectHandler(SelectHandler handler) {
		return chartWrapperObject.addSelectHandler(handler);
	}

	/**
	 * Returns a deep copy of the chart wrapper.
	 * 
	 * @return a deep copy of the ChartWrapperObject
	 */
	public ChartWrapperObject<?> cloneObject() {
		return chartWrapperObject.cloneObject();
	}

	/**
	 * Draws the chart. You must call this method after any changes that you make to the chart or data to show the
	 * changes.
	 */
	public void draw() {
		chartWrapperObject.draw();
	}

	/**
	 * Returns a reference to the chart created by this ChartWrapperObject, for example a google.visualization.BarChart
	 * or a
	 * google.visualization.ColumnChart. This will return null until after you have called draw() on the
	 * ChartWrapperObject
	 * object, and it throws a ready event. Methods called on the returned object will be reflected on the page.
	 * 
	 * @return a reference to the chart object
	 */
	public ChartObject getChart() {
		return chartWrapperObject.getChart();
	}

	/**
	 * Returns the chart name assigned by {@link #setChartName(String)}.
	 * 
	 * @return chart name
	 */
	public String getChartName() {
		return chartWrapperObject.getChartName();
	}

	/**
	 * The class name of the wrapped chart. If this is a Google chart, the name will not be qualified with
	 * google.visualization. So, for example, if this were a Treemap chart, it would return "Treemap" rather than
	 * "google.visualization.treemap".
	 * 
	 * @return class name of the wrapped chart
	 */
	public String getChartType() {
		return chartWrapperObject.getChartType();
	}

	/**
	 * The ID of the chart's DOM container element.
	 * 
	 * @return DOM container ID
	 */
	public String getContainerId() {
		return chartWrapperObject.getContainerId();
	}

	/**
	 * If this chart gets its data from a data source, returns the URL for this data source. Otherwise, returns null.
	 * 
	 * @return URL for this data source
	 */
	public String getDataSourceUrl() {
		return chartWrapperObject.getDataSourceUrl();
	}

	/**
	 * If this chart gets its data from a locally-defined DataTable, will return a reference to the chart's DataTable.
	 * If this chart gets its data from a data source, it will return null.
	 * Any changes that you make to the returned object will be reflected by the chart the next time you call
	 * {@link #draw()}.
	 * 
	 * @return a reference to the chart's DataTable
	 */
	public DataTable getDataTable() {
		return chartWrapperObject.getDataTable();
	}

	/**
	 * Returns the underlying chart object.
	 * 
	 * @return the underlying chart object
	 */
	public ChartWrapperObject<T> getObject() {
		return chartWrapperObject;
	}

	/**
	 * Returns the specified chart option value.
	 * 
	 * @param key The name of the option to retrieve. May be a qualified name, such as 'vAxis.title'
	 * @return the value specified by key
	 */
	public boolean getOptionBoolean(String key) {
		return chartWrapperObject.getOptionBoolean(key);
	}

	/**
	 * Returns the specified chart option value.
	 * 
	 * @param key The name of the option to retrieve. May be a qualified name, such as 'vAxis.title'
	 * @param defaultValue If the specified value is undefined or null, this value will be returned.
	 * @return the value specified by key
	 */
	public boolean getOptionBoolean(String key, boolean defaultValue) {
		return chartWrapperObject.getOptionBoolean(key, defaultValue);
	}

	/**
	 * Returns the specified chart option value.
	 * 
	 * @param key The name of the option to retrieve. May be a qualified name, such as 'vAxis.title'
	 * @return the value specified by key
	 */
	public Date getOptionDate(String key) {
		return chartWrapperObject.getOptionDate(key);
	}

	/**
	 * Returns the specified chart option value.
	 * 
	 * @param key The name of the option to retrieve. May be a qualified name, such as 'vAxis.title'
	 * @param defaultValue If the specified value is undefined or null, this value will be returned.
	 * @return the value specified by key
	 */
	public Date getOptionDate(String key, Date defaultValue) {
		return chartWrapperObject.getOptionDate(key, defaultValue);
	}

	/**
	 * Returns the specified chart option value.
	 * 
	 * @param key The name of the option to retrieve. May be a qualified name, such as 'vAxis.title'
	 * @return the value specified by key
	 */
	public double getOptionNumber(String key) {
		return chartWrapperObject.getOptionNumber(key);
	}

	/**
	 * Returns the specified chart option value.
	 * 
	 * @param key The name of the option to retrieve. May be a qualified name, such as 'vAxis.title'
	 * @param defaultValue If the specified value is undefined or null, this value will be returned.
	 * @return the value specified by key
	 */
	public double getOptionNumber(String key, double defaultValue) {
		return chartWrapperObject.getOptionNumber(key, defaultValue);
	}

	/**
	 * Returns the specified chart option value.
	 * 
	 * @param key The name of the option to retrieve. May be a qualified name, such as 'vAxis.title'
	 * @return the value specified by key
	 */
	public JavaScriptObject getOptionObject(String key) {
		return chartWrapperObject.getOptionObject(key);
	}

	/**
	 * Returns the specified chart option value.
	 * 
	 * @param key The name of the option to retrieve. May be a qualified name, such as 'vAxis.title'
	 * @param defaultValue If the specified value is undefined or null, this value will be returned.
	 * @return the value specified by key
	 */
	public JavaScriptObject getOptionObject(String key, JavaScriptObject defaultValue) {
		return chartWrapperObject.getOptionObject(key, defaultValue);
	}

	/**
	 * Returns the options object for this chart.
	 * 
	 * @return the options object for this chart
	 */
	public T getOptions() {
		return chartWrapperObject.getOptions();
	}

	/**
	 * Returns the specified chart option value.
	 * 
	 * @param key The name of the option to retrieve. May be a qualified name, such as 'vAxis.title'
	 * @return the value specified by key
	 */
	public String getOptionString(String key) {
		return chartWrapperObject.getOptionString(key);
	}

	/**
	 * Returns the specified chart option value.
	 * 
	 * @param key The name of the option to retrieve. May be a qualified name, such as 'vAxis.title'
	 * @param defaultValue If the specified value is undefined or null, this value will be returned.
	 * @return the value specified by key
	 */
	public String getOptionString(String key, String defaultValue) {
		return chartWrapperObject.getOptionString(key, defaultValue);
	}

	/**
	 * The query string for this chart, if it has one and queries, a data source.
	 * 
	 * @return query string for this chart
	 */
	public String getQuery() {
		return chartWrapperObject.getQuery();
	}

	/**
	 * Any refresh interval for this chart, if it queries a data source. Zero indicates no refresh.
	 * 
	 * @return refresh interval in seconds
	 */
	public int getRefreshInterval() {
		return chartWrapperObject.getRefreshInterval();
	}

	/**
	 * Returns an array of selected objects, each one describing a data element in the underlying table used to create
	 * the
	 * visualization (a DataView or a DataTable). Each object has properties row and/or column, with the index of the
	 * row and/or column of the selected item in the underlying DataTable. If the row property is null, then the
	 * selection is a column; if the column property is null, then the selection is a row; if both are non-null, then it
	 * is a specific data item. You can call the DataTable.getValue() method to get the value of the selected item. The
	 * retrieved array can be passed into setSelection().
	 * 
	 * @return an array of selected objects
	 */
	public JsArray<Selection> getSelection() {
		return chartWrapperObject.getSelection();
	}

	/**
	 * Returns the DataView initializer object.
	 * 
	 * @return the DataView initializer object
	 */
	public DataView getView() {
		return chartWrapperObject.getView();
	}

	/**
	 * Returns an array of DataView initializer objects.
	 * 
	 * @return an array of DataView initializer objects
	 */
	public JsArray<DataView> getViewArray() {
		return chartWrapperObject.getViewArray();
	}

	@Override
	public void onResize() {
		if (chartWrapperObject.getChart() != null) {
			draw();
		}
	}

	/**
	 * Unregister all event handlers.
	 */
	public void removeAllHandlers() {
		chartWrapperObject.removeAllListeners();
	}

	/**
	 * Unregister an existing event handlers.
	 * 
	 * @param handlerRef event handler reference
	 */
	public void removeHandler(HandlerRef handlerRef) {
		chartWrapperObject.removeListener(handlerRef);
	}

	/**
	 * Sets an arbitrary name for the chart. This is not shown anywhere on the chart, unless a custom chart is
	 * explicitly designed to use it.
	 * 
	 * @param chartName an arbitrary name for the chart
	 */
	public void setChartName(String chartName) {
		chartWrapperObject.setChartName(chartName);
	}

	/**
	 * Sets the chart type.
	 * 
	 * @param chartType the chart type to display
	 */
	public void setChartType(ChartType chartType) {
		chartWrapperObject.setChartType(chartType);
	}

	/**
	 * Sets the ID of the containing DOM element for the chart.
	 * 
	 * @param containerId the DOM element ID
	 */
	public void setContainerId(String containerId) {
		getElement().setId(containerId);
		chartWrapperObject.setContainerId(containerId);
	}

	/**
	 * Sets the URL of a data source to use for this chart. If you also set a data table for this object, the data
	 * source URL will be ignored.
	 * 
	 * @param url the URL of a data source to use for this chart
	 */
	public void setDataSourceUrl(String url) {
		chartWrapperObject.setDataSourceUrl(url);
	}

	/**
	 * Sets the DataTable for the chart.
	 * 
	 * @param dataTable the DataTable object for the chart
	 */
	public void setDataTable(DataTable dataTable) {
		chartWrapperObject.setDataTable(dataTable);
	}

	/**
	 * Sets the DataTable for the chart.
	 * 
	 * @param dataTable an array following the syntax of
	 *        {@link com.googlecode.gwt.charts.client.util.ChartHelper#arrayToDataTable(JsArrayMixed)}
	 */
	public void setDataTable(JsArrayMixed dataTable) {
		chartWrapperObject.setDataTable(dataTable);
	}

	/**
	 * Sets the DataTable for the chart.
	 * 
	 * @param json a JSON representation of a DataTable
	 */
	public void setDataTable(String json) {
		chartWrapperObject.setDataTable(json);
	}

	/**
	 * Sets a single chart option value, where key is the option name and value is the value. To unset an option, pass
	 * in null for the value. Note that key may be a qualified name, such as 'vAxis.title'.
	 * 
	 * @param key
	 * @param value
	 */
	public void setOption(String key, boolean value) {
		chartWrapperObject.setOption(key, value);
	}

	/**
	 * Sets a single chart option value, where key is the option name and value is the value.
	 * To unset an option, call {@link #setOptionNull(String)}.
	 * 
	 * @param key may be a qualified name, such as 'vAxis.title'.
	 * @param value the value to set
	 */
	public void setOption(String key, Date value) {
		chartWrapperObject.setOption(key, value);
	}

	/**
	 * Sets a single chart option value, where key is the option name and value is the value.
	 * To unset an option, call {@link #setOptionNull(String)}.
	 * 
	 * @param key may be a qualified name, such as 'vAxis.title'.
	 * @param value the value to set
	 */
	public void setOption(String key, double value) {
		chartWrapperObject.setOption(key, value);
	}

	/**
	 * Sets a single chart option value, where key is the option name and value is the value.
	 * To unset an option, call {@link #setOptionNull(String)}.
	 * 
	 * @param key may be a qualified name, such as 'vAxis.title'.
	 * @param value the value to set
	 */
	public void setOption(String key, JavaScriptObject value) {
		chartWrapperObject.setOption(key, value);
	}

	/**
	 * Sets a single chart option value, where key is the option name and value is the value.
	 * To unset an option, call {@link #setOptionNull(String)}.
	 * 
	 * @param key may be a qualified name, such as 'vAxis.title'.
	 * @param value the value to set
	 */
	public void setOption(String key, String value) {
		chartWrapperObject.setOption(key, value);
	}

	/**
	 * Unsets an option
	 * 
	 * @param key the option key
	 */
	public void setOptionNull(String key) {
		chartWrapperObject.setOptionNull(key);
	}

	/**
	 * Sets a complete options object for a chart.
	 * 
	 * @param options a complete options object
	 */
	public void setOptions(T options) {
		chartWrapperObject.setOptions(options);
	}

	/**
	 * Sets a query string, if this chart queries a data source. You must also set the data source URL if specifying
	 * this value.
	 * 
	 * @param query a data source query string
	 */
	public void setQuery(String query) {
		chartWrapperObject.setQuery(query);
	}

	/**
	 * Sets the refresh interval for this chart, if it queries a data source. You must also set a data source URL if
	 * specifying this value. Zero indicates no refresh.
	 * 
	 * @param refreshInterval refresh interval for this chart in seconds
	 */
	public void setRefreshInterval(int refreshInterval) {
		chartWrapperObject.setRefreshInterval(refreshInterval);
	}

	/**
	 * Selects a data entry in the visualization—for example, a point in an area chart, or a bar in a bar chart. When
	 * this method is called, the visualization should visually indicate what the new selection is. The implementation
	 * of setSelection() should not fire a "select" event. Visualizations may ignore part of the selection. For example,
	 * a table that can show only selected rows may ignore cell or column elements in its setSelection() implementation,
	 * or it can select the entire row.
	 * 
	 * Every time this method is called, all selected items are deselected, and the new selection list passed in should
	 * be applied. There is no explicit way to deselect individual items; to deselect individual items, call
	 * setSelection() with the items to remain selected; to deselect all elements, call setSelection(),
	 * setSelection(null), or setSelection([]).
	 * 
	 * @param selection
	 */
	public void setSelection(JsArray<Selection> selection) {
		chartWrapperObject.setSelection(selection);
	}

	/**
	 * Sets a DataView initializer object, which acts as a filter over the underlying data. The chart wrapper must have
	 * underlying data from a DataTable or a data source to apply this view to. The first DataView in the array is
	 * applied to the underlying data to create a
	 * new data table, and the second DataView is applied to the data table resulting from application of the first
	 * DataView, and so on.
	 * 
	 * @param view an array of DataView initializer objects, like that returned by dataview.toJSON()
	 */

	public void setView(JsArrayString view) {
		chartWrapperObject.setView(view);
	}

	/**
	 * Sets a DataView initializer object, which acts as a filter over the underlying data. The chart wrapper must have
	 * underlying data from a DataTable or a data source to apply this view to.
	 * 
	 * @param view a DataView initializer object, like that returned by dataview.toJSON()
	 */
	public void setView(String view) {
		chartWrapperObject.setView(view);
	}

	/**
	 * Returns a string version of the JSON representation of the chart.
	 * 
	 * @return a JSON representation of the chart
	 */
	public String toJSON() {
		return chartWrapperObject.toJSON();
	}

	/**
	 * Call this method to fire an event with an arbitrary name and set of values.
	 * 
	 * @param eventName A string name to call the event. You can choose any string value that you want.
	 * @param properties A map of name/value pairs to pass to the receiving method.
	 */
	public void trigger(String eventName, Properties properties) {
		chartWrapperObject.trigger(eventName, properties);
	}
}
