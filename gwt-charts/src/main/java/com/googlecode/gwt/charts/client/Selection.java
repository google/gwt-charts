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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A representation of a selection in a chart.
 * Commonly defined by optional row/column values.
 */
public class Selection extends JavaScriptObject {
	/**
	 * Creates an empty selection.
	 * 
	 * @return a new Selection
	 */
	public static Selection create() {
		Selection selection = createObject().cast();
		return selection;
	}

	/**
	 * Creates a new selection with row and column selection.
	 * 
	 * @param row the row index
	 * @param column the column index
	 * @return a new Selection
	 */
	public static Selection create(Integer row, Integer column) {
		Selection selection = createObject().cast();
		if (row == null) {
			selection.clearRow();
		} else {
			selection.setRow(row);
		}
		if (column == null) {
			selection.clearColumn();
		} else {
			selection.setColumn(column);
		}
		return selection;
	}

	protected Selection() {
	}

	/**
	 * Clears the column index for this selection.
	 */
	public final native void clearColumn() /*-{
		this.column = null;
	}-*/;

	/**
	 * Clears the row index for this selection.
	 */
	public final native void clearRow() /*-{
		this.row = null;
	}-*/;

	/**
	 * Returns the column index for this selection.
	 * 
	 * @return the column index
	 */
	public final native Integer getColumn() /*-{
		return this.column != null ? @java.lang.Integer::valueOf(I)(this.column) : null;
	}-*/;

	/**
	 * Returns the row index for this selection.
	 * 
	 * @return the row index
	 */
	public final native Integer getRow() /*-{
		return this.row != null ? @java.lang.Integer::valueOf(I)(this.row) : null;
	}-*/;

	/**
	 * Sets the column index for this selection.
	 * 
	 * @param column the column index
	 */
	public final native void setColumn(int column) /*-{
		this.column = column;
	}-*/;

	/**
	 * Sets the row index for this selection.
	 * 
	 * @param row the column index
	 */
	public final native void setRow(int row) /*-{
		this.row = row;
	}-*/;
}
