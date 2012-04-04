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
package com.googlecode.gwt.charts.client.table;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Widget;

import com.googlecode.gwt.charts.client.ChartObject;
import com.googlecode.gwt.charts.client.DataSource;
import com.googlecode.gwt.charts.client.Selection;
import com.googlecode.gwt.charts.client.event.EventHandler;
import com.googlecode.gwt.charts.client.event.HandlerRef;
import com.googlecode.gwt.charts.client.event.PageEvent;
import com.googlecode.gwt.charts.client.event.PageHandler;
import com.googlecode.gwt.charts.client.event.ReadyEvent;
import com.googlecode.gwt.charts.client.event.ReadyHandler;
import com.googlecode.gwt.charts.client.event.SelectEvent;
import com.googlecode.gwt.charts.client.event.SelectHandler;
import com.googlecode.gwt.charts.client.event.SortEvent;
import com.googlecode.gwt.charts.client.event.SortHandler;

public class Table extends Widget {
	protected ChartObject chartObject;

	public Table() {
		super();
		Element chartDiv = DOM.createDiv();
		chartObject = createChartObject(chartDiv);
		setElement(chartDiv);
	}

	public final HandlerRef addPageHandler(PageHandler handler) {
		return addHandler(handler, PageEvent.NAME);
	}

	public final HandlerRef addReadyHandler(ReadyHandler handler) {
		return addHandler(handler, ReadyEvent.NAME);
	}

	public final HandlerRef addSelectHandler(SelectHandler handler) {
		return addHandler(handler, SelectEvent.NAME);
	}

	public final HandlerRef addSortHandler(SortHandler handler) {
		return addHandler(handler, SortEvent.NAME);
	}

	public final void clearChart() {
		chartObject.clearChart();
	}

	public final void draw(DataSource data) {
		chartObject.draw(data);
	}

	public final void draw(DataSource data, TableOptions options) {
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
		return new $wnd.google.visualization.Table(container);
	}-*/;

}
