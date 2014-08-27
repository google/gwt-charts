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

import com.google.gwt.core.client.JsArrayInteger;

import com.googlecode.gwt.charts.client.options.Options;

/**
 * Table current sorting information.
 */
public class TableSortInfo extends Options {
	/**
	 * Default constructor
	 * 
	 * @return a new object instance
	 */
	public static TableSortInfo create() {
		return createObject().cast();
	}

	protected TableSortInfo() {
	}

	/**
	 * Index of the column by which the table is sorted.
	 * 
	 * @return index of the column by which the table is sorted.
	 */
	public final native int getColumn() /*-{
		return this.column;
	}-*/;

	/**
	 * True if the sort is ascending, false if descending.
	 * 
	 * @return true if the sort is ascending, false if descending.
	 */
	public final native boolean getAscending() /*-{
		return this.ascending;
	}-*/;

	/**
	 * Array of numbers, where the index in the array is the row number as sorted (in the visible table), and the value
	 * is the index of that row in the underlying (unsorted) data table.
	 * 
	 * @return array of index
	 */
	public final native JsArrayInteger getSortedIndexes() /*-{
		return this.sortedIndexes;
	}-*/;
}
