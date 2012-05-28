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
 * Represents an object for sorting a DataTable.
 */
public class SortColumn extends JavaScriptObject {
	/**
	 * Creates a new SortColumn by specifing the column index.
	 * @param column the column index to sort
	 * 
	 * @return a new object instance
	 */
	public static SortColumn create(int column) {
		SortColumn dataColumn = createObject().cast();
		dataColumn.setColumn(column);
		return dataColumn;
	}

	protected SortColumn() {
	}

	/**
	 * Sets the number of the column index to sort by.
	 * 
	 * @param column the number of the column index to sort by
	 */
	public final native void setColumn(int column) /*-{
		this.column = column;
	}-*/;

	/**
	 * Sets sorting order. If set to true, the specific column will be sorted in descending order; otherwise,
	 * sorting is in ascending order.
	 * 
	 * @param desc is in descending order
	 */
	public final native void setDesc(boolean desc) /*-{
		this.desc = desc;
	}-*/;

}
