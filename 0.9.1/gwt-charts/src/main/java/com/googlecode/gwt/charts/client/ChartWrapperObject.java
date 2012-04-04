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

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayMixed;
import com.google.gwt.core.client.JsArrayString;

import com.googlecode.gwt.charts.client.event.ErrorEvent;
import com.googlecode.gwt.charts.client.event.ErrorHandler;
import com.googlecode.gwt.charts.client.event.HandlerRef;
import com.googlecode.gwt.charts.client.event.ReadyEvent;
import com.googlecode.gwt.charts.client.event.ReadyHandler;
import com.googlecode.gwt.charts.client.event.SelectEvent;
import com.googlecode.gwt.charts.client.event.SelectHandler;
import com.googlecode.gwt.charts.client.options.Options;

public class ChartWrapperObject<T extends Options> extends HasListeners {
	public static native <T extends Options> ChartWrapperObject<T> create() /*-{
		return new $wnd.google.visualization.ChartWrapper();
	}-*/;

	protected ChartWrapperObject() {
		// Default constructor
	}

	public final HandlerRef addErrorHandler(ErrorHandler handler) {
		return addListener(ErrorEvent.NAME, handler);
	}

	public final HandlerRef addReadyHandler(ReadyHandler handler) {
		return addListener(ReadyEvent.NAME, handler);
	}

	public final HandlerRef addSelectHandler(SelectHandler handler) {
		return addListener(SelectEvent.NAME, handler);
	}

	public final native ChartWrapperObject<?> cloneObject() /*-{
		this.clone();
	}-*/;

	public final native void draw() /*-{
		this.draw();
	}-*/;

	public final native ChartObject getChart() /*-{
		return this.getChart();
	}-*/;

	public final native String getChartName() /*-{
		return this.getChartName();
	}-*/;

	public final native String getChartType() /*-{
		return this.getChartType();
	}-*/;

	public final native String getContainerId() /*-{
		return this.getContainerId();
	}-*/;

	public final native String getDataSourceUrl() /*-{
		return this.getDataSourceUrl();
	}-*/;

	public final native DataTable getDataTable() /*-{
		return this.getDataTable();
	}-*/;

	public final native String getOption(String key) /*-{
		return this.getOption(key);
	}-*/;

	public final native String getOption(String key, String defaultValue) /*-{
		return this.getOption(key, defaultValue);
	}-*/;

	public final native T getOptions() /*-{
		return this.getOptions();
	}-*/;

	public final native String getQuery() /*-{
		return this.getQuery();
	}-*/;

	public final native int getRefreshInterval() /*-{
		return this.getRefreshInterval();
	}-*/;

	public final native JsArray<DataView> getViewArray() /*-{
		return this.getView();
	}-*/;

	public final native DataView getViewData() /*-{
		return this.getView();
	}-*/;

	public final native String getViewString() /*-{
		return this.getView();
	}-*/;

	public final native void setChartName(String chartName) /*-{
		this.setChartName(chartName);
	}-*/;

	public final void setChartType(ChartType chartType) {
		setChartType(chartType.getName());
	}

	public final native void setContainerId(String containerId) /*-{
		this.setContainerId(containerId);
	}-*/;

	public final native void setDataSourceUrl(String url) /*-{
		this.setDataSourceUrl(url);
	}-*/;

	public final native void setDataTable(DataTable dataTable) /*-{
		this.setDataTable(dataTable);
	}-*/;

	public final native void setDataTable(JsArrayMixed dataTable) /*-{
		this.setDataTable(dataTable);
	}-*/;

	public final native void setDataTable(String json) /*-{
		this.setDataTable(json);
	}-*/;

	public final native void setOption(String key, String value) /*-{
		return this.setOption(key, value);
	}-*/;

	public final native void setOptions(T options) /*-{
		return this.setOptions(options);
	}-*/;

	public final native void setQuery(String query) /*-{
		return this.setQuery(query);
	}-*/;

	public final native void setRefreshInterval(int refreshInterval) /*-{
		return this.setRefreshInterval(refreshInterval);
	}-*/;

	public final native void setView(JsArrayString view) /*-{
		return this.setView(view);
	}-*/;

	public final native void setView(String view) /*-{
		return this.setView(view);
	}-*/;

	public final native String toJSON() /*-{
		this.toJSON();
	}-*/;

	private final native void setChartType(String chartType) /*-{
		this.setChartType(chartType);
	}-*/;
}
