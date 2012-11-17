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
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Widget;

import com.googlecode.gwt.charts.client.ChartWrapperObject;
import com.googlecode.gwt.charts.client.ChartWrapperWidget;
import com.googlecode.gwt.charts.client.DataSource;
import com.googlecode.gwt.charts.client.event.ErrorEvent;
import com.googlecode.gwt.charts.client.event.ErrorHandler;
import com.googlecode.gwt.charts.client.event.HandlerRef;
import com.googlecode.gwt.charts.client.event.ReadyEvent;
import com.googlecode.gwt.charts.client.event.ReadyHandler;
import com.googlecode.gwt.charts.client.util.ChartHelper;

import java.util.List;

/**
 * Represents a collection of collaborating controls and charts that share the same underlying data.
 */
public class DashboardWidget extends Widget {
	private DashboardObject dashboardObject;

	/**
	 * Creates a DashboardWidget
	 */
	public DashboardWidget() {
		super();
		Element dashboardDiv = DOM.createDiv();
		dashboardObject = DashboardObject.create(dashboardDiv);
		setElement(dashboardDiv);
	}

	/**
	 * Fired when an error occurs when attempting to render the dashboard. One or more of the controls and charts that
	 * are part of the dashboard may have failed rendering.
	 * 
	 * @param handler the error handler
	 * @return a reference for removing this handler
	 */
	public final HandlerRef addErrorHandler(ErrorHandler handler) {
		return dashboardObject.addListener(ErrorEvent.NAME, handler);
	}

	/**
	 * The dashboard has completed drawing and is ready to accept changes. All the controls and charts that are part of
	 * the dashboard are ready for external method call and user interaction. If you want to change the dashboard (or
	 * the data it displays) after you draw it, you should set up a listener for this event before you call the draw
	 * method, and then apply your changes only after the event was fired.
	 * 
	 * The ready event will also fire:
	 * 
	 * after the completion of a dashboard refresh triggered by a user or programmatic interaction with one of the
	 * controls,
	 * after a programmatic call to the draw() method of any chart part of the dashboard.
	 * 
	 * @param handler the ready handler
	 * @return a reference for removing this handler
	 */
	public final HandlerRef addReadyHandler(ReadyHandler handler) {
		return dashboardObject.addListener(ReadyEvent.NAME, handler);
	}

	/**
	 * Binds one Control to a dashboard participant (either a chart or other control), so that
	 * all of the latter are redrawn whenever any of the former collects a programmatic or user interaction that affects
	 * the data managed by the dashboard. Returns the dashboard instance itself for chaining multiple bind() calls
	 * together.
	 * 
	 * @param controlWrapper
	 * @param chartWrapper
	 */
	public final void bind(ControlWrapperWidget<?, ?> controlWrapper, ChartWrapperWidget<?> chartWrapper) {
		dashboardObject.bind(controlWrapper.getObject(), chartWrapper.getObject());
	}

	/**
	 * Binds one or more Controls to one or more other dashboard participants (either charts or other controls), so
	 * that all of the latter are redrawn whenever any of the former collects a programmatic or user interaction that
	 * affects the data managed by the dashboard. Returns the dashboard instance itself for chaining multiple bind()
	 * calls together.
	 * 
	 * @param controlWrappers
	 * @param chartWrappers
	 */
	public final void bind(List<ControlWrapperWidget<?, ?>> controlWrappers, List<ChartWrapperWidget<?>> chartWrappers) {
		JsArray<ControlWrapperObject<?, ?>> controlWrapperArray = JsArray.createArray().cast();
		for (ControlWrapperWidget<?, ?> controlWrapper : controlWrappers) {
			controlWrapperArray.push(controlWrapper.getObject());
		}
		JsArray<ChartWrapperObject<?>> chartWrapperArray = JsArray.createArray().cast();
		for (ChartWrapperWidget<?> chartWrapper : chartWrappers) {
			chartWrapperArray.push(chartWrapper.getObject());
		}
		dashboardObject.bind(controlWrapperArray, chartWrapperArray);
	}

	/**
	 * Draws the dashboard.
	 * 
	 * @param dataSource a DataTable or a DataView object
	 */
	public final void draw(DataSource dataSource) {
		dashboardObject.draw(dataSource);
	}

	/**
	 * Draws the dashboard.
	 * 
	 * @param dataArray an array following the syntax of {@link ChartHelper#arrayToDataTable(JsArrayMixed)}
	 */
	public final void draw(JsArrayMixed dataArray) {
		dashboardObject.draw(dataArray);
	}

	/**
	 * Draws the dashboard.
	 * 
	 * @param json a JSON representation of a DataTable
	 */
	public final void draw(String json) {
		dashboardObject.draw(json);
	}

	/**
	 * Returns the underlying dashboard object.
	 * 
	 * @return the underlying dashboard object
	 */
	public DashboardObject getObject() {
		return dashboardObject;
	}
}
