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
package com.googlecode.gwt.charts.client.treemap;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;

import com.googlecode.gwt.charts.client.ChartObject;
import com.googlecode.gwt.charts.client.ChartWidget;
import com.googlecode.gwt.charts.client.Selection;
import com.googlecode.gwt.charts.client.event.HandlerRef;
import com.googlecode.gwt.charts.client.event.OnMouseOutHandler;
import com.googlecode.gwt.charts.client.event.OnMouseOverHandler;
import com.googlecode.gwt.charts.client.event.ReadyHandler;
import com.googlecode.gwt.charts.client.event.RollUpHandler;
import com.googlecode.gwt.charts.client.event.SelectHandler;
import com.googlecode.gwt.charts.client.util.ArrayHelper;

/**
 * A visual representation of a data tree, where each node can have zero or more children, and one parent (except for
 * the root, which has no parents). Each node is displayed as a rectangle, sized and colored according to values that
 * you assign. Sizes and colors are valued relative to all other nodes in the graph. You can specify how many levels to
 * display simultaneously, and optionally to display deeper levels in a hinted fashion. If a node is a leaf node, you
 * can specify a size and color; if it is not a leaf, it will be displayed as a bounding box for leaf nodes. The default
 * behavior is to move down the tree when a user left-clicks a node, and to move back up the tree when a user
 * right-clicks the graph. <br>
 * The total size of the graph is determined by the size of the containing element that you insert in your page. If you
 * have leaf nodes with names too long to show, the name will be truncated with an ellipsis (...).
 */
public class TreeMap extends ChartWidget<TreeMapOptions> {
	private JsArray<Selection> selection;

	/**
	 * Creates a new chart widget.
	 */
	public TreeMap() {
		super();
	}

	/**
	 * Adds an handler that listens for mouse out events.
	 * 
	 * @param handler the class to call when the event is fired
	 * @return the handler reference
	 */
	public HandlerRef addOnMouseOutHandler(OnMouseOutHandler handler) {
		return addHandler(handler);
	}

	/**
	 * Adds an handler that listens for mouse over events.
	 * 
	 * @param handler the class to call when the event is fired
	 * @return the handler reference
	 */
	public HandlerRef addOnMouseOverHandler(OnMouseOverHandler handler) {
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
	 * Adds an handler that listens for rollup events.
	 * 
	 * @param handler the class to call when the event is fired
	 * @return the handler reference
	 */
	public HandlerRef addRollUpHandler(RollUpHandler handler) {
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
	 * Returns the maximum possible depth for the current view.
	 */
	public void getMaxPossibleDepth() {
		chartObject.getMaxPossibleDepth();
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
	 * Move up the tree by one level and redraw it. Does not throw an error if the node is the root node. This is fired
	 * automatically when the user right-clicks a node.
	 */
	public void goUpAndDraw() {
		chartObject.goUpAndDraw();
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
	public void setSelection(Selection... selection) {
		this.selection = ArrayHelper.createArray(selection);
		chartObject.setSelection(this.selection);
	}

	@Override
	protected native ChartObject createChartObject(Element container) /*-{
		return new $wnd.google.visualization.TreeMap(container);
	}-*/;

	@Override
	protected void redrawNow() {
		super.redrawNow();
		if (selection != null) {
			chartObject.setSelection(selection);
		}
	}
}
