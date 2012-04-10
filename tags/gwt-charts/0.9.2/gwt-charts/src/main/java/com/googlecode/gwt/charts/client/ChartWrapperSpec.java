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
import com.google.gwt.core.client.JsArrayString;

import com.googlecode.gwt.charts.client.options.Options;

public class ChartWrapperSpec<T extends Options> extends JavaScriptObject {
	public static ChartWrapperSpec<?> create(ChartType chartType, String containerId) {
		ChartWrapperSpec<?> chartWrapperSpec = createObject().cast();
		chartWrapperSpec.setChartType(chartType);
		chartWrapperSpec.setContainerId(containerId);
		return chartWrapperSpec;
	}

	protected ChartWrapperSpec() {
	}

	public final void setChartType(ChartType chartType) {
		setChartType(chartType.getName());
	}

	public final native void setContainerId(String containerId) /*-{
		this.containerId = containerId;
	}-*/;

	public final native void setDataSourceUrl(String dataSourceUrl) /*-{
		this.dataSourceUrl = dataSourceUrl;
	}-*/;

	public final native void setDataTable(DataTable dataTable) /*-{
		this.dataTable = dataTable;
	}-*/;

	public final native void setOptions(T options) /*-{
		this.options = options;
	}-*/;

	public final native void setQuery(String query) /*-{
		this.query = query;
	}-*/;

	public final native void setRefreshInterval(int refreshInterval) /*-{
		this.refreshInterval = refreshInterval;
	}-*/;

	public final native void setView(JsArrayString view) /*-{
		this.view = view;
	}-*/;

	public final native void setView(String view) /*-{
		this.view = view;
	}-*/;

	private final native void setChartType(String chartType) /*-{
		this.controlType = controlType;
	}-*/;
}
