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
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.RequiresResize;
import com.google.gwt.user.client.ui.Widget;

import com.googlecode.gwt.charts.client.event.ErrorHandler;
import com.googlecode.gwt.charts.client.event.HandlerRef;
import com.googlecode.gwt.charts.client.event.ReadyHandler;
import com.googlecode.gwt.charts.client.event.SelectHandler;
import com.googlecode.gwt.charts.client.options.Options;

public class ChartWrapper<T extends Options> extends Widget implements RequiresResize {
	private ChartWrapperObject<T> chartWrapperObject;

	public ChartWrapper() {
		super();
		setElement(DOM.createDiv());
		chartWrapperObject = ChartWrapperObject.create();
	}

	public final HandlerRef addErrorHandler(ErrorHandler handler) {
		return chartWrapperObject.addErrorHandler(handler);
	}

	public final HandlerRef addReadyHandler(ReadyHandler handler) {
		return chartWrapperObject.addReadyHandler(handler);
	}

	public final HandlerRef addSelectHandler(SelectHandler handler) {
		return chartWrapperObject.addSelectHandler(handler);
	}

	public final ChartWrapperObject<?> cloneObject() {
		return chartWrapperObject.cloneObject();
	}

	public final void draw() {
		chartWrapperObject.draw();
	}

	public final ChartObject getChart() {
		return chartWrapperObject.getChart();
	}

	public final String getChartName() {
		return chartWrapperObject.getChartName();
	}

	public final String getChartType() {
		return chartWrapperObject.getChartType();
	}

	public final String getContainerId() {
		return chartWrapperObject.getContainerId();
	}

	public final String getDataSourceUrl() {
		return chartWrapperObject.getDataSourceUrl();
	}

	public final DataTable getDataTable() {
		return chartWrapperObject.getDataTable();
	}

	public ChartWrapperObject<T> getObject() {
		return chartWrapperObject;
	}

	public final String getOption(String key) {
		return chartWrapperObject.getOption(key);
	}

	public final String getOption(String key, String defaultValue) {
		return chartWrapperObject.getOption(key, defaultValue);
	}

	public final T getOptions() {
		return chartWrapperObject.getOptions();
	}

	public final String getQuery() {
		return chartWrapperObject.getQuery();
	}

	public final int getRefreshInterval() {
		return chartWrapperObject.getRefreshInterval();
	}

	public final JsArray<DataView> getViewArray() {
		return chartWrapperObject.getViewArray();
	}

	public final DataView getViewData() {
		return chartWrapperObject.getViewData();
	}

	public final String getViewString() {
		return chartWrapperObject.getViewString();
	}

	@Override
	public void onResize() {
		draw();
	}

	public final void removeAllHandlers() {
		chartWrapperObject.removeAllListeners();
	}

	public final void removeHandler(HandlerRef handlerRef) {
		chartWrapperObject.removeListener(handlerRef);
	}

	public final void setChartName(String chartName) {
		chartWrapperObject.setChartName(chartName);
	}

	public final void setChartType(ChartType chartType) {
		chartWrapperObject.setChartType(chartType);
	}

	public final void setContainerId(String containerId) {
		getElement().setId(containerId);
		chartWrapperObject.setContainerId(containerId);
	}

	public final void setDataSourceUrl(String url) {
		chartWrapperObject.setDataSourceUrl(url);
	}

	public final void setDataTable(DataTable dataTable) {
		chartWrapperObject.setDataTable(dataTable);
	}

	public final void setDataTable(JsArrayMixed dataTable) {
		chartWrapperObject.setDataTable(dataTable);
	}

	public final void setDataTable(String json) {
		chartWrapperObject.setDataTable(json);
	}

	public final void setOption(String key, String value) {
		chartWrapperObject.setOption(key, value);
	}

	public final void setOptions(T options) {
		chartWrapperObject.setOptions(options);
	}

	public final void setQuery(String query) {
		chartWrapperObject.setQuery(query);
	}

	public final void setRefreshInterval(int refreshInterval) {
		chartWrapperObject.setRefreshInterval(refreshInterval);
	}

	public final void setView(JsArrayString view) {
		chartWrapperObject.setView(view);
	}

	public final void setView(String view) {
		chartWrapperObject.setView(view);
	}

	public final String toJSON() {
		return chartWrapperObject.toJSON();
	}
	
	public final void trigger(String eventName, Properties properties) {
		chartWrapperObject.trigger(eventName, properties);
	}
}
