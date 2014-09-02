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
package com.googlecode.gwt.charts.client.controls;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayMixed;
import com.google.gwt.dom.client.Element;

import com.googlecode.gwt.charts.client.ChartWrapperObject;
import com.googlecode.gwt.charts.client.DataSource;
import com.googlecode.gwt.charts.client.HasListeners;
import com.googlecode.gwt.charts.client.util.ChartHelper;

/**
 * Represents a collection of collaborating controls and charts that share the same underlying data.
 */
public class DashboardObject extends HasListeners {

	/**
	 * Creates a new DashboardObject.
	 * 
	 * @param container A reference to a valid container element on the page that will hold the dashboard contents.
	 * @return a new DashboardObject
	 */
	public static native DashboardObject create(Element container) /*-{
		return new $wnd.google.visualization.Dashboard(container);
	}-*/;

	protected DashboardObject() {
	}

	/**
	 * Binds one Control to a dashboard participant (either a chart or other control), so that
	 * all of the latter are redrawn whenever any of the former collects a programmatic or user interaction that affects
	 * the data managed by the dashboard.
	 * 
	 * @param controlWrapper
	 * @param chartWrapper
	 * @return the dashboard instance itself for chaining multiple bind() calls together.
	 */
	public final native DashboardObject bind(ControlWrapperObject<?, ?> controlWrapper, ChartWrapperObject<?> chartWrapper) /*-{
		return this.bind(controlWrapper, chartWrapper);
	}-*/;

	/**
	 * Binds one or more Controls to one or more other dashboard participants (either charts or other controls), so
	 * that all of the latter are redrawn whenever any of the former collects a programmatic or user interaction that
	 * affects the data managed by the dashboard. Returns the dashboard instance itself for chaining multiple bind()
	 * calls together.
	 * 
	 * @param controlWrappers
	 * @param chartWrappers
	 * @return the dashboard instance itself for chaining multiple bind() calls together.
	 */
	public final native DashboardObject bind(JsArray<ControlWrapperObject<?, ?>> controlWrappers,
			JsArray<ChartWrapperObject<?>> chartWrappers) /*-{
		return this.bind(controlWrappers, chartWrappers);
	}-*/;

	/**
	 * Draws the dashboard.
	 * @param dataSource a DataTable or a DataView object
	 */
	public final native void draw(DataSource dataSource) /*-{
		this.draw(dataSource);
	}-*/;

	/**
	 * Draws the dashboard.
	 * @param dataArray an array following the syntax of {@link ChartHelper#arrayToDataTable(JsArrayMixed)}
	 */
	public final native void draw(JsArrayMixed dataArray) /*-{
		this.draw(dataArray);
	}-*/;

	/**
	 * Draws the dashboard.
	 * @param json a JSON representation of a DataTable
	 */
	public final native void draw(String json) /*-{
		this.draw(json);
	}-*/;
}
