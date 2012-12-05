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
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Widget;

import com.googlecode.gwt.charts.client.ChartWrapper;
import com.googlecode.gwt.charts.client.ChartWrapperObject;
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
public class Dashboard extends Widget {
	private DashboardObject dashboardObject;
	private Object data;
	private boolean pending;

	/**
	 * Creates a Dashboard
	 */
	public Dashboard() {
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
	public HandlerRef addErrorHandler(ErrorHandler handler) {
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
	public HandlerRef addReadyHandler(ReadyHandler handler) {
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
	public void bind(ControlWrapper<?, ?> controlWrapper, ChartWrapper<?> chartWrapper) {
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
	public void bind(List<ControlWrapper<?, ?>> controlWrappers, List<ChartWrapper<?>> chartWrappers) {
		JsArray<ControlWrapperObject<?, ?>> controlWrapperArray = JsArray.createArray().cast();
		for (ControlWrapper<?, ?> controlWrapper : controlWrappers) {
			controlWrapperArray.push(controlWrapper.getObject());
		}
		JsArray<ChartWrapperObject<?>> chartWrapperArray = JsArray.createArray().cast();
		for (ChartWrapper<?> chartWrapper : chartWrappers) {
			chartWrapperArray.push(chartWrapper.getObject());
		}
		dashboardObject.bind(controlWrapperArray, chartWrapperArray);
	}

	/**
	 * Draws the dashboard.
	 * 
	 * @param dataSource a DataTable or a DataView object
	 */
	public void draw(DataSource dataSource) {
		this.data = dataSource;
		redraw();
	}

	/**
	 * Draws the dashboard.
	 * 
	 * @param dataArray an array following the syntax of {@link ChartHelper#arrayToDataTable(JsArrayMixed)}
	 */
	public void draw(JsArrayMixed dataArray) {
		this.data = dataArray;
		dashboardObject.draw(dataArray);
	}

	/**
	 * Draws the dashboard.
	 * 
	 * @param json a JSON representation of a DataTable
	 */
	public void draw(String json) {
		this.data = json;
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
	
	/**
	 * Redraws the chart with last used data and options.
	 */
	public void redraw() {
		if (pending) {
			return;
		}
		pending = true;
		// Double deferred command because of layout issues
		Scheduler.get().scheduleDeferred(new Scheduler.ScheduledCommand() {

			@Override
			public void execute() {
				Scheduler.get().scheduleDeferred(new Scheduler.ScheduledCommand() {

					@Override
					public void execute() {
						redrawNow();
					}
				});
			}
		});
	}
	
	protected void redrawNow() {
		if (data instanceof DataSource) {
			dashboardObject.draw((DataSource)data);
		} else if (data instanceof JsArrayMixed) {
			dashboardObject.draw((JsArrayMixed)data);
		} else if (data instanceof String) {
			dashboardObject.draw((String)data);
		}
		pending = false;
	}
}
