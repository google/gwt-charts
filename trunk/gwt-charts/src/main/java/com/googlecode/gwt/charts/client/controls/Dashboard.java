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

import java.util.List;

public class Dashboard extends Widget {

	private DashboardObject dashboardObject;

	public Dashboard() {
		super();
		Element dashboardDiv = DOM.createDiv();
		dashboardObject = DashboardObject.create(dashboardDiv);
		setElement(dashboardDiv);
	}

	public final HandlerRef addErrorHandler(ErrorHandler handler) {
		return dashboardObject.addListener(ErrorEvent.NAME, handler);
	}

	public final HandlerRef addReadyHandler(ReadyHandler handler) {
		return dashboardObject.addListener(ReadyEvent.NAME, handler);
	}

	public final void bind(ControlWrapperObject<?> controlWrapper, ChartWrapperObject<?> chartWrapper) {
		dashboardObject.bind(controlWrapper, chartWrapper);
	}

	public final void bind(List<ControlWrapper<?>> controlWrappers,
			List<ChartWrapperWidget<?>> chartWrappers) {
		JsArray<ControlWrapperObject<?>> controlArray = JsArray.createArray().cast();
		for (ControlWrapper<?> controlWrapper : controlWrappers) {
			controlWrapper.setContainerId(DOM.createUniqueId());
			controlArray.push(controlWrapper.getObject());
		}
		JsArray<ChartWrapperObject<?>> chartArray = JsArray.createArray().cast();
		for (ChartWrapperWidget<?> chartWrapper : chartWrappers) {
			chartWrapper.setContainerId(DOM.createUniqueId());
			chartArray.push(chartWrapper.getObject());
		}
		dashboardObject.bind(controlArray, chartArray);
	}

	public final void draw(DataSource data) {
		dashboardObject.draw(data);
	}

}
