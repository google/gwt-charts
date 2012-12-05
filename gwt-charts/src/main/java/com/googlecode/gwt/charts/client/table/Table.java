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

import com.googlecode.gwt.charts.client.ChartObject;
import com.googlecode.gwt.charts.client.ChartWidget;
import com.googlecode.gwt.charts.client.Selection;
import com.googlecode.gwt.charts.client.event.HandlerRef;
import com.googlecode.gwt.charts.client.event.PageHandler;
import com.googlecode.gwt.charts.client.event.ReadyHandler;
import com.googlecode.gwt.charts.client.event.SelectHandler;
import com.googlecode.gwt.charts.client.event.SortHandler;

public class Table extends ChartWidget<TableOptions> {
	protected ChartObject chartObject;

	public Table() {
		super();
	}

	public HandlerRef addPageHandler(PageHandler handler) {
		return addHandler(handler);
	}

	public HandlerRef addReadyHandler(ReadyHandler handler) {
		return addHandler(handler);
	}

	public HandlerRef addSelectHandler(SelectHandler handler) {
		return addHandler(handler);
	}

	public HandlerRef addSortHandler(SortHandler handler) {
		return addHandler(handler);
	}

	public JsArray<Selection> getSelection() {
		return chartObject.getSelection();
	}

	public void setSelection(JsArray<Selection> selection) {
		chartObject.setSelection(selection);
	}

	@Override
	protected native ChartObject createChartObject(Element container) /*-{
		return new $wnd.google.visualization.Table(container);
	}-*/;

}
