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
package com.googlecode.gwt.charts.client.annotationchart;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;

import com.googlecode.gwt.charts.client.ChartObject;
import com.googlecode.gwt.charts.client.ChartWidget;
import com.googlecode.gwt.charts.client.DateRange;
import com.googlecode.gwt.charts.client.Selection;
import com.googlecode.gwt.charts.client.event.HandlerRef;
import com.googlecode.gwt.charts.client.event.RangeChangeHandler;
import com.googlecode.gwt.charts.client.event.ReadyHandler;
import com.googlecode.gwt.charts.client.event.SelectHandler;
import com.googlecode.gwt.charts.client.util.ArrayHelper;
import com.googlecode.gwt.charts.client.util.DateHelper;

import java.util.Date;

/**
 * Annotation charts are interactive time series line charts that support annotations.
 */
public class AnnotationChart extends ChartWidget<AnnotationChartOptions> {

	/**
	 * Creates a new chart widget.
	 */
	public AnnotationChart() {
		super();
	}

	/**
	 * Adds an handler that listens for range change events.
	 * 
	 * @param handler the class to call when the event is fired
	 * @return the handler reference
	 */
	public HandlerRef addRangeChangeHandler(RangeChangeHandler handler) {
		return addHandler(handler);
	}

	/**
	 * Adds an handler that listens for ready events.
	 * 
	 * @param handler the class to call when the event is fired
	 * @return the handler reference
	 */
	public HandlerRef addReadyHandler(ReadyHandler handler) {
		return addHandler(handler);
	}

	/**
	 * Adds an handler that listens for select events.
	 * 
	 * @param handler the class to call when the event is fired
	 * @return the handler reference
	 */
	public HandlerRef addSelectHandler(SelectHandler handler) {
		return addHandler(handler);
	}

	/**
	 * Returns an array of selected objects, each one describing a data element in the underlying table used to create
	 * the
	 * visualization (a DataView or a DataTable). Each object has properties row and/or column, with the index of the
	 * row and/or column of the selected item in the underlying DataTable. If the row property is null, then the
	 * selection is a column; if the column property is null, then the selection is a row; if both are non-null, then it
	 * is a specific data item. You can call the DataTable.getValue() method to get the value of the selected item. The
	 * retrieved array can be passed into setSelection().
	 * 
	 * @return an array of selected objects
	 */
	public JsArray<Selection> getSelection() {
		return chartObject.getSelection();
	}

	/**
	 * Returns an object with start and end properties, which each one of them is a Date object, representing the
	 * current time selection.
	 * 
	 * @return an object with start and end
	 */
	public final DateRange getVisibleChartRange() {
		return chartObject.getVisibleChartRange();
	}

	/**
	 * Hides the specified data series from the chart. Accepts one parameter which can be a number or an array of
	 * numbers, in which 0 refers to the first data series, and so on.
	 * 
	 * @param columnIndexes
	 */
	public void hideDataColumns(int... columnIndexes) {
		chartObject.hideDataColumns(ArrayHelper.createArray(columnIndexes));
	}

	/**
	 * Sets the visible range (zoom) to the specified range. Accepts two parameters of type Date that represent the
	 * first and last times of the wanted selected visible range.
	 * 
	 * @param start set to null to include everything from the earliest date to end
	 * @param end set to null to include everything from start to the last date
	 */
	public void setVisibleChartRange(Date start, Date end) {
		chartObject.setVisibleChartRange(DateHelper.getJsDate(start), DateHelper.getJsDate(end));
	}

	/**
	 * Shows the specified data series from the chart, after they were hidden using hideDataColumns method. Accepts one
	 * parameter which can be a number or an array of numbers, in which 0 refers to the first data series, and so on.
	 * 
	 * @param columnIndexes
	 */
	public void showDataColumns(int... columnIndexes) {
		chartObject.showDataColumns(ArrayHelper.createArray(columnIndexes));
	}

	@Override
	protected native ChartObject createChartObject(Element container) /*-{
		return new $wnd.google.visualization.AnnotationChart(container);
	}-*/;
}
