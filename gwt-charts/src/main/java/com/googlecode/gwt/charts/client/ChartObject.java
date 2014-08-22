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
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.core.client.JsDate;

import com.googlecode.gwt.charts.client.options.Options;

/**
 * Represents a generic chart javascript object with all common methods.
 * Each chart implementation adds their own specific methods.
 */
public class ChartObject extends HasListeners {

	protected ChartObject() {
	}

	/**
	 * Clears the chart, and releases all of its allocated resources.
	 */
	public final native void clearChart() /*-{
		this.clearChart();
	}-*/;

	/**
	 * Draws the visualization on the page. Behind the scenes this can be fetching a graphic from a server or creating
	 * the graphic on the page using the linked visualization code. You should call this method every time the data or
	 * options change. The object should be drawn inside the DOM element passed into the constructor.
	 * 
	 * @param data tipically a {@link DataTable} or {@link DataView} holding the data to use to draw the chart.
	 * @see <a href="http://developers.google.com/chart/interactive/docs/reference.html#visdraw">draw() API
	 *      reference</a>
	 */
	public final native void draw(DataSource data) /*-{
		this.draw(data);
	}-*/;

	/**
	 * Draws the visualization on the page. Behind the scenes this can be fetching a graphic from a server or creating
	 * the graphic on the page using the linked visualization code. You should call this method every time the data or
	 * options change. The object should be drawn inside the DOM element passed into the constructor.
	 * 
	 * @param data a {@link DataTable} or {@link DataView} holding the data to use to draw the chart.
	 * @param options A map of name/value pairs of custom options.
	 * @see <a href="http://developers.google.com/chart/interactive/docs/reference.html#visdraw">draw API reference</a>
	 */
	public final native void draw(DataSource data, Options options) /*-{
		this.draw(data, options);
	}-*/;

	/**
	 * Returns an object containing information about the onscreen placement of the chart and its elements.<br>
	 * Call this <strong>after</strong> the chart is drawn.
	 * 
	 * @return a ChartLayoutInterface
	 */
	public final native ChartLayoutInterface getChartLayoutInterface() /*-{
		return this.getChartLayoutInterface();
	}-*/;

	/**
	 * Currently only applies to {@link com.googlecode.gwt.charts.client.treemap.TreeMap}.<br>
	 * Returns the maximum possible depth for the current view.
	 * 
	 * @return the maximum possible depth
	 */
	public final native int getMaxPossibleDepth() /*-{
		this.getMaxPossibleDepth();
	}-*/;

	/**
	 * Returns the chart serialized as an image URI.<br>
	 * 
	 * Call this <strong>after</strong> the chart is drawn.
	 * 
	 * @return a serialized image URI
	 * @see <a href="https://developers.google.com/chart/interactive/docs/printing">Printing PNG Charts</a>
	 */
	public final native String getImageURI() /*-{
		return this.getImageURI();
	}-*/;

	/**
	 * This is optionally exposed by visualizations that want to let you access the currently selected data in the
	 * graphic.<br>
	 * Returns an array of selected objects, each one describing a data element in the underlying table used to create
	 * the visualization (a DataView or a DataTable). Each object has properties row and/or column, with the index of
	 * the row and/or column of the selected item in the underlying DataTable. If the row property is null, then the
	 * selection is a column; if the column property is null, then the selection is a row; if both are non-null, then it
	 * is a specific data item. You can call one of the {@link DataTable}.getValue() methods to get the value of the
	 * selected item. The retrieved array can be passed into {@link #setSelection(JsArray)}.
	 * 
	 * @return an array of selected objects
	 * @see <a href="http://developers.google.com/chart/interactive/docs/reference.html#visgetselection">getSelection
	 *      API reference</a>
	 */
	public final native JsArray<Selection> getSelection() /*-{
		return this.getSelection();
	}-*/;

	/**
	 * Currently only applies to {@link com.googlecode.gwt.charts.client.annotationchart.AnnotationChart}.<br>
	 * Returns an object with start and end properties, which each one of them is a Date object, representing the
	 * current time selection.
	 * 
	 * @return an object with start and end
	 */
	public final native DateRange getVisibleChartRange() /*-{
		return this.getVisibleChartRange();
	}-*/;

	/**
	 * Currently only applies to {@link com.googlecode.gwt.charts.client.treemap.TreeMap}.<br>
	 * Move up the tree by one level and redraw it. Does not throw an error if the node is the root node. This is fired
	 * automatically when the user right-clicks a node.
	 */
	public final native void goUpAndDraw() /*-{
		this.goUpAndDraw();
	}-*/;

	/**
	 * Currently only applies to {@link com.googlecode.gwt.charts.client.annotationchart.AnnotationChart}.<br>
	 * Hides the specified data series from the chart. Accepts one parameter which can be a number or an array of
	 * numbers, in which 0 refers to the first data series, and so on.
	 * 
	 * @param columnIndexes
	 */
	public final native void hideDataColumns(JsArrayInteger columnIndexes) /*-{
		this.hideDataColumns(columnIndexes);
	}-*/;

	/**
	 * Selects a data entry in the visualization—for example, a point in an area chart, or a bar in a bar chart. When
	 * this method is called, the visualization should visually indicate what the new selection is. The implementation
	 * of setSelection() should not fire a "select" event. Visualizations may ignore part of the selection. For example,
	 * a table that can show only selected rows may ignore cell or column elements in its setSelection() implementation,
	 * or it can select the entire row.
	 * 
	 * Every time this method is called, all selected items are deselected, and the new selection list passed in should
	 * be applied. There is no explicit way to deselect individual items; to deselect individual items, call
	 * setSelection() with the items to remain selected; to deselect all elements, call setSelection(),
	 * setSelection(null), or setSelection([]).
	 * 
	 * @param selection an array of objects, each with a numeric row and/or column property
	 * @see <a href="http://developers.google.com/chart/interactive/docs/reference.html#vissetselection">setSelection
	 *      API reference</a>
	 */
	public final native void setSelection(JsArray<Selection> selection) /*-{
		this.setSelection(selection);
	}-*/;

	/**
	 * Currently only applies to {@link com.googlecode.gwt.charts.client.annotationchart.AnnotationChart}.<br>
	 * Sets the visible range (zoom) to the specified range. Accepts two parameters of type Date that represent the
	 * first and last times of the wanted selected visible range.
	 * 
	 * @param start set to null to include everything from the earliest date to end
	 * @param end set to null to include everything from start to the last date
	 */
	public final native void setVisibleChartRange(JsDate start, JsDate end) /*-{
		this.setVisibleChartRange(start, end);
	}-*/;

	/**
	 * Currently only applies to {@link com.googlecode.gwt.charts.client.annotationchart.AnnotationChart}.<br>
	 * Shows the specified data series from the chart, after they were hidden using hideDataColumns method. Accepts one
	 * parameter which can be a number or an array of numbers, in which 0 refers to the first data series, and so on.
	 * 
	 * @param columnIndexes
	 */
	public final native void showDataColumns(JsArrayInteger columnIndexes) /*-{
		this.showDataColumns(columnIndexes);
	}-*/;

}
