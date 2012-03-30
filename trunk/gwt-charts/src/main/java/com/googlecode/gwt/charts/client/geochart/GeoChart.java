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
package com.googlecode.gwt.charts.client.geochart;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Widget;

import com.googlecode.gwt.charts.client.ChartObject;
import com.googlecode.gwt.charts.client.DataSource;
import com.googlecode.gwt.charts.client.Selection;
import com.googlecode.gwt.charts.client.event.ErrorEvent;
import com.googlecode.gwt.charts.client.event.ErrorHandler;
import com.googlecode.gwt.charts.client.event.EventHandler;
import com.googlecode.gwt.charts.client.event.HandlerRef;
import com.googlecode.gwt.charts.client.event.ReadyEvent;
import com.googlecode.gwt.charts.client.event.ReadyHandler;
import com.googlecode.gwt.charts.client.event.RegionClickEvent;
import com.googlecode.gwt.charts.client.event.RegionClickHandler;
import com.googlecode.gwt.charts.client.event.SelectEvent;
import com.googlecode.gwt.charts.client.event.SelectHandler;

public class GeoChart extends Widget {
	protected ChartObject chartObject;

	public GeoChart() {
		super();
		Element chartDiv = DOM.createDiv();
		chartObject = createChartObject(chartDiv);
		setElement(chartDiv);
	}

	public final HandlerRef addErrorHandler(ErrorHandler handler) {
		return addHandler(handler, ErrorEvent.NAME);
	}

	public final HandlerRef addReadyHandler(ReadyHandler handler) {
		return addHandler(handler, ReadyEvent.NAME);
	}

	public final HandlerRef addRegionClickHandler(RegionClickHandler handler) {
		return addHandler(handler, RegionClickEvent.NAME);
	}

	public final HandlerRef addSelectHandler(SelectHandler handler) {
		return addHandler(handler, SelectEvent.NAME);
	}

	public final void clearChart() {
		chartObject.clearChart();
	}

	public final void draw(DataSource data) {
		chartObject.draw(data);
	}

	public final void draw(DataSource data, GeoChartOptions options) {
		chartObject.draw(data, options);
	}

	public final JsArray<Selection> getSelection() {
		return chartObject.getSelection();
	}

	public final void setSelection(JsArray<Selection> selection) {
		chartObject.setSelection(selection);
	}

	protected final <H extends EventHandler> HandlerRef addHandler(H handler, String eventName) {
		return chartObject.addListener(eventName, handler);
	}

	protected native ChartObject createChartObject(Element container) /*-{
		return new $wnd.google.visualization.GeoChart(container);
	}-*/;

}
