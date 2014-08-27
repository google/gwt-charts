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

/**
 * A table that can be sorted and paged. Table cells can be formatted using format strings, or by directly inserting
 * HTML as cell values. Numeric values are right-aligned; boolean values are displayed as check marks. Users can select
 * single rows either with the keyboard or the mouse. Users can sort rows by clicking on column headers. The header row
 * remains fixed as the user scrolls. The table fires a number of events corresponding to user interaction.
 */
public class Table extends ChartWidget<TableOptions> {
	private JsArray<Selection> selection;

	/**
	 * Creates a new chart widget.
	 */
	public Table() {
		super();
	}

	/**
	 * Adds an handler that listens for page events
	 * 
	 * @param handler the class to call when the event is fired
	 * @return the handler reference
	 */
	public HandlerRef addPageHandler(PageHandler handler) {
		return addHandler(handler);
	}

	/**
	 * Adds an handler that listens for ready events
	 * 
	 * @param handler the class to call when the event is fired
	 * @return the handler reference
	 */
	public HandlerRef addReadyHandler(ReadyHandler handler) {
		return addHandler(handler);
	}

	/**
	 * Adds an handler that listens for select events
	 * 
	 * @param handler the class to call when the event is fired
	 * @return the handler reference
	 */
	public HandlerRef addSelectHandler(SelectHandler handler) {
		return addHandler(handler);
	}

	/**
	 * Adds an handler that listens for sort events
	 * 
	 * @param handler the class to call when the event is fired
	 * @return the handler reference
	 */
	public HandlerRef addSortHandler(SortHandler handler) {
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
	 * Call this method to retrieve information about the current sort state of a table that has been sorted (typically
	 * by the user, who has clicked on a column heading to sort the rows by a specific column). If you have disabled
	 * sorting, this method will not work.
	 * 
	 * If you have not sorted data in code, or the user has not sorted data by selecting code, the default sort values
	 * will be returned.
	 * 
	 * @return information about the current sort state
	 */
	public TableSortInfo getSortInfo() {
		return chartObject.getSortInfo();
	}

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
	 * @param selection
	 */
	public void setSelection(JsArray<Selection> selection) {
		this.selection = selection;
		chartObject.setSelection(selection);
	}

	@Override
	protected native ChartObject createChartObject(Element container) /*-{
		return new $wnd.google.visualization.Table(container);
	}-*/;

	@Override
	protected void redrawNow() {
		super.redrawNow();
		if (selection != null) {
			chartObject.setSelection(selection);
		}
	}
}
