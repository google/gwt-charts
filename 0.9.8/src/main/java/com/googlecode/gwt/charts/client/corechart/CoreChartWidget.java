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
package com.googlecode.gwt.charts.client.corechart;

import com.google.gwt.core.client.JsArray;

import com.googlecode.gwt.charts.client.ChartWidget;
import com.googlecode.gwt.charts.client.Selection;
import com.googlecode.gwt.charts.client.event.AnimationFinishHandler;
import com.googlecode.gwt.charts.client.event.ErrorHandler;
import com.googlecode.gwt.charts.client.event.HandlerRef;
import com.googlecode.gwt.charts.client.event.OnMouseOutHandler;
import com.googlecode.gwt.charts.client.event.OnMouseOverHandler;
import com.googlecode.gwt.charts.client.event.ReadyHandler;
import com.googlecode.gwt.charts.client.event.SelectHandler;
import com.googlecode.gwt.charts.client.options.Options;

public abstract class CoreChartWidget<T extends Options> extends ChartWidget<T> {
	private JsArray<Selection> selection;

	public CoreChartWidget() {
		super();
	}

	public final HandlerRef addAnimationFinishHandler(AnimationFinishHandler handler) {
		return addHandler(handler);
	}

	public final HandlerRef addErrorHandler(ErrorHandler handler) {
		return addHandler(handler);
	}

	public final HandlerRef addOnMouseOutHandler(OnMouseOutHandler handler) {
		return addHandler(handler);
	}

	public final HandlerRef addOnMouseOverHandler(OnMouseOverHandler handler) {
		return addHandler(handler);
	}

	public final HandlerRef addReadyHandler(ReadyHandler handler) {
		return addHandler(handler);
	}

	public final HandlerRef addSelectHandler(SelectHandler handler) {
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
	public final JsArray<Selection> getSelection() {
		return chartObject.getSelection();
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
	public final void setSelection(JsArray<Selection> selection) {
		this.selection = selection;
		chartObject.setSelection(selection);
	}

	@Override
	protected void recreate() {
		super.recreate();
		if (selection != null) {
			chartObject.setSelection(selection);
		}
	}

}
